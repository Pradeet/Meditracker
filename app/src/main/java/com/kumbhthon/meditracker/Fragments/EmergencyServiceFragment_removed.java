package com.kumbhthon.meditracker.Fragments;


import android.content.SharedPreferences;
import android.net.Uri;
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

import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.R;
import com.kumbhthon.meditracker.Utils.Constants;

@SuppressLint("NewApi")
public class EmergencyServiceFragment_removed extends Fragment {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.new_emegegency_no, container, false);

        b1 = (Button) rootView.findViewById(R.id.govt);
        b2 = (Button) rootView.findViewById(R.id.got_district_hosp);
        b3 = (Button) rootView.findViewById(R.id.nmc);
        b4 = (Button) rootView.findViewById(R.id.red_cros);
        b5 = (Button) rootView.findViewById(R.id.esi_hosp);
        b6 = (Button) rootView.findViewById(R.id.shivsena);
        b7 = (Button) rootView.findViewById(R.id.ips);
        b8 = (Button) rootView.findViewById(R.id.rajdut);
        b9 = (Button) rootView.findViewById(R.id.contomnet);
        b10 = (Button) rootView.findViewById(R.id.jayram);
        b11 = (Button) rootView.findViewById(R.id.aparn);
        b12 = (Button) rootView.findViewById(R.id.bahujan);
        b13 = (Button) rootView.findViewById(R.id.vison);
        b14 = (Button) rootView.findViewById(R.id.sitabai);
        b15 = (Button) rootView.findViewById(R.id.dr_vincurkar);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String data = b1.getText().toString();
                data = data + ":" + "108";
                addCallAction(data);
                new ServerLoader(getActivity().getApplicationContext()).sendToServer();
//                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
//                phoneIntent.setData(Uri.parse("tel:108"));
//                startActivity(phoneIntent);
            }


        });
        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b2.getText().toString();
                data = data + ":" + "02532576106";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532576106"));
                startActivity(phoneIntent);
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b3.getText().toString();
                data = data + ":" + "102";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:102"));
                startActivity(phoneIntent);
            }
        });

        b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b4.getText().toString();
                data = data + ":" + "02532504926";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532504926"));
                startActivity(phoneIntent);
                ;


            }
        });
        b5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b5.getText().toString();
                data = data + ":" + "02532351045";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532351045"));
                startActivity(phoneIntent);
                ;


            }
        });
        b6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b6.getText().toString();
                data = data + ":" + "02532511313";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532511313"));
                startActivity(phoneIntent);
            }
        });


        b7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b7.getText().toString();
                data = data + ":" + "02532463721";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532463721"));
                startActivity(phoneIntent);
            }
        });

        b8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b2.getText().toString();
                data = data + ":" + "02532576106";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532573525"));
                startActivity(phoneIntent);
                ;


            }
        });

        b9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b9.getText().toString();
                data = data + ":" + "02532491377";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532491377"));
                startActivity(phoneIntent);
                ;


            }
        });

        b10.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b10.getText().toString();
                data = data + ":" + "02532463414";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532463414"));
                startActivity(phoneIntent);
                ;


            }
        });
        b11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b11.getText().toString();
                data = data + ":" + "02532575516";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532575516"));
                startActivity(phoneIntent);
                ;


            }
        });

        b12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b12.getText().toString();
                data = data + ":" + "02532463442";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532463442"));
                startActivity(phoneIntent);
                ;


            }
        });
        b13.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b13.getText().toString();
                data = data + ":" + "02532581111";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532581111"));
                startActivity(phoneIntent);
                ;


            }
        });
        b14.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b14.getText().toString();
                data = data + ":" + "02532392491";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532392491"));
                startActivity(phoneIntent);
                ;


            }
        });
        b15.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                String data = b15.getText().toString();
                data = data + ":" + "02532501021";
                addCallAction(data);
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:02532501021"));
                startActivity(phoneIntent);
            }
        });
        return rootView;
    }

    private void addCallAction(String data) {
        SharedPreferences prefs = getActivity().getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        new ServerLoader(getActivity().getApplicationContext())
                .addActionDetails(prefs.getString(Constants.USER_MOBILE_NUM_1_PREF, "----"), Constants.TYPE_CALL, data, "");
    }
}