package com.kumbhthon.meditracker.Analytics;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pradeet on 22-Aug-15.
 */
public class RegisterDetails implements Serializable {
    public String User_Name;
    public String PhoneNum;
    public String AltPhoneNum;
    public String TimeStamp;

    public RegisterDetails(String user_Name, String phoneNum, String altPhoneNum) {
        User_Name = user_Name;
        PhoneNum = phoneNum;
        AltPhoneNum = altPhoneNum;
        TimeStamp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}