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
import android.widget.ImageButton;

import com.afollestad.materialdialogs.MaterialDialog;
import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.R;
import com.kumbhthon.meditracker.Utils.Constants;

@SuppressLint("NewApi")
public class Emeregency_service extends Fragment {
    ImageButton btn_mp1, btn_mp2;

    public Emeregency_service() {

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.emerengency_service, container, false);

        final String[] emergency_numbers_array = {"108", "Government District Hospital", "Nashik MunicipalCorporation", "Redcros Mahatma Gandhiroad", "E.S.I. Hopsital,Satpur", "Shivsena Mhahanagar", "IPS Note Press,Nashik Road", "Rajdut Mitramandal", "Cantonment Board,Devlali Camp", "Jayram Hospital, Nashik Road", "Aparn Trust", "Bahujan yua Sanghatna,Nashk Road", "Vision Hospital", "Sitabai More Hospital,Cidco", "Dr. Vinchurkar,Trimbak Naka"};

        btn_mp1 = (ImageButton) rootView.findViewById(R.id.hospitalButton);
        btn_mp1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                new MaterialDialog.Builder(getActivity())
                        .title("Government Hospitals")
                        .items(emergency_numbers_array)
                        .itemsCallback(new MaterialDialog.ListCallback() {
                            @Override
                            public void onSelection(MaterialDialog materialDialog, View view, int i, CharSequence charSequence) {
                                if (i == 0) {
                                    String data = charSequence.toString();
                                    data = data + ":" + "108";
                                    addCallAction(data);
//                            new ServerLoader(getActivity().getApplicationContext()).sendToServer();
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

        return rootView;
    }

    private void addCallAction(String data) {
        SharedPreferences prefs = getActivity().getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        new ServerLoader(getActivity().getApplicationContext())
                .addActionDetails(prefs.getString(Constants.USER_MOBILE_NUM_1_PREF, "----"), Constants.TYPE_CALL, data);
    }
}