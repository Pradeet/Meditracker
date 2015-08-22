package com.kumbhthon.meditracker.Fragments;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.kumbhthon.meditracker.HomeScreenActivity;
import com.kumbhthon.meditracker.MapActivity;
import com.kumbhthon.meditracker.Medical_map;
import com.kumbhthon.meditracker.R;
import com.kumbhthon.meditracker.Utils.GPS.GPSTracker;

@SuppressLint("NewApi")
public class HelpMap_Fragment extends Fragment {
    Button btn_mp1, btn_mp2;
    Context cntx;
    GPSTracker gps;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.helpmap_fragment, container, false);
        //cntx=getActivity();
        btn_mp1 = (Button) rootView.findViewById(R.id.button1);
        btn_mp2 = (Button) rootView.findViewById(R.id.Button01);
        // btn_mp.setOnClickListener(getActivity());*/

        btn_mp1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                gps = new GPSTracker(getActivity());
                if (gps.canGetLocation()) {

                    Intent i = new Intent(HomeScreenActivity.context, MapActivity.class);
                    //Intent i=new Intent()
                    startActivity(i);
                } else {
                    gps.showSettingsAlert();
                }

            }
        });
        btn_mp2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                gps = new GPSTracker(getActivity());
                if (gps.canGetLocation()) {
                    Intent i = new Intent(HomeScreenActivity.context, Medical_map.class);
                    //Intent i=new Intent()
                    startActivity(i);
                } else {
                    gps.showSettingsAlert();
                }

            }
        });

        return rootView;
    }
}