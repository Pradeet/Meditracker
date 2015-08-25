package com.kumbhthon.meditracker.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.kumbhthon.meditracker.R;

import java.util.ArrayList;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

public class HospitalsDirectoryAdapter extends BaseAdapter implements StickyListHeadersAdapter {

    Context context;
    ArrayList<row_item> data;
    LayoutInflater inflater;

    String[] HospitalList = {
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
                    "Government Hospitals", "02532572038"
            },
            {
                    "Government Hospitals", "02532314605"
            },
            {
                    "Government Hospitals", "02536066677"
            },
            {
                    "Government Hospitals", "02532386001"
            },
            {
                    "Government Hospitals", "02532353770"
            },
            {
                    "Government Hospitals", "+918888871151"
            },
            {
                    "Government Hospitals", "02532577717"
            },
            {
                    "Government Hospitals", "9823675392"
            },
            {
                    "Government Hospitals", "02532372471"
            },
            {
                    "Government Hospitals", "02532391001"
            },
            {
                    "Government Hospitals", "02532597904"
            },
            {
                    "Government Hospitals", "02532503201"
            },
            {
                    "Government Hospitals", "02532466767"
            },
            {
                    "Government Hospitals", "02532573496"
            },
            {
                    "Government Hospitals", "02532501888"
            },
            {
                    "Government Hospitals", "02532591739"
            },
            {
                    "Government Hospitals", "02532463414"
            },
            {
                    "Government Hospitals", "02532311064"
            },
            {
                    "Government Hospitals", "02532318990"
            },
            {
                    "Government Hospitals", "02532534882"
            },
            {
                    "Government Hospitals", "02532303923"
            },
            {
                    "Government Hospitals", "02532594762"
            },
            {
                    "Government Hospitals", "02532351045"
            },
            {
                    "Government Hospitals", "02532592666"
            },
            {
                    "Government Hospitals", "02532316200"
            },
            {
                    "Government Hospitals", "02536692100"
            },
            {
                    "Government Hospitals", "02532508802"
            },
            {
                    "Government Hospitals", "02532580647"
            },
            {
                    "Government Hospitals", "02532595982", "02532595983"
            },
            {
                    "Government Hospitals", "02532465722"
            },
            {
                    "Government Hospitals", "02536624121"
            },
            {
                    "Government Hospitals", "02532576106"
            },
            {
                    "Government Hospitals", "02532594762"
            },
            {
                    "Government Hospitals", "02532303802", "02532303925"
            },
            {
                    "Government Hospitals", "02532574949", "02532576656"
            },
            {
                    "Government Hospitals", "02532314786"
            },
            {
                    "Government Hospitals", "02532573496"
            },
            {
                    "Government Hospitals", "02532311064"
            },
            {
                    "Government Hospitals", "02532575785"
            },
            {
                    "Government Hospitals", "02532314661"
            },
            {
                    "Government Hospitals", "02532580477", "02532570232"
            },
            {
                    "Government Hospitals", "02532511613"
            },
            {
                    "Government Hospitals", "02532318274"
            },
            {
                    "Government Hospitals", "02532505771", "02532505772"
            },
            {
                    "Government Hospitals", "025322468600"
            },
            {
                    "Government Hospitals", "02532621331"
            },
            {
                    "Government Hospitals", "02532590049"
            },
            {
                    "Government Hospitals", "02532465672"
            },
            {
                    "Government Hospitals", "02532621122"
            },
            {
                    "Government Hospitals", "025322596669"
            },

    };

    public HospitalsDirectoryAdapter(Context context) {
        this.context = context;
        this.data = getData();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    private ArrayList<row_item> getData() {
        ArrayList<row_item> finalData = new ArrayList<>();
        for (int i = 0; i < HospitalList.length; i++) {
            finalData.add(new row_item(HospitalList[i], "Government Hospitals"));
        }
        return finalData;
    }

    @Override
    public int getCount() {
        return HospitalList.length;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        viewHolder holder = new viewHolder();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.help_parent, parent, false);
            holder.Hospital_name = (TextView) convertView.findViewById(R.id.xtxvwExpndparenttxt);
            convertView.setTag(holder);
        } else {
            holder = (viewHolder) convertView.getTag();
        }

        String text = data.get(position).HospitalName;
        holder.Hospital_name.setText(text);
        holder.Hospital_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(context).title("Contact Number").adapter(new HospitalDirectoryDialogAdapter(position),
                        new MaterialDialog.ListCallback() {
                            @Override
                            public void onSelection(MaterialDialog materialDialog, View view, int i, CharSequence charSequence) {
                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:" + childlist1[position][i + 1]));
                                context.startActivity(callIntent);
                            }
                        }).show();
            }
        });

        return convertView;
    }

    @Override
    public View getHeaderView(final int position, View convertView, ViewGroup parent) {
        headerViewHolder holder = new headerViewHolder();
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.hospital_locator_header, parent, false);
            holder.HospitalType = (TextView) convertView.findViewById(R.id.HospitalLocatorHeaderTextView);
            convertView.setTag(holder);
        } else {
            holder = (headerViewHolder) convertView.getTag();
        }

        String tag = data.get(position).Type;
        holder.HospitalType.setText(tag);

        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        return data.get(position).Type.hashCode();
    }

    class viewHolder {
        TextView Hospital_name;
    }

    class headerViewHolder {
        TextView HospitalType;
    }

    class row_item {
        String HospitalName;
        String Type;

        public row_item(String hospitalName, String type) {
            HospitalName = hospitalName;
            Type = type;
        }
    }

    private class HospitalDirectoryDialogAdapter extends BaseAdapter {

        private int Parentposition;

        public HospitalDirectoryDialogAdapter(int position) {
            this.Parentposition = position;
        }

        @Override
        public int getCount() {
            return childlist1[Parentposition].length - 1;
        }

        @Override
        public Object getItem(int position) {
            return childlist1[Parentposition][position + 1];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, final ViewGroup parent) {
            viewHolder holder = new viewHolder();

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.help_parent, parent, false);
                holder.Hospital_name = (TextView) convertView.findViewById(R.id.xtxvwExpndparenttxt);
                convertView.setTag(holder);
            } else {
                holder = (viewHolder) convertView.getTag();
            }
            holder.Hospital_name.setText(childlist1[Parentposition][position + 1]);
            return convertView;
        }
    }
}
