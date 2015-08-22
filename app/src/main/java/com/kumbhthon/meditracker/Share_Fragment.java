package com.kumbhthon.meditracker;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.content.Intent;

  @SuppressLint("NewApi")
   public class Share_Fragment extends Fragment
  {
	  
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
      {			
              View rootView = inflater .inflate(R.layout.share_fragment, container, false);  
              Intent sendIntent = new Intent();
              sendIntent.setAction(Intent.ACTION_SEND);
              sendIntent.putExtra(Intent.EXTRA_TEXT,
                  "Hey check out  MEDITRACKER my app athttps://play.google.com/store/apps/details?id=com.kumbhthon.meditracker");
              sendIntent.setType("text/plain");
              startActivity(sendIntent);
              return rootView;
      }

}
 