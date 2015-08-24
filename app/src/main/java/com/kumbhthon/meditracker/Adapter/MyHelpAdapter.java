package com.kumbhthon.meditracker.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.kumbhthon.meditracker.R;

public class MyHelpAdapter extends BaseExpandableListAdapter {
    private Context context;
    View view;

    String[] parentlist1 = {
            "Civil Hospital",
            "Suman Shatabdi Hospital",
            "Six Sigma Medicare & Research ltd.",
            "Vakratunda Multispeciality Hospital",
            "Sarthak hospital Pvt. Ltd.",
            "Ashwini Multi Speciality Hospital",
            "Sushrut Hospital",
            "Sai Shraddha hospital",
            "Nerlikar hospital",
            "Swami citycare hospital",
            "sahyadri Hospital",
            "Rajebahadur Haspital",
            "sujata Birla Memorial Hospital",
            "Samarth Hospital",
            "Shatabdi Hospital ",
            "Nashik Hospital ",
            "jairam Hospital",
            "suman Hospital",
            "Suyash Hospital",
            "NAMCO Hospital",
            "MVP Medical College",
            "Superspeciality Hospital",
            "ESIS Hospital",
            "Curie Manavta Hospital",
            "Magum Heart Inst.",
            "Saibaba Heart Inst.",
            "Kilbil",
            "Nelson",
            "Chiranjeev",
            "Bytco Hospital",
            "Wockhardt Hospital",
            "Jilha saskiya rugnalay,timbak road nashik",
            "vibhagiya sandharbha seva rugnalay,salimar nashik",
            "Medical college hospital,adgaon ,nashik",
            "Jai hospital ,tilak wadi ,nashik",
            "vijay hospital,yashwant mandai ,ravivar karanja nashik",
            "rushikesh hospital,gangapur road ,kthm college ,nashik.",
            "suman general hospital ,college road ,nashik",
            "unity hospital,dwarka circle nashik.",
            "soham hospital ,sharampur road,near NMC nashik.",
            "siddhivinayak hopital ,near KTHM colege ,gangapur road nashik.",
            "chopada hospital canada corner ,nashik",
            "pawar hospital,gharpure ghat ,ashok sthambh nashik",
            "city care hospital, puna road ,near nasardi bridge,nashik",
            "balaji hospital,deolali ,nashik road ,nashik",
            "indira gandhi hospital panchavati karanja,nashik",
            "Dr jhakhir hussain hospital dwarka ,nashik",
            "I.S.P hospital,nashik road ,nashik",
            "Sanjeevani hospital,near police station ,nashik",
            "Life care hospital,lekha nagar,cidco ,nashik.",
    };

    String[][] childlist1 = {
            {
                    "02532572038"
            },
            {
                    "02532314605"
            },
            {
                    "02536066677"
            },
            {
                    "02532386001"
            },
            {
                    "02532353770"
            },
            {
                    "+918888871151"
            },
            {
                    "02532577717"
            },
            {
                    "9823675392"
            },
            {
                    "02532372471"
            },
            {
                    "02532391001"
            },
            {
                    "02532597904"
            },
            {
                    "02532503201"
            },
            {
                    "02532466767"
            },
            {
                    "02532573496"
            },
            {
                    "02532501888"
            },
            {
                    "02532591739"
            },
            {
                    "02532463414"
            },
            {
                    "02532311064"
            },
            {
                    "02532318990"
            },
            {
                    "02532534882"
            },
            {
                    "02532303923"
            },
            {
                    "02532594762"
            },
            {
                    "02532351045"
            },
            {
                    "02532592666"
            },
            {
                    "02532316200"
            },
            {
                    "02536692100"
            },
            {
                    "02532508802"
            },
            {
                    "02532580647"
            },
            {
                    "02532595982", "02532595983"
            },
            {
                    "02532465722"
            },
            {
                    "02536624121"
            },
            {
                    "02532576106"
            },
            {
                    "02532594762"
            },
            {
                    "02532303802", "02532303925"
            },
            {
                    "02532574949", "02532576656"
            },
            {
                    "02532314786"
            },
            {
                    "02532573496"
            },
            {
                    "02532311064"
            },
            {
                    "02532575785"
            },
            {
                    "02532314661"
            },
            {
                    "02532580477", "02532570232"
            },
            {
                    "02532511613"
            },
            {
                    "02532318274"
            },
            {
                    "02532505771", "02532505772"
            },
            {
                    "025322468600"
            },
            {
                    "02532621331"
            },
            {
                    "02532590049"
            },
            {
                    "02532465672"
            },
            {
                    "02532621122"
            },
            {
                    "025322596669"
            },

    };

    public MyHelpAdapter(Context context) {
        // TODO Auto-generated constructor stub
        this.context = context;

    }

    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return parentlist1.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        // TODO Auto-generated method stub
        return childlist1[groupPosition].length;
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
        view = inflate.inflate(R.layout.help_parent, null);
        tv = (TextView) view.findViewById(R.id.xtxvwExpndparenttxt);
        tv.setText(parentlist1[groupPosition]);

        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        TextView tv;
        LayoutInflater inflate = LayoutInflater.from(context);
        view = inflate.inflate(R.layout.help_child, null);
        tv = (TextView) view.findViewById(R.id.xtxvwExpndChildtxt);
        tv.setText(childlist1[groupPosition][childPosition]);
        view.setTag("" + groupPosition);
        view.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                int pos = Integer.parseInt(view.getTag().toString());

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + childlist1[pos][0]));
                context.startActivity(callIntent);
            }
        });
        return view;
    }


    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return true;
    }

}


