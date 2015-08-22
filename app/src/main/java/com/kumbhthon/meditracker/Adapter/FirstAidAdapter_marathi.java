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


    String[] parentlist = {"किटक चाव्याव्दारे",
            "मूर्छा",
            "सर्पदंशा",
            "उंदीर चाव्याव्दारे",
            "नेत्र इजा",
            "इलेक्ट्रीक शॉक बसतो",
            "चेंडू आणि जखमा",
            "ताप",
            "लचक आणि ताण",
            "कुत्रा चाव्याव्दारे",

    };

    String[][] childlist = {
            {
                    "१. दंश काढुन टाका..",
                    "२. साबण आणि पाण्याने पूर्णपणे जखम धुवा.",
                    "३. सूज, वेदना, लालसरपणा चिन्हे बघा.",
                    "४. पुढील उपचारासाठी वैद्यकीय मदतीचा शोध करा.",

            },

            {
                    "१. कोणीतरी धीर सोडू वाटते तेव्हा,त्या व्यक्तिला खाली डोके, वर पाय करण्यास मदत करा.",
                    "२. त्याच्या /तिच्या घट्ट कपडे सैल करा.",
                    "३. मोकळ्या हवेचे क्षेत्र तयार करा.",
                    "४. थंड स्वच्र्छ कापड सह चेहरा पुसा.",
                    "५. वैद्यकीय मदत उपचार मिळवण्याचा प्रयत्न करा."
            },

            {
                    "१. जखम स्वच्र्छ करा.",
                    "२. जखम खाजऊ नका ",
                    "३. चाव्याव्दारे च्या जखमवर छेद करू नका.",
                    "४. जखमेच्या पृष्ठभागावर मलमपट्टी करा.",
                    "५. दबाव मलमपट्टी करा.",
                    "६. रुग्णाला रुग्णालयात उपचारासाठी दाखल केले पाहिजे.",
            },

            {
                    "1. साबण, savlon आणि पाणीचा वापर करून जखम स्वच्छ करा.",
                    "2. स्वच्छ, कोरडा जमिनीच्या पृष्ठभागावर  मलमपट्टी करा.",
                    "3. जखमेची जागा  स्वच्छ ठेवा.",
                    "4. पुढील व्यवस्थापनासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "a. डोळा रासायनिक प्रदर्शनासह :-",
                    "१. डोळे घासू नका.",
                    "२. लगेच स्वच्छ पाण्याने डोळे धुवा.",
                    "३. डोळ्याला मलमपट्टी करू नका.",
                    "४. वैद्यकीय मदत मिळवा.",

                    "b. डोळा धक्का बसला आहे :-",
                    "१. थंड संक्षेप लागू करा.",
                    "२. डोळा दाबू नका.",
                    "३. डोळा तज्ञांना भेट द्या.",

                    "c. डोळ्यात एक परकीय कण साठी :-",
                    "१. डोळे घासू नका.",
                    "२. डोळ्याची पापनी खाली वर करा आणि वारंवार दुर्लक्ष करणे.",
                    "३. पाण्याने  स्वच्छ  धुवा.",
                    "४. पुढील व्यवस्थापनासाठी रुग्णालयात भेट द्या.",

                    "d. डोळा च्या कट साठी :-",
                    "१. हलक्या निर्जंतुकीकरण कापसाचे किंवा रेशमाचे तलम पारदर्शक कापड सह डोळा कव्हर करा.",
                    "२. सूज, रक्तस्त्राव, वेदना साठी थंड संक्षेप लागू करा.",
                    "३. पुढील व्यवस्थापनासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. पहिले पाऊल चालू स्रोत बंद करणे आहे.",
                    "२. बळी वर लक्ष द्या.",
                    "३. पुढील व्यवस्थापनासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. जखम स्वच्छ पाण्याने पुसा, साबणाचा वापर टाळा.",
                    "२. जखमेवरुन घाण,मोडतोड काढा.",
                    "३. मलमपट्टीसाठी रुग्णालयाला भेट द्या.",
                    "४. रक्तस्त्राव टिकून राहाण्यासाठी जननेंद्रियावर दबाव लागू करा.",
            },

            {
                    "१. थंड ठिकाणी रुग्ण ठेवा.",
                    "२. अतिरिक्त कपडे काढा.",
                    "३. स्पंज बाथ द्या.",
                    "४. पुढील व्यवस्थापनासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. काम थांबवा आणि विसावा घ्या.",
                    "२. विरोधी दाहक जेल लागू करा.",
                    "३. विरोधी दाहक औषध घेऊ शकता.",
                    "४. पुढील व्यवस्थापनासाठी रुग्णालयात भेट द्या.",
            },

            {
                    "१. जखम पासून लाळ पुसा.",
                    "२. जखम भरपूर साबण पाण्याने पूर्णपणे धुवा.",
                    "३. कोरड्या निर्जंतुकीकरण जमिनीच्या पृष्ठभागावर खत घालणे करा, जखम झाकून ठेवा.",
                    "४. पुढील व्यवस्थापनासाठी रुग्णालयात भेट द्या.",
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
