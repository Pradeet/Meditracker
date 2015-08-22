package com.kumbhthon.meditracker;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class Route_wise_hospital extends FragmentActivity 
{
	// Google Map
    private GoogleMap googleMap;
  
   
    
    //dule
    private double d_lat[]={

};
    private double d_long[]={
};
    
   
    private String d_hosp_name[] ={

};
    private String d_add[] ={

    };
    
    
    //aurangabad
    private double A_lat[]={

};
    private double A_long[]={
};
    
   
    private String A_hosp_name[] ={

};
    private String A_add[] ={

    };
    
    
    //pune
    private double p_lat[]={

};
    private double p_long[]={
};
    
   
    private String p_hosp_name[] ={

};
    private String p_add[] ={

    };
    
    
    //mumbai
    private double M_lat[]={

};
    private double M_long[]={
};
    
   
    private String M_hosp_name[] ={

};
    private String M_add[] ={

    };
   
    
    //Trimabak
    private double T_lat[]={

};
    private double T_long[]={
};
    
   
    private String T_hosp_name[] ={

};
    private String T_add[] ={

    };
    
    
    
    
    //Girnare
    private double G_lat[]={

};
    private double G_long[]={
};
    
   
    private String G_hosp_name[] ={

};
    private String G_add[] ={

    };
    
    
    
    
    //Dindori
    private double D_lat[]={

};
    private double D_long[]={
};
    
   
    private String D_hosp_name[] ={

};
    private String D_add[] ={

    };
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);  												
        try 
		{
			
            // Loading map
			
            initilizeMap();
             
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            LatLng latLng = new LatLng(19.998176, 73.772719);      
            
            // Show the current location in Google Map        
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(17));
            googleMap.setMyLocationEnabled(true);
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            Criteria criteria = new Criteria();

            Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));
            
            if (location != null)
            {
            	 googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(location.getLatitude(), location.getLongitude()),10));

                CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(location.getLatitude(), location.
                getLongitude()))      // Sets the center of the map to location user
                .zoom(17)                   // Sets the zoom
               .bearing(1000)                // Sets the orientation of the camera to east
                .tilt(60)                   // Sets the tilt of the camera to 30 degrees
                .build();                   // Creates a CameraPosition from the builder
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

            }
            

            dule_marker();
            Aurangabad_marker();
            pune_marker();
            mumbai_marker();
            Trimbak_marker();
            Girnare_marker();
            dindori_marker();
        }
		catch (Exception e)
		{
            e.printStackTrace();
        }
		
    }
    

    
   //dule_marker
    private void dule_marker()
    {
    	
    	for (int i=0; i <= d_long.length; i++)
    	{
    		
    	 // create marker
    		MarkerOptions marker2 = new MarkerOptions().position(new LatLng(d_lat[i], d_long[i])).title( ""+d_hosp_name[i]).snippet(""+d_add[i]);
  		
    		marker2.icon(BitmapDescriptorFactory.fromResource(R.drawable.light_blue));
    
    		
        // adding marker
    		googleMap.addMarker(marker2);
    		
    		}
    }
    
    //Aurangabad_marker
    private void Aurangabad_marker()
    {
    	
    	for (int i=0; i <= A_long.length; i++)
    	{
    		
    	 // create marker
    		MarkerOptions marker2 = new MarkerOptions().position(new LatLng(A_lat[i],A_long[i])).title( ""+A_hosp_name[i]).snippet(""+A_add[i]);
  		
    		marker2.icon(BitmapDescriptorFactory.fromResource(R.drawable.brown));
    
    		
        // adding marker
    		googleMap.addMarker(marker2);
    		
    		}
    }
    
    //Pune_marker
    private void pune_marker()
    {
    	
    	for (int i=0; i <= p_long.length; i++)
    	{
    		
    	 // create marker
    		MarkerOptions marker2 = new MarkerOptions().position(new LatLng(p_lat[i],p_long[i])).title( ""+p_hosp_name[i]).snippet(""+p_add[i]);
  		
    		marker2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.hosp));
    
    		
        // adding marker
    		googleMap.addMarker(marker2);
    		
    		}
    }
    
    
    
  //mumbai_marker
    private void mumbai_marker()
    {
    	
    	for (int i=0; i <= M_long.length; i++)
    	{
    		
    	 // create marker
    		MarkerOptions marker2 = new MarkerOptions().position(new LatLng(M_lat[i],M_long[i])).title( ""+M_hosp_name[i]).snippet(""+M_add[i]);
  		
    		marker2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.hosp));
    
    		
        // adding marker
    		googleMap.addMarker(marker2);
    		
    		}
    }
    
    
  //Trimbak_marker
    private void Trimbak_marker()
    {
    	
    	for (int i=0; i <= T_long.length; i++)
    	{
    		
    	 // create marker
    		MarkerOptions marker2 = new MarkerOptions().position(new LatLng(T_lat[i],T_long[i])).title( ""+T_hosp_name[i]).snippet(""+T_add[i]);
  		
    		marker2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.hosp));
    
    		
        // adding marker
    		googleMap.addMarker(marker2);
    		
    		}
    }
    
    
  //Girnare_marker
    private void Girnare_marker()
    {
    	
    	for (int i=0; i <= G_long.length; i++)
    	{
    		
    	 // create marker
    		MarkerOptions marker2 = new MarkerOptions().position(new LatLng(T_lat[i],T_long[i])).title( ""+G_hosp_name[i]).snippet(""+G_add[i]);
  		
    		marker2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.hosp));
    
    		
        // adding marker
    		googleMap.addMarker(marker2);
    		
    		}
    }
    
  //Dindori_marker
    private void dindori_marker()
    {
    	
    	for (int i=0; i <= D_long.length; i++)
    	{
    		
    	 // create marker
    		MarkerOptions marker2 = new MarkerOptions().position(new LatLng(D_lat[i],D_long[i])).title( ""+D_hosp_name[i]).snippet(""+D_add[i]);
  		
    		marker2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.hosp));
    
    		
        // adding marker
    		googleMap.addMarker(marker2);
    		
    		}
    }
    
    
    
    
    
    public void onMarkerClick(Marker marker) {

        Toast.makeText(this,marker.getTitle(),Toast.LENGTH_LONG).show();
     }
    
    /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initilizeMap()
    {
        if (googleMap == null)
        	//requestWindowFeature(Window.FEATURE_NO_TITLE);
            //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
              // WindowManager.LayoutParams.FLAG_FULLSCREEN);
      		//setContentView(R.layout.map_activity);	
      		
        {
        	SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map); 
        			    		
        			    		
        			    		// Getting reference to the Google Map
        			    		googleMap = mapFragment.getMap();          // check if map is created successfully or not
        			            if (googleMap == null) {
        			               Toast.makeText(getApplicationContext(),
        			                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
        			                        .show();
            }
            
        }
    }
 
    @Override
    protected void onResume() {
        super.onResume();
        initilizeMap();
    }
 
    
}
