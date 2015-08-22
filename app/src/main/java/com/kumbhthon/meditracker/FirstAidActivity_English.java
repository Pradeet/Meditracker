package com.kumbhthon.meditracker;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.kumbhthon.meditracker.Adapter.FirstAidAdapter_english;

public class FirstAidActivity_English extends Activity implements OnGroupExpandListener {

    ExpandableListView listView;
    static int LastExpandedPostion = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expan);

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
