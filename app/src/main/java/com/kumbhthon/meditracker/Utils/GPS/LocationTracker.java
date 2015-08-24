package com.kumbhthon.meditracker.Utils.GPS;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/**
 * Created by pradeet on 24-Aug-15.
 */
public class LocationTracker {

    private Context context;
    LocationManager lm;
    Location location;
    private double longitude;
    private double latitude;

    public LocationTracker(Context context) {
        lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    }

    public double getLongitude() {
        return location.getLongitude();
    }

    public double getLatitude() {
        return location.getLatitude();
    }
}
