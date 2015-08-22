package com.kumbhthon.meditracker.Utils.GPS;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;

public class GPSManager {

    private static final int gpsMinTime = 500;
    private static final int gpsMinDistance = 0;
    private static LocationManager locationManager = null;
    private static LocationListener locationListener = null;
    private static GPSCallback gpsCallback = null;
    Context conn;
    private boolean gpsStatus;

    public GPSManager(Context con) {

        conn = con;
        GPSManager.locationListener = new LocationListener() {
            //@Override
            public void onLocationChanged(final Location location) {
                if (GPSManager.gpsCallback != null) {
                    GPSManager.gpsCallback.onGPSUpdate(location);
                }
            }

            //@Override
            public void onProviderDisabled(final String provider) {

            }

            //@Override
            public void onProviderEnabled(final String provider) {

            }

            //@Override
            public void onStatusChanged(final String provider, final int status, final Bundle extras) {
                if (status == LocationProvider.AVAILABLE) {
                    //Toast.makeText(conn, "Available", Toast.LENGTH_SHORT).show();
                } else if (status == LocationProvider.TEMPORARILY_UNAVAILABLE) {
                    //Toast.makeText(conn, "TEMPORARILY_UNAVAILABLE", Toast.LENGTH_SHORT).show();
                } else if (status == LocationProvider.OUT_OF_SERVICE) {
                    //Toast.makeText(conn, "OUT_OF_SERVICE", Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(conn, "Sorry", Toast.LENGTH_SHORT).show();
                }
            }
        };

        if (GPSManager.locationManager == null) {
            GPSManager.locationManager = (LocationManager) conn.getSystemService(Context.LOCATION_SERVICE);
        }

    }

    public void setNetworkProviderOn() {
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            conn.startActivity(myIntent);
        }

    }

    public static boolean isNetworkProviderOn() {
        if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER))
            return true;
        else
            return false;

    }

    public void setGpsProviderOn() {
        System.out.println("setGpsStatusOnOff");
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            System.out.println("enable");
            String provider = Settings.Secure.getString(conn.getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
            if (!provider.contains("gps")) {
                System.out.println("inside if");
                final Intent poke = new Intent();
                poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
                poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
                poke.setData(Uri.parse("3"));
                conn.sendBroadcast(poke);
            }
        }
    }

    public Boolean getGpsStatus() {
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
            gpsStatus = true;
        else
            gpsStatus = false;

        return gpsStatus;

    }

    public GPSCallback getGPSCallback() {
        return GPSManager.gpsCallback;
    }

    public void setGPSCallback(final GPSCallback gpsCallback) {
        GPSManager.gpsCallback = gpsCallback;
    }

    public void startListening(final Context context) {
        if (GPSManager.locationManager == null) {
            GPSManager.locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        }

        final Criteria criteria = new Criteria();

        criteria.setAccuracy(Criteria.ACCURACY_FINE);
        criteria.setSpeedRequired(true);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setCostAllowed(true);
        criteria.setPowerRequirement(Criteria.POWER_LOW);

        final String bestProvider = GPSManager.locationManager.getBestProvider(criteria, true);

        if (bestProvider != null && bestProvider.length() > 0) {
            GPSManager.locationManager.requestLocationUpdates(bestProvider, GPSManager.gpsMinTime,
                    GPSManager.gpsMinDistance, GPSManager.locationListener);
        } else {
            final List<String> providers = GPSManager.locationManager.getProviders(true);

            for (final String provider : providers) {
                GPSManager.locationManager.requestLocationUpdates(provider, GPSManager.gpsMinTime,
                        GPSManager.gpsMinDistance, GPSManager.locationListener);
            }
        }
    }

    public void stopListening() {
        try {
            if (GPSManager.locationManager != null && GPSManager.locationListener != null) {
                GPSManager.locationManager.removeUpdates(GPSManager.locationListener);
            }

            GPSManager.locationManager = null;

        } catch (final Exception ex) {

        }
    }

}
