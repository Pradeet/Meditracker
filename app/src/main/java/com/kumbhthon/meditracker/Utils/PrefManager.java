package com.kumbhthon.meditracker.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by pradeet on 23-Aug-15.
 */
public class PrefManager {

    public static boolean getPrefs(Context context, String prefWhich) {
        SharedPreferences prefs = context.getSharedPreferences(prefWhich, Context.MODE_PRIVATE);
        return prefs.getBoolean(prefWhich, true);
    }

}
