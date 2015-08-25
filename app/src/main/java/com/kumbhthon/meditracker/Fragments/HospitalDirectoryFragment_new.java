package com.kumbhthon.meditracker.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kumbhthon.meditracker.Adapter.HospitalsDirectoryAdapter;
import com.kumbhthon.meditracker.R;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class HospitalDirectoryFragment_new extends Fragment {


    public HospitalDirectoryFragment_new() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hospital_directory_fragment_new, container, false);

        StickyListHeadersListView stickyList = (StickyListHeadersListView) view.findViewById(R.id.HospitalDirectoryList);
        HospitalsDirectoryAdapter adapter = new HospitalsDirectoryAdapter(getActivity());
        stickyList.setAdapter(adapter);

        return view;
    }


}
