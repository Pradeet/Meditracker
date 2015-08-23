package com.kumbhthon.meditracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kumbhthon.meditracker.Analytics.VolleyCommands;
import com.kumbhthon.meditracker.Utils.Constants;

public class RegistrationActivity extends ActionBarActivity implements OnClickListener {

    Button btn1;
    EditText t1, t2, t3;
    String Name, Number1, Number2;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        context = RegistrationActivity.this;
        t1 = (EditText) findViewById(R.id.editTxt_Name);
        t2 = (EditText) findViewById(R.id.editTxt_no1);
        t3 = (EditText) findViewById(R.id.editTxt_no2);
        btn1 = (Button) findViewById(R.id.btn_submit);
        btn1.setOnClickListener(this);

        TelephonyManager tMgr = (TelephonyManager) getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);
        String mPhoneNumber = tMgr.getLine1Number();
        t2.setText(mPhoneNumber);
    }

    public void onClick(View vw) {
        if (vw == btn1) {

            if (checkValidation()) {

                SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
                Editor edit = sharedPreferences.edit();
                edit.putBoolean(Constants.RESGISTRATION_STATUS_PREF, true);

                Name = t1.getText().toString();
                Number1 = t2.getText().toString();
                Number2 = t3.getText().toString();

                edit.putString(Constants.USER_NAME_PREF, Name);
                edit.putString(Constants.USER_MOBILE_NUM_1_PREF, Number1);
                edit.putString(Constants.USER_MOBILE_NUM_2_PREF, Number2);
                edit.commit();

                sendRegistrationDetails();
                Intent intent = new Intent(getBaseContext(), HomeScreenActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(getApplicationContext(), "Please enter proper details", Toast.LENGTH_SHORT).show();

            }

        }

    }

    private void sendRegistrationDetails() {
        SharedPreferences prefs = context.getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        if (prefs.getBoolean(Constants.REGISTER_PENDING_BIT_PREF, true)) {
            VolleyCommands volleyCommands = new VolleyCommands(getApplicationContext());
            volleyCommands.POSTUser();
        }
    }

    public boolean checkValidation() {
        Name = t1.getText().toString();
        Number1 = t2.getText().toString();
        Number2 = t3.getText().toString();
        if (Name.length() <= 2) {
            t1.setError("Name is mandatory");
            return false;
        } else if (Number1.length() <= 0) {
            t2.setError("Mobile number is mandatory");
            return false;
        } else if (Number1.length() < 10) {
            t2.setError("Mobile number should be of 10 digits");
            return false;
        } else if (Number2.length() <= 0) {
            t3.setError("Mobile number is mandatory");
            return false;
        } else if (Number2.length() < 10) {
            t3.setError("Mobile number should be of 10 digits");
            return false;
        } else {
            return true;
        }
    }
}
