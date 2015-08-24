package com.kumbhthon.meditracker;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.kumbhthon.meditracker.Adapter.FirstAidAdapter_english;

public class FirstAidActivity_English extends ActionBarActivity implements OnGroupExpandListener {

    ExpandableListView listView;
    static int LastExpandedPostion = -1;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expan);

        toolbar = (Toolbar) findViewById(R.id.FirstAidActivity_English_toolbar);
        setSupportActionBar(toolbar);

        listView = (ExpandableListView) findViewById(R.id.expandanlelisthelp);
        listView.setAdapter(new FirstAidAdapter_english(this));

        listView.setOnGroupExpandListener(this);

    }


    public void onGroupExpand(int groupPosition) {
        if (LastExpandedPostion != -1 && groupPosition != LastExpandedPostion) {
            listView.collapseGroup(LastExpandedPostion);
        }
        LastExpandedPostion = groupPosition;

    }


}
