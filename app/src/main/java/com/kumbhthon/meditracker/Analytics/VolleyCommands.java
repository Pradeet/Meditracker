package com.kumbhthon.meditracker.Analytics;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.kumbhthon.meditracker.Utils.Constants;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pradeet on 22-Aug-15.
 */
public class VolleyCommands {
    Context context;
    SharedPreferences settings;

    String Name = "";
    String Number1 = "";
    String Number2 = "";

    public VolleyCommands(Context context) {
        this.context = context;
        settings = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        Name = settings.getString(Constants.USER_NAME_PREF, "----");
        Number1 = settings.getString(Constants.USER_MOBILE_NUM_1_PREF, "----");
        Number2 = settings.getString(Constants.USER_MOBILE_NUM_2_PREF, "----");

    }

    public void POSTUser() {
        final String URL = Constants.BASEURL + "/user";

        HashMap<String, String> params = new HashMap<String, String>();
        String currentDateTimeString = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        params.put("u_phonenumber", Number1);
        params.put("u_alternatephonenumber", Number2);
        params.put("u_registrationtime", "" + currentDateTimeString);

        JsonObjectRequest request = new JsonObjectRequest(URL, new JSONObject(params),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println("Response: " + response);
                        setPrefs(Constants.REGISTER_PENDING_BIT_PREF, false);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> params = new HashMap<String, String>();
                String creds = String.format("%s:%s", Constants.API_USERNAME, Constants.API_PASSWD);
                String auth = "Basic " + Base64.encodeToString(creds.getBytes(), Base64.DEFAULT);
                params.put("Authorization", auth);
                return params;
            }
        };
        AppController.getInstance().addToRequestQueue(request);
    }

    public void POSTAction(ArrayList<ActionDetails> actionQueue){
        final String URL = Constants.BASEURL + "/action";
        JSONArray jsonArray = new JSONArray();

        HashMap<String, String> params = new HashMap<>();
        for (int i = 0; i < actionQueue.size(); i++) {
            ActionDetails details = actionQueue.get(i);
            params.put("a_phonenumber", details.action_PhoneNumber);
            params.put("a_type", details.action_Type);
            params.put("a_timestamp", details.action_Time);
            params.put("a_metadata", details.action_data);
            params.put("a_longitude", details.action_Longitude);
            params.put("a_latitude", details.action_Latitude);
            params.put("a_extradata", details.action_extraData);
            jsonArray.put(new JSONObject(params));
            params.clear();
        }
        actionQueue.clear();
        makeRequest(URL, jsonArray);
    }

    private void makeRequest(final String URL, JSONArray jsonArray) {
        Response.Listener<JSONArray> jsonArrayListener = new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                System.out.println(response);
                //set pending to flask once sent successfully
                if (URL.contains("action")) {
                    setPrefs(Constants.ACTION_PENDING_BIT_PREF, false);
                    //clear the arraylist
                    new ServerLoader(context).clearActionPrefs();
                }
            }
        };
        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        };
        JsonArrayRequest reqarray = new JsonArrayRequest(URL, jsonArray, jsonArrayListener, errorListener) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> params = new HashMap<String, String>();
                String creds = String.format("%s:%s", Constants.API_USERNAME, Constants.API_PASSWD);
                String auth = "Basic " + Base64.encodeToString(creds.getBytes(), Base64.DEFAULT);
                params.put("Authorization", auth);
                return params;
            }
        };
        AppController.getInstance().addToRequestQueue(reqarray);
    }

    private void setPrefs(String PREF_NAME, boolean b) {
        SharedPreferences prefs = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putBoolean(PREF_NAME, b);
        editor.commit();
    }
}
