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

@SuppressLint("NewApi")
public class Ex_frag extends Fragment //implements OnClickListener
{
	 	Button btn_mp1,btn_mp2,btn_mp3;
	 	Context cntx;
	 	@Override
	 	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	 	   {
	 	           View rootView = inflater .inflate(R.layout.firstaid_fragment, container, false);  
	 	           //cntx=getActivity();         
	 	           btn_mp1=(Button)rootView.findViewById(R.id.Hindi);
	 	          btn_mp2=(Button)rootView.findViewById(R.id.English);
	 	         btn_mp3=(Button)rootView.findViewById(R.id.Marathi);
	 	          // btn_mp.setOnClickListener(getActivity());*/
	 	           
	 	           btn_mp1.setOnClickListener(new OnClickListener()
	 	           {
	 	               public void onClick(View v)
	 	               {
	 	            	   Intent i=new Intent(HomeScreenActivity.context,Main_Ex_Hindi.class);		
	 	            	   //Intent i=new Intent()
	 					   startActivity(i);

	 	               }});
	 	          btn_mp2.setOnClickListener(new OnClickListener()
	 	           {
	 	               public void onClick(View v)
	 	               {
	 	            	   Intent i=new Intent(HomeScreenActivity.context,FirstAid_Fragment.class);		
	 	            	   //Intent i=new Intent()
	 					   startActivity(i);

	 	               }});
	 	          
	 	         btn_mp3.setOnClickListener(new OnClickListener()
	 	           {
	 	               public void onClick(View v)
	 	               {
	 	            	   Intent i=new Intent(HomeScreenActivity.context,Main_Ex_Marathi.class);		
	 	            	   //Intent i=new Intent()
	 					   startActivity(i);

	 	               }});
	 	          
	 	           
	 	           return rootView;
	 	   }
}