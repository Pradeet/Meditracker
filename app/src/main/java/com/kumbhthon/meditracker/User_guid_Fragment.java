package com.kumbhthon.meditracker;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;

  @SuppressLint("NewApi")
   public class User_guid_Fragment extends Fragment
  {
	  
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
      {			
              View rootView = inflater .inflate(R.layout.user_fragment, container, false);  
              
              return rootView;
      }

}