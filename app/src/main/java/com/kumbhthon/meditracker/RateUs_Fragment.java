package com.kumbhthon.meditracker;

import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.content.Intent;

  @SuppressLint("NewApi")
   public class RateUs_Fragment extends Fragment 
  {

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
      {
              View rootView = inflater .inflate(R.layout.rateus_fragment, container, false);  
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.kumbhthon.meditracker")));
				 return rootView;
      }
 }
