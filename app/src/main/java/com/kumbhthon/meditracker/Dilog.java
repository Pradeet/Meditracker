package com.kumbhthon.meditracker;



import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IBinder;
 
public class Dilog extends Service implements LocationListener {
 
    private final Context mContext;
   
 
    
 
    public Dilog(Context context) {
        this.mContext = context;
       
    }
 
    
    public void showSettingsAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
      
        // Setting Dialog Title
        alertDialog.setTitle(" Call Alert");
  
        // Setting Dialog Message
        alertDialog.setMessage("You Need Emergency Help...");
  
        // On pressing Settings button
        alertDialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
            	  dialog.cancel();
            	
            }
        });
  
        // on pressing cancel button
        alertDialog.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	
            	 Intent i=new Intent(HomeScreenActivity.context,TransperentActivity.class);		
	            	
                 mContext.startActivity(i);
          
            }
        });
  
        // Showing Alert Message
        alertDialog.show();
    }
 
    @Override
    public void onLocationChanged(Location location) {
    }
 
    @Override
    public void onProviderDisabled(String provider) {
    }
 
    @Override
    public void onProviderEnabled(String provider) {
    }
 
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }
 
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
 
}