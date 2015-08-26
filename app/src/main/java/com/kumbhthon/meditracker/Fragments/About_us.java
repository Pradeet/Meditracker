package com.kumbhthon.meditracker.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;

import com.kumbhthon.meditracker.R;

@SuppressLint("NewApi")
public class About_us extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.about_us, container, false);

        rootView.findViewById(R.id.rish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Intent.ACTION_SENDTO);
                String uriText = "mailto:" + Uri.encode("bhardwaj.rish@gmail.com") +
                        "?subject=" + Uri.encode("Regarding Meditracker - Kumbhmela App") +
                        "&body=" + Uri.encode("Hi Rish!\nId love to get in touch with you. <<Fill details here>>");
                Uri uri = Uri.parse(uriText);
                send.setData(uri);
                startActivity(Intent.createChooser(send, "Send mail using:"));
            }
        });

        rootView.findViewById(R.id.pradeet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Intent.ACTION_SENDTO);
                String uriText = "mailto:" + Uri.encode("pradeet1995@gmail.com") +
                        "?subject=" + Uri.encode("Regarding Meditracker - Kumbhmela App") +
                        "&body=" + Uri.encode("Hi Pradeet!\nId love to get in touch with you. <<Fill details here>>");
                Uri uri = Uri.parse(uriText);
                send.setData(uri);
                startActivity(Intent.createChooser(send, "Send mail using:"));
            }
        });

        rootView.findViewById(R.id.as).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Intent.ACTION_SENDTO);
                String uriText = "mailto:" + Uri.encode("ashishmhalankar10@gmail.com") +
                        "?subject=" + Uri.encode("Regarding Meditracker - Kumbhmela App") +
                        "&body=" + Uri.encode("Hi Ashish!\nId love to get in touch with you. <<Fill details here>>");
                Uri uri = Uri.parse(uriText);
                send.setData(uri);
                startActivity(Intent.createChooser(send, "Send mail using:"));
            }
        });

        return rootView;
    }
}
