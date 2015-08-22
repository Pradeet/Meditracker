package com.kumbhthon.meditracker.Adapter;

import android.graphics.Color;

public class RowItem {
    private String title;
    private int icon;

    public RowItem(String title, int icon) {

        setTextColor(Color.parseColor("#EBF4FA"));
        this.title = title;
        this.icon = icon;

    }

    private static void setTextColor(int parseColor) {


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
