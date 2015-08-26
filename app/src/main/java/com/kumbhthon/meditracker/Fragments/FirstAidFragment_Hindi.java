package com.kumbhthon.meditracker.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.kumbhthon.meditracker.Adapter.FirstAidAdapter_hindi;
import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.R;
import com.kumbhthon.meditracker.Utils.Constants;

public class FirstAidFragment_Hindi extends Fragment implements ExpandableListView.OnGroupExpandListener {

    ExpandableListView listView;
    static int LastExpandedPostion = -1;

    public FirstAidFragment_Hindi() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_aid_fragment__hindi, container, false);

        sendFirstAidAction("Hindi");
        listView = (ExpandableListView) view.findViewById(R.id.expandanlelisthelp);
        listView.setAdapter(new FirstAidAdapter_hindi(getActivity().getApplicationContext()));

        listView.setOnGroupExpandListener(this);

        return view;
    }

    public void onGroupExpand(int groupPosition) {
        if (LastExpandedPostion != -1 && groupPosition != LastExpandedPostion) {
            listView.collapseGroup(LastExpandedPostion);
        }
        LastExpandedPostion = groupPosition;

    }

    private void sendFirstAidAction(String data) {
        SharedPreferences prefs = getActivity().getApplicationContext().getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        new ServerLoader(getActivity().getApplicationContext())
                .addActionDetails(prefs.getString(Constants.USER_MOBILE_NUM_1_PREF, null), Constants.TYPE_FIRSTAID, data, "n/a");
    }

}
