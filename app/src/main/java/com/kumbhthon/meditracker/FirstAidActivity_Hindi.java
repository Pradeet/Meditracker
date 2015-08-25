package com.kumbhthon.meditracker;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.kumbhthon.meditracker.Adapter.FirstAidAdapter_hindi;
import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.Utils.Constants;

public class FirstAidActivity_Hindi extends Activity implements OnGroupExpandListener {

    ExpandableListView listView;
    static int LastExpandedPostion = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expan);
        sendFirstAidAction("Hindi");
        listView = (ExpandableListView) findViewById(R.id.expandanlelisthelp);
        listView.setAdapter(new FirstAidAdapter_hindi(this));

        listView.setOnGroupExpandListener(this);

    }


    public void onGroupExpand(int groupPosition) {
        if (LastExpandedPostion != -1 && groupPosition != LastExpandedPostion) {
            listView.collapseGroup(LastExpandedPostion);
        }
        LastExpandedPostion = groupPosition;

    }

    private void sendFirstAidAction(String data) {
        SharedPreferences prefs = getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        new ServerLoader(getApplicationContext())
                .addActionDetails(prefs.getString(Constants.USER_MOBILE_NUM_1_PREF, null), Constants.TYPE_FIRSTAID, data, "n/a");
    }
}
