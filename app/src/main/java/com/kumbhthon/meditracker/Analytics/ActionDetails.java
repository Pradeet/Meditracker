package com.kumbhthon.meditracker.Analytics;

/**
 * Created by pradeet on 22-Aug-15.
 */
public class ActionDetails {
    public String action_PhoneNumber;
    public String action_Time;
    public String action_Type;
    public String action_Longitude;
    public String action_Latitude;
    public String action_data;
    public String action_extraData;

    public ActionDetails(String action_PhoneNumber,String action_Time, String action_Type, String action_data, String Longitude, String Latitude, String action_extraData) {
        this.action_PhoneNumber = action_PhoneNumber;
        this.action_Type = action_Type;
        this.action_data = action_data;
        this.action_Time = action_Time;
        this.action_Latitude = Latitude;
        this.action_Longitude = Longitude;
        this.action_extraData = action_extraData;
    }
}
