package com.kumbhthon.meditracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.util.Log;

import com.kumbhthon.meditracker.Utils.SharedPreferenceManager;

import java.util.ArrayList;
import java.util.Date;

public class TransperentActivity extends ActionBarActivity {
    private SharedPreferenceManager sharedPref;
    String mssgPhone, message, locationString = "";

    SharedPreferences sharedPrefs;
    String lat, lon, add, pinCode;
    String no2 = "108", hisNum, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPref = new SharedPreferenceManager(this);
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPref.connectDB();
        sharedPref.setBoolean("help", true);
        sharedPref.closeDB();

        sharedPref.connectDB();
        mssgPhone = sharedPref.getString("smsNumber");
        lat = sharedPref.getString("lat");
        lon = sharedPref.getString("long");
        add = sharedPref.getString("add");
        pinCode = sharedPref.getString("pin");
        sharedPref.closeDB();

        message = "Need Help...";

        System.out.println("Pin Code" + pinCode);

        mssgPhone = "";

        for (int i = 0; i <= MapActivity.address.length; i++) {
            if (MapActivity.address[i].contains(pinCode)) {
                no2 = "108";
                break;
            } else {
                no2 = "108";
            }
        }

        callHelp(String.valueOf(no2));

        makeCallHelp(no2);
    }

    private void callHelp(final String number) {
        new Thread() {
            public void run() {
                locationString = message +
                        "\nMy Name : " + name + "(" + hisNum + ")" +
                        "\nLatitude : " + lat +
                        "\nLongitude: " + lon +
                        "\nAddress : " + add +
                        "\nPin: " + pinCode +
                        "\nMap link: http://maps.google.com/maps?f=q&geocode=&ll=" + lat + "," + lon +
                        "\nTime :" + new Date() +
                        "\nThis Message sent by MediTracker";

                System.out.println("ADRESS " + add);
                System.out.println("sms " + locationString);

                if (!number.equals("")) {
                    SmsManager sms = SmsManager.getDefault();
                    ArrayList<String> parts = sms.divideMessage(locationString);
                    Log.d("Debug", locationString);
                    sms.sendMultipartTextMessage(number, null, parts, null, null);


                }
            }

        }.start();
    }

    private void makeCallHelp(final String number) {
        if (!number.equals("")) {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + number));
            TransperentActivity.this.startActivity(callIntent);
            finish();
        }
    }


    protected void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }


}
