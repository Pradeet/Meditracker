package com.kumbhthon.meditracker;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.Utils.Constants;

public class FirstAidActivity extends TabActivity {
//public class FirstAidActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);

//        btn_mp1 = (Button) findViewById(R.id.Hindi);
//        btn_mp2 = (Button) findViewById(R.id.English);
//        btn_mp3 = (Button) findViewById(R.id.Marathi);
//
//        btn_mp1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent i = new Intent(FirstAidActivity.this, FirstAidActivity_Hindi.class);
//                sendFirstAidAction(btn_mp1.getText().toString());
//                startActivity(i);
//
//            }
//        });
//        btn_mp2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent i = new Intent(FirstAidActivity.this, FirstAidActivity_English.class);
//                sendFirstAidAction(btn_mp2.getText().toString());
//                startActivity(i);
//
//            }
//        });
//
//        btn_mp3.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent i = new Intent(FirstAidActivity.this, FirstAidActivity_Marathi.class);
//                sendFirstAidAction(btn_mp2.getText().toString());
//                startActivity(i);
//
//            }
//        });

//        toolbar = (Toolbar) findViewById(R.id.first_aid_activity_tool_bar);
//        toolbar.setTitle("First Aid");
//        toolbar.setTitleTextColor(android.R.color.white);
//
//        setSupportActionBar(toolbar);
        TabHost tabHost = getTabHost();
//        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);


        TabHost.TabSpec spec1 = tabHost.newTabSpec("Tab1");

        spec1.setIndicator("English", getResources().getDrawable(R.mipmap.hospital_1));
        Intent intent1 = new Intent(getApplicationContext(), FirstAidActivity_English.class);
        spec1.setContent(intent1);


        TabHost.TabSpec spec2 = tabHost.newTabSpec("Tab2");
        spec2.setIndicator("हिंदी", getResources().getDrawable(R.mipmap.medical_1));
        Intent intent2 = new Intent(getApplicationContext(), FirstAidActivity_Hindi.class);
        spec2.setContent(intent2);


        TabHost.TabSpec spec3 = tabHost.newTabSpec("Tab3");
        spec3.setIndicator("मराठी", getResources().getDrawable(R.mipmap.hospital_1));
        Intent intent3 = new Intent(getApplicationContext(), FirstAidActivity_Marathi.class);
        spec3.setContent(intent3);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);

    }


}
