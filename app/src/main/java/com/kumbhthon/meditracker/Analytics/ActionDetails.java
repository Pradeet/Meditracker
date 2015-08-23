package com.kumbhthon.meditracker.Analytics;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pradeet on 22-Aug-15.
 */
public class ActionDetails {
    public String action_PhoneNumber;
    public String action_Time;
    public String action_Type;
    public String action_data;

    public ActionDetails(String action_PhoneNumber,String action_Time, String action_Type, String action_data) {
        this.action_PhoneNumber = action_PhoneNumber;
        this.action_Type = action_Type;
        this.action_data = action_data;
        this.action_Time = action_Time;
    }
}
