package com.kumbhthon.meditracker;


import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

import com.kumbhthon.meditracker.Utils.Constants;

/**
 * This class is used to display spalshscreen and navigate to
 * setting screen or home accordingly
 *
 * @author admin-pc
 */
public class SplashscreenActivity extends Activity {

    Boolean bRegister_success = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        SharedPreferences sharedPreferences = getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        bRegister_success = sharedPreferences.getBoolean(Constants.RESGISTRATION_STATUS_PREF, false);

        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    int logoTimer = 0;
                    while (logoTimer < 2000) {
                        sleep(100);
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        logoTimer = logoTimer + 100;

                    }
                    ;
                    if (bRegister_success) {
                        Intent i = new Intent(SplashscreenActivity.this, HomeScreenActivity.class);
                        startActivity(i);
                    } else {
                        Intent i = new Intent(getBaseContext(), RegistrationActivity.class);
                        startActivity(i);

                    }
                } catch (InterruptedException e) {
                } finally {

                    finish();


                }
            }
        };

        logoTimer.start();
    }

}