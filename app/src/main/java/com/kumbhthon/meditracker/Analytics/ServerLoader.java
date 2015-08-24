package com.kumbhthon.meditracker.Analytics;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.kumbhthon.meditracker.Utils.Constants;
import com.kumbhthon.meditracker.Utils.GPS.LocationTracker;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ServerLoader {

    private final Context context;
    private ArrayList<ActionDetails> ActionQueue;

    public ServerLoader(Context context) {
        this.context = context;
        ActionQueue = getActionPrefs();
    }

    private ArrayList<ActionDetails> getActionPrefs() {
        SharedPreferences prefs = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        ArrayList<ActionDetails> ActionQueue = new ArrayList<>();

        if (prefs.contains(Constants.USER_ACTIONS_PREF)) {
            String jsonFavorites = prefs.getString(Constants.USER_ACTIONS_PREF, "----");
            try {
                JSONArray jsonArray = new JSONArray(jsonFavorites);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    ActionDetails actionDetails = new ActionDetails(jsonObject.getString("action_PhoneNumber"),
                            jsonObject.getString("action_Time"),
                            jsonObject.getString("action_Type"),
                            jsonObject.getString("action_data"),
                            jsonObject.getString("action_Longitude"),
                            jsonObject.getString("action_Latitude"),
                            jsonObject.getString("action_extraData"));
                    ActionQueue.add(actionDetails);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return ActionQueue;
    }

    private void setActionPrefs(ArrayList<ActionDetails> actionPrefs) {
        SharedPreferences prefs = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = prefs.edit();

        Gson gson = new Gson();
        String json = gson.toJson(actionPrefs);

        edit.putString(Constants.USER_ACTIONS_PREF, json);
        edit.commit();
    }

    public void clearActionPrefs() {
        SharedPreferences prefs = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = prefs.edit();

        ArrayList<ActionDetails> empty = new ArrayList<>();
        Gson gson = new Gson();
        String json = gson.toJson(empty);

        edit.putString(Constants.USER_ACTIONS_PREF, json);
        edit.commit();
    }

    public void addActionDetails(String action_PhoneNumber, String action_Type, String action_data, String action_extradata) {
        String timedate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        LocationTracker locationTracker = new LocationTracker(context);
        String Longitude = locationTracker.getLongitude() + "";
        String Latitude = locationTracker.getLatitude() + "";
        ActionDetails actionDetails = new ActionDetails(action_PhoneNumber, timedate, action_Type, action_data, Longitude, Latitude, action_extradata);

        ArrayList<ActionDetails> ActionQueue = getActionPrefs();
        ActionQueue.add(actionDetails);
        setActionPrefs(ActionQueue);

        SharedPreferences prefs = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(Constants.ACTION_PENDING_BIT_PREF, true);
        editor.commit();
    }

    public void sendToServer() {

        SharedPreferences prefs = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);

        ActionQueue = getActionPrefs();
        VolleyCommands volleyCommands = new VolleyCommands(context);
        if (prefs.getBoolean(Constants.ACTION_PENDING_BIT_PREF, true))
            volleyCommands.POSTAction(ActionQueue);
        if (prefs.getBoolean(Constants.REGISTER_PENDING_BIT_PREF, true))
            volleyCommands.POSTUser();
    }
}