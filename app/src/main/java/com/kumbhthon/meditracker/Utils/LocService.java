package com.kumbhthon.meditracker.Utils;

import java.util.List;

import android.app.Service;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.IBinder;

import com.kumbhthon.meditracker.Utils.GPS.GPSCallback;
import com.kumbhthon.meditracker.Utils.GPS.GPSManager;

public class LocService extends Service implements GPSCallback {
    private GPSManager networkLocation;
    private static String latitude = "", longitude = "", addressString = "", pinCode = "";
    SharedPreferenceManager sharedPref;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("service created-LocService");
        networkLocation = new GPSManager(getApplicationContext());

        networkLocation.startListening(getApplicationContext());
        networkLocation.setGPSCallback(this);

        sharedPref = new SharedPreferenceManager(getApplicationContext());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onGPSUpdate(Location location) {
        System.out.println("Here");
        //Toast.makeText(this, "lat... " + latitude + " long... " + longitude, Toast.LENGTH_LONG).show();

        if (location != null) {
            latitude = String.valueOf(location.getLatitude());
            longitude = String.valueOf(location.getLongitude());
            System.out.println("lat " + latitude + " long " + longitude);
            getLocationString(location);

            sharedPref.connectDB();
            sharedPref.setString("lat", latitude);
            sharedPref.setString("long", longitude);
            sharedPref.setString("add", addressString);
            sharedPref.setString("pin", pinCode);
            sharedPref.closeDB();

            //Toast.makeText(this, "lat " + latitude + " long " + longitude, Toast.LENGTH_LONG).show();
        } else
            System.out.println("location null");
    }

    public void getLocationString(Location location) {
        double lattitude = location.getLatitude();
        double longitude = location.getLongitude();
        addressString = "";
        Geocoder geoCoder = new Geocoder(getApplicationContext());

        try {
            List<Address> address = geoCoder.getFromLocation(lattitude, longitude, 1);
            if (!address.isEmpty()) {
                Object[] objAdrs = address.toArray();
                if (objAdrs != null) {
                    Address adrs = (Address) objAdrs[0];
                    if ((adrs.getAddressLine(0) != null))
                        addressString += " " + adrs.getAddressLine(0).toString() + ", ";
                    System.out.println("getAddressLine(0)-> " + adrs.getAddressLine(0).toString());
                    if ((adrs.getLocality() != null))
                        addressString += adrs.getLocality().toString() + ", ";
                    System.out.println("getLocality()-> " + adrs.getLocality().toString());
                    if ((adrs.getAdminArea() != null))
                        addressString += adrs.getAdminArea() + ", ";
                    System.out.println("getAdminArea()-> " + adrs.getAdminArea());
                    if ((adrs.getCountryName() != null))
                        addressString += adrs.getCountryName().toString();
                    System.out.println("adrs.getCountryName().toString() -> " + adrs.getCountryName().toString());
                    if (adrs.getPostalCode() != null)
                        pinCode = adrs.getPostalCode().toString();

                }
            }

        } catch (Exception ex) {
            //addressString = "could not be fetched";
        }
    }
}
