package com.kumbhthon.meditracker.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.kumbhthon.meditracker.R;

public class FirstAidAdapter_marathi extends BaseExpandableListAdapter {
    private Context context;


    String[] parentlist = {"किटक /कीडा चावल्यावर",
            "मूर्छा /चक्कर आल्यावर",
            "सर्पदंश /साप चावल्यावर",
            "उंदीर चावल्यावर",
            "डोळयाला जखम झाल्यावर",
            "इलेक्ट्रीक शॉक बसल्यास",
            " जखम",
            "ताप",
            "लचक आणि ताण",
            "कुत्रा चावल्यावर"

    };

    String[][] childlist = {
            {
                    "१. दंश काढुन टाका.",
                    "२. साबण आणि पाण्याने पूर्णपणे जखम धुवा.",
                    "३. सूज, वेदना, लालसरपणा चिन्हे बघा.",
                    "४. पुढील उपचारासाठी वैद्यकीय मदतीचा शोध करा.",

            },

            {
                    "१. कोणीतरी धीर सोडू वाटते तेव्हा,त्या व्यक्तिला खाली डोके, वर पाय करण्यास मदत करा.",
                    "२. रुग्ञाचे  घट्ट कपडे सैल करा.",
                    "३. मोकळ्या हवेचे क्षेत्र तयार करा.",
                    "४.स्वच्र्छ  ओल्या रूमालाने चेहरा पुसा.",
                    "५. वैद्यकीय मदत उपचार मिळवण्याचा प्रयत्न करा."
            },

            {
                    "१. जखम स्वच्र्छ करा.",
                    "२. जखम खाजऊ नका ",
                    "३. चावलेल्या जखमवर छेद करू नका.",
                    "४. जखमेच्या पृष्ठभागावर मलमपट्टी करा.",
                    "५. रुग्णाला रुग्णालयात उपचारासाठी दाखल केले पाहिजे.",
            },

            {
                    "1. साबण आणि पाण्याचा वापर करून जखम स्वच्छ करा.",
                    "2. स्वच्छ, कोरड्या जमिनीच्या पृष्ठभागावर  मलमपट्टी करा.",
                    "3. जखमेची जागा  स्वच्छ ठेवा.",
                    "4. पुढील उपचारासाठी रुग्णालयात भेट द्या.",
            },

            {

                    "A.डोळ्याला  धक्का बसणे :-",
                    "१. थंड संक्षेप लागू करा.",
                    "२. डोळा दाबू नका.",
                    "३.डोळयाच्या तज्ञांना भेट द्या.",

                    "B.डोळ्यामधे काही गेल्यास :-",
                    "१. डोळे घासू नका.",
                    "२. डोळ्याची पापणी खाली वर करा आणि वारंवार दुर्लक्ष करा .",
                    "३.  पुढील उपचारासाठी रुग्णालयात भेट द्या.",


                    "D.डोळा कापल्यावर :-",
                    "१.  निर्जंतुक कापडाने डोळा झाका.",
                    "२. सूज, रक्तस्त्राव, वेदनेसाठी थंड संक्षेप लागू करा.",
                    "३. पुढील उपचारासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. पहिले वीज बंद  करा",
                    "२. रुग्णाकडे लक्ष द्या.",
                    "३. पुढील उपचारासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. जखम स्वच्छ पाण्याने पुसा, साबणाचा वापर टाळा.",
                    "२. जखमेतील कचरा काढा.",
                    "३. मलमपट्टीसाठी रुग्णालयाला भेट द्या.",

            },

            {
                    "१. थंड ठिकाणी रुग्ण ठेवा.",
                    "२. अतिरिक्त कपडे काढा.",
                    "३. स्पंजने अंग पुसून काढा.",
                    "४. पुढील उपचारासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. काम थांबवा आणि आराम घ्या.",
                    "२.सूज कमी करणारे औषध लावा.",
                    "३. सूज कमी करणारे औषध  घेऊ शकता.",
                    "४. पुढील उपचारासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. जखमवरील लाळ पुसून काढा .",
                    "२. साबणाच्या पाण्याने  जखम पूर्णपणे धुवा.",
                    "३.  कोरड्या निर्जंतुक  कपडाने  जखम झाकून ठेवा",
                    "४. पुढील उपचारासाठी रुग्णालयात भेट द्या.",
            },

    };


    public FirstAidAdapter_marathi(Context context) {
        // TODO Auto-generated constructor stub
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return parentlist.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        // TODO Auto-generated method stub
        return childlist[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        // TODO Auto-generated method stub
        return groupPosition;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        // TODO Auto-generated method stub
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View view;
        TextView tv;
        LayoutInflater inflate = LayoutInflater.from(context);
        view = inflate.inflate(R.layout.expandable_parentvw, null);
    /*TextView tv=new TextView(context);
	tv.setText(parentlist[groupPosition]);
	tv.setPadding(50, 10, 10, 10);
	tv.setTextSize(25);
	tv.setTextColor(Color.WHITE);*/
        tv = (TextView) view.findViewById(R.id.xtxvwExpndparenttxt);
        tv.setText(parentlist[groupPosition]);


        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View view;
        TextView tv;
        LayoutInflater inflate = LayoutInflater.from(context);
        view = inflate.inflate(R.layout.expandable_childvw, null);
/*	TextView tv=new TextView(context);
	tv.setText(childlist[groupPosition][childPosition]);
	tv.setPadding(50, 10, 10, 10);
	tv.setTextSize(20);
	tv.setTextColor(Color.GRAY);
	*/
        tv = (TextView) view.findViewById(R.id.xtxvwExpndChildtxt);
        tv.setText(childlist[groupPosition][childPosition]);


        return view;

    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return true;
    }

}
