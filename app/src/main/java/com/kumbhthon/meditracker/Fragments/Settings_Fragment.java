package com.kumbhthon.meditracker.Fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kumbhthon.meditracker.Analytics.VolleyCommands;
import com.kumbhthon.meditracker.HomeScreenActivity;
import com.kumbhthon.meditracker.R;
import com.kumbhthon.meditracker.Utils.Constants;

@SuppressLint("NewApi")
public class Settings_Fragment extends Fragment implements OnClickListener {
    Button bsave;
    EditText nm, n1, n2;
    String Name, Number1, Number2;

    SharedPreferences prefs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings_fragment, container, false);

        bsave = (Button) rootView.findViewById(R.id.btn_save);
        bsave.setOnClickListener(this);
        nm = (EditText) rootView.findViewById(R.id.edttxt_name);
        n1 = (EditText) rootView.findViewById(R.id.edttxt_no1);
        n2 = (EditText) rootView.findViewById(R.id.edttxt_no2);
        prefs = getActivity().getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        nm.setText(prefs.getString(Constants.USER_NAME_PREF, "----"));
        n1.setText(prefs.getString(Constants.USER_MOBILE_NUM_1_PREF, "----"));
        n2.setText(prefs.getString(Constants.USER_MOBILE_NUM_2_PREF, "----"));

        return rootView;
    }

    @Override
    public void onClick(View view) {
        if (view == bsave) {

            if (validation()) {
                SharedPreferences.Editor edit = prefs.edit();
                edit.putBoolean(Constants.RESGISTRATION_STATUS_PREF, true);

                edit.putString(Constants.USER_NAME_PREF, Name);
                edit.putString(Constants.USER_MOBILE_NUM_1_PREF, Number1);
                edit.putString(Constants.USER_MOBILE_NUM_2_PREF, Number2);
                edit.commit();

                sendRegistrationDetails();
                Intent i1 = new Intent(getActivity().getApplicationContext(), HomeScreenActivity.class);
                startActivity(i1);
            } else {
                Toast.makeText(getActivity().getApplicationContext(), "Please enter proper details", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void sendRegistrationDetails() {
        SharedPreferences prefs = getActivity().getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        VolleyCommands volleyCommands = new VolleyCommands(getActivity().getApplicationContext());
        volleyCommands.POSTUser();
    }

    private boolean validation() {
        Name = nm.getText().toString();
        Number1 = n1.getText().toString();
        Number2 = n1.getText().toString();
        if (Name.length() <= 0) {
            nm.setError("Name is Mandatory");
            return false;
        } else if (Number1.length() <= 0) {
            n1.setError("Mobile number is mandatory");
            return false;
        } else if (Number1.length() != 10) {
            n1.setError("Mobile number should be of 10 digits");
            return false;
        } else if (Number2.length() <= 0) {
            n2.setError("Mobile number is mandatory");
            return false;
        } else if (Number2.length() != 10) {
            n2.setError("Mobile number should be of 10 digits");
            return false;
        } else {
            return true;
        }
    }
}