package com.kumbhthon.meditracker;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class HospitalLocatorActivity extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_locator);

//        btn_mp1 = (Button) findViewById(R.id.hospitalButton);
//        btn_mp2 = (Button) findViewById(R.id.MedicalStoreButton);
//        btn_mp3 = (Button) findViewById(R.id.kumbhHospitalButton);
//        // btn_mp.setOnClickListener(getActivity());*/
//
//        btn_mp1.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//
//                gps = new GPSTracker(HospitalLocatorActivity.this);
//                if (gps.canGetLocation()) {
//                    sendLocatorAction("Hospital");
//                    Intent i = new Intent(HospitalLocatorActivity.this, MapActivity.class);
//                    startActivity(i);
//                } else {
//
//                    gps.showSettingsAlert();
//                }
//
//            }
//        });
//        btn_mp2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                gps = new GPSTracker(HospitalLocatorActivity.this);
//                if (gps.canGetLocation()) {
//                    sendLocatorAction("Medical Store");
//                    Intent i = new Intent(HospitalLocatorActivity.this, Medical_map.class);
//                    startActivity(i);
//                } else {
//                    gps.showSettingsAlert();
//                }
//
//            }
//        });
//        btn_mp3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gps = new GPSTracker(HospitalLocatorActivity.this);
//                if (gps.canGetLocation()) {
//                    sendLocatorAction("Kumbh Store");
//                    Intent i = new Intent(HospitalLocatorActivity.this, Route_wise_hospital.class);
//                    startActivity(i);
//                } else {
//                    gps.showSettingsAlert();
//                }
//            }
//        });

        TabHost tabHost = getTabHost();

        TabSpec spec1 = tabHost.newTabSpec("Tab1");
        spec1.setIndicator("Hospital", getResources().getDrawable(R.mipmap.hospital_1));
        Intent intent1 = new Intent(getApplicationContext(), MapActivity.class);
        spec1.setContent(intent1);


        TabSpec spec2 = tabHost.newTabSpec("Tab2");
        spec2.setIndicator("Medical Store", getResources().getDrawable(R.mipmap.medical_1));
        Intent intent2 = new Intent(getApplicationContext(), Medical_map.class);
        spec2.setContent(intent2);


        TabSpec spec3 = tabHost.newTabSpec("Tab3");
        spec3.setIndicator("Kumbh Hospital", getResources().getDrawable(R.mipmap.hospital_1));
        Intent intent3 = new Intent(getApplicationContext(), Route_wise_hospital.class);
        spec3.setContent(intent3);

        // Adding all TabSpec to TabHost
        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
    }


}
