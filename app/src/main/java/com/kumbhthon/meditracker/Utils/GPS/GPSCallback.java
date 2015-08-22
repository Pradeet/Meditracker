package com.kumbhthon.meditracker.Utils.GPS;

import android.location.Location;

public interface GPSCallback {
    public abstract void onGPSUpdate(Location location);
}
