package com.kumbhthon.meditracker;

import java.util.Date;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class TickReceiver extends BroadcastReceiver
{
	static final String LOGGING_TAG = "Tick";
	SharedPreferences sharedPrefs;
	String convertedPass = "", phoneNumber ="", IMEI = "";
	
	@Override
	public void onReceive(Context context, Intent intent)
	{		
		convertedPass = "";	
		sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
		
				
		
		if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED))
		{   
			context.startService(new Intent(context, LocService.class));   
		}
		else if(intent.getAction().equals(Intent.ACTION_TIME_TICK))
		{
			int minNow = (new Date()).getMinutes();
			
			//int hrsNow = (new Date()).getHours();
			Log.v(LOGGING_TAG, "DemoReceiver.onReceive(ACTION_TIME_TICK) " + minNow);
			
			// if sharedpref checked for dayslog 
			if(!isMyServiceRunning(context))
			{
				Intent serv = new Intent(context, LocService.class);
				context.startService(serv);
			}
			
			
		}
		else
		{
			Log.v(LOGGING_TAG, "DemoReceiver.onReceive(" + intent.getAction()); 
			context.startService(new Intent(context, LocService.class));   
		}
	}
	
	private boolean isMyServiceRunning(Context context) {
		ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
		for (RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
		    if ("com.example.emergencyhelp.LocService".equals(service.service.getClassName())) {
		        return true;
		    }
		}
		return false;
	}
	
	
}
