package com.kumbhthon.meditracker.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferenceManager {
    private Context context;
    private SharedPreferences prefs;
    private Editor editor;
    private static final String PREFS_NAME = "meAgainstRape";

    public SharedPreferenceManager() {
    }

    public SharedPreferenceManager(Context context) {
        this.context = context;
    }

    public void connectDB() {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    public void closeDB() {
        editor.commit();
    }

    public void setInt(String key, int value) {
        editor.putInt(key, value);
    }

    public int getInt(String key) {
        return prefs.getInt(key, 0);
    }

    public void setBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
    }

    public boolean getBoolean(String key) {
        return prefs.getBoolean(key, false);
    }

    public void setString(String key, String value) {
        editor.putString(key, value);
    }

    public String getString(String key) {
        return prefs.getString(key, "");
    }
}
