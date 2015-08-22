package com.kumbhthon.meditracker;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

@SuppressLint("NewApi")
public class Emeregency_service extends Fragment //implements OnClickListener
{
	 ImageButton btn_mp1,btn_mp2;
	 	Context cntx;
	 	 Dilog gps;
	 	@Override
	 	
	 	
	 	
	 	
	 	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	 	   {
	 	           View rootView = inflater .inflate(R.layout.emerengency_service, container, false);  
	 	           //cntx=getActivity();         
	 	           btn_mp1=(ImageButton)rootView.findViewById(R.id.button1);
	 	           
	 	           
	 	        
	 	           
	 	           
	 	          btn_mp1.setOnClickListener(new View.OnClickListener() {

	 	        	    @Override
	 	        	    public void onClick(View v) {
	 	        	    	  gps = new Dilog(getActivity());
	 	 	            	 
	 	        	    	 gps.showSettingsAlert();
	 	        	    }
	 	        	});
	 	          
	 	          
	 	        	   
	 	        	   
	 	               
	 	          
	 	           return rootView;
	 	   }
}