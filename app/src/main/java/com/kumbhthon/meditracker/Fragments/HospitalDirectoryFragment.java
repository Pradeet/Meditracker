package com.kumbhthon.meditracker.Fragments;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.kumbhthon.meditracker.Adapter.MyHelpAdapter;
import com.kumbhthon.meditracker.R;

@SuppressLint("NewApi")
public class HospitalDirectoryFragment extends Fragment implements OnGroupExpandListener, OnItemClickListener {
    ExpandableListView listView;
    static int LastExpandedPostion = -1;
    Context cntx;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.help_center_fragment, container, false);
        cntx = getActivity();

        listView = (ExpandableListView) rootView.findViewById(R.id.expandanlelisthelp);
        listView.setAdapter(new MyHelpAdapter(cntx));
        listView.setOnGroupExpandListener(this);
        listView.setOnItemClickListener(this);
        return rootView;
    }

    @Override
    public void onGroupExpand(int groupPosition) {
        if (LastExpandedPostion != -1 && groupPosition != LastExpandedPostion) {
            listView.collapseGroup(LastExpandedPostion);
        }
        LastExpandedPostion = groupPosition;

    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub

    }
}