package com.kumbhthon.meditracker.Fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;
import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.FirstAidActivity;
import com.kumbhthon.meditracker.HospitalLocatorActivity;
import com.kumbhthon.meditracker.R;
import com.kumbhthon.meditracker.Utils.Constants;

@SuppressLint("NewApi")
public class Emeregency_service extends Fragment {
    Button EmergencyButton;
    Button FirstAidButton;
    Button HospitalLocatorButton;

    public Emeregency_service() {

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.emerengency_service, container, false);

        final String[] emergency_numbers_array = {"108", "Government District Hospital", "Nashik MunicipalCorporation", "Redcros Mahatma Gandhiroad", "E.S.I. Hopsital,Satpur", "Shivsena Mhahanagar", "IPS Note Press,Nashik Road", "Rajdut Mitramandal", "Cantonment Board,Devlali Camp", "Jayram Hospital, Nashik Road", "Aparn Trust", "Bahujan yua Sanghatna,Nashk Road", "Vision Hospital", "Sitabai More Hospital,Cidco", "Dr. Vinchurkar,Trimbak Naka"};

        EmergencyButton = (Button) rootView.findViewById(R.id.hospitalButton);
        FirstAidButton = (Button) rootView.findViewById(R.id.FirstAidButton);
        HospitalLocatorButton = (Button) rootView.findViewById(R.id.HospitalLocatorButton);

        EmergencyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                new MaterialDialog.Builder(getActivity())
                        .title("Government Ambulances")
                        .items(emergency_numbers_array)
                        .itemsCallback(new MaterialDialog.ListCallback() {
                            @Override
                            public void onSelection(MaterialDialog materialDialog, View view, int i, CharSequence charSequence) {
                                if (i == 0) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "108";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:108"));
                                    startActivity(phoneIntent);
                                } else if (i == 1) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532576106";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532576106"));
                                    startActivity(phoneIntent);
                                } else if (i == 2) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "102";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:102"));
                                    startActivity(phoneIntent);
                                } else if (i == 3) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532504926";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532504926"));
                                    startActivity(phoneIntent);
                                } else if (i == 4) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532351045";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532351045"));
                                    startActivity(phoneIntent);
                                } else if (i == 5) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532511313";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532511313"));
                                    startActivity(phoneIntent);
                                } else if (i == 6) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532463721";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532463721"));
                                    startActivity(phoneIntent);
                                } else if (i == 7) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532576106";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532576106"));
                                    startActivity(phoneIntent);
                                } else if (i == 8) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532491377";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532491377"));
                                    startActivity(phoneIntent);
                                } else if (i == 9) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532463414";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532463414"));
                                    startActivity(phoneIntent);
                                } else if (i == 10) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532575516";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532575516"));
                                    startActivity(phoneIntent);
                                } else if (i == 11) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532463442";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532463442"));
                                    startActivity(phoneIntent);
                                } else if (i == 12) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532581111";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532581111"));
                                    startActivity(phoneIntent);
                                } else if (i == 13) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532392491";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532392491"));
                                    startActivity(phoneIntent);
                                } else if (i == 14) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "02532501021";
                                    addCallAction(data);
                                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                                    phoneIntent.setData(Uri.parse("tel:02532501021"));
                                    startActivity(phoneIntent);
                                }
                            }
                        })
                        .show();
            }
        });

        FirstAidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), FirstAidActivity.class);
                startActivity(intent);
            }
        });

        HospitalLocatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), HospitalLocatorActivity.class);
                startActivity(intent);
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