package com.kumbhthon.meditracker.Utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.kumbhthon.meditracker.Analytics.ServerLoader;

/**
 * Created by pradeet on 24-Aug-15.
 */
public class BRNetConnectivity extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectionManager.isNetConnected(context)) {
            new ServerLoader(context).sendToServer();
        }
    }
}
