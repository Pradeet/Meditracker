package com.kumbhthon.meditracker.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kumbhthon.meditracker.R;

import java.util.ArrayList;

// This is unused

/**
 * Created by pradeet on 23-Aug-15.
 */
public class EmergencyHospitalsAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> data;
    LayoutInflater inflater;

    public EmergencyHospitalsAdapter(Context context, ArrayList<String> data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder = new viewHolder();

        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.)
        }
        return convertView;
    }

    class viewHolder {
        TextView Hospital_name;
    }
}
