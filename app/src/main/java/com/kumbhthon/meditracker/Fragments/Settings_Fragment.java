package com.kumbhthon.meditracker.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;

import com.kumbhthon.meditracker.R;

@SuppressLint("NewApi")
public class Settings_Fragment extends Fragment implements OnClickListener {
    //	  TestAdapter mDbHelper;
    Button bsave;
    EditText nm, n1, n2;
    Context cntx;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings_fragment, container, false);
        cntx = getActivity();
//        	   mDbHelper= new TestAdapter(cntx);
        bsave = (Button) rootView.findViewById(R.id.btn_save);
        bsave.setOnClickListener(this);
        nm = (EditText) rootView.findViewById(R.id.edttxt_name);
        n1 = (EditText) rootView.findViewById(R.id.edttxt_no1);
        n2 = (EditText) rootView.findViewById(R.id.edttxt_no2);
//      		mDbHelper.open();
//      		Cursor testdata = mDbHelper.getTestData();
//      		String myname= testdata.getString(0);
//      		String myno1= testdata.getString(1);
//      		String myno2= testdata.getString(2);
//      		testdata.moveToNext();
//      		nm.setText(myname);
//      		n1.setText(myno1);
//      		n2.setText(myno2);
        return rootView;


    }

    @Override
    public void onClick(View vw) {
        if (vw == bsave) {
//		mDbHelper.UpdateData(nm, n1, n2);
            Toast.makeText(cntx, "Successfully Updated", Toast.LENGTH_SHORT).show();
        }
    }
}
