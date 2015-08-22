package com.kumbhthon.meditracker.Fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.kumbhthon.meditracker.FirstAidActivity_English;
import com.kumbhthon.meditracker.HomeScreenActivity;
import com.kumbhthon.meditracker.FirstAidActivity_Hindi;
import com.kumbhthon.meditracker.FirstAidActivity_Marathi;
import com.kumbhthon.meditracker.R;

@SuppressLint("NewApi")
public class Ex_frag extends Fragment {
    Button btn_mp1, btn_mp2, btn_mp3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.firstaid_fragment, container, false);

        btn_mp1 = (Button) rootView.findViewById(R.id.Hindi);
        btn_mp2 = (Button) rootView.findViewById(R.id.English);
        btn_mp3 = (Button) rootView.findViewById(R.id.Marathi);

        btn_mp1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(HomeScreenActivity.context, FirstAidActivity_Hindi.class);
                startActivity(i);

            }
        });
        btn_mp2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(HomeScreenActivity.context, FirstAidActivity_English.class);
                startActivity(i);

            }
        });

        btn_mp3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(HomeScreenActivity.context, FirstAidActivity_Marathi.class);
                startActivity(i);

            }
        });

        return rootView;
    }
}