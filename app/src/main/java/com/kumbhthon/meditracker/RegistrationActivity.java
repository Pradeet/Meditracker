package com.kumbhthon.meditracker;


import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends Activity implements OnClickListener {

    Button btn1;
    EditText t1, t2, t3;
    //    TestAdapter mDbHelper;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        context = RegistrationActivity.this;
        t1 = (EditText) findViewById(R.id.editTxt_Name);
        t2 = (EditText) findViewById(R.id.editTxt_no1);
        t3 = (EditText) findViewById(R.id.editTxt_no2);
        btn1 = (Button) findViewById(R.id.btn_submit);
        btn1.setOnClickListener(this);
//        mDbHelper = new TestAdapter(this);
    }


    public void onClick(View vw) {
        if (vw == btn1) {

            if (validation()) {

                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
                Editor edit = sharedPreferences.edit();
                edit.putBoolean("Register_success", true);
                edit.commit();

//                mDbHelper.open();
//                if (mDbHelper.SaveData(t1, t2, t3)) {
//
//                    //showDialog("Details Saved");
//                    Toast.makeText(getApplicationContext(), "Details Saved", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Oooopss..! error occured", Toast.LENGTH_SHORT).show();
//                }

                Intent i1 = new Intent(getBaseContext(), HomeScreenActivity.class);
                startActivity(i1);
            } else {
                Toast.makeText(getApplicationContext(), "Please enter proper details", Toast.LENGTH_SHORT).show();

            }

        }

    }

    public boolean validation() {
        String str1 = t1.getText().toString();
        String n1 = t2.getText().toString();
        String n2 = t3.getText().toString();
        if (str1.length() <= 0) {
            t1.setError("Name is mandetory");
            return false;
        } else if (n1.length() <= 0) {
            t2.setError("Mobile number is mandetory");
            return false;
        } else if (n1.length() < 10) {
            t2.setError("Mobile number should be of 10 digits");
            return false;
        } else if (n2.length() <= 0) {
            t3.setError("Mobile number is mandetory");
            return false;
        } else if (n2.length() < 10) {
            t3.setError("Mobile number should be of 10 digits");
            return false;
        } else {
            return true;
        }

    }

/*	void showDialog(String strMsg)
    {
		//Dialog dialog=Dialog(context).cre
		 AlertDialog dialog=new AlertDialog.Builder(context).create();
		    LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            View convertView = mInflater.inflate(R.layout.activity_settings, null);

		 dialog.setView(convertView);
		 
		//dialog.setTitle(getString(R.string.app_name));
		//dialog.setMessage(strMsg);
		dialog.setButton("OK", new DialogInterface.OnClickListener() 
		{
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) 
			{
				arg0.dismiss();
			}
		});
		//dialog.show();
		 dialog.show();
	}*/

}
