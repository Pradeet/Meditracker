package com.kumbhthon.meditracker.Utils;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by pradeet on 24-Aug-15.
 */
public class ConnectionManager {
    public static Boolean isConnectedByWifi(Context context) {
        try {
            if (((ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE))
                    .getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Boolean isConnectedByMobileData(Context context) {
        try {
            if (((ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE))
                    .getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnected()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isNetConnected(Context context){
        if(isConnectedByMobileData(context) || isConnectedByWifi(context))
            return true;
        else
            return false;
    }
}
