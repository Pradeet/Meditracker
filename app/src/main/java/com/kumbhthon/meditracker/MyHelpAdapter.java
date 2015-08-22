package com.kumbhthon.meditracker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyHelpAdapter extends BaseExpandableListAdapter
{
private Context context;
View view;;

String []parentlist1={"Civil Hospital","Suman Shatabdi Hospital","Six Sigma Medicare & Research ltd.","Vakratunda Multispeciality Hospital","Sarthak hospital Pvt. Ltd.","Ashwini Multi Speciality Hospital","Sushrut Hospital","Sai Shraddha hospital","Nerlikar hospital","Swami citycare hospital","sahyadri Hospital","Rajebahadur Haspital","sujata Birla Memorial Hospital","Samarth Hospital","Shatabdi Hospital ","Nashik Hospital ","jairam Hospital","suman Hospital","Suyash Hospital","NAMCO Hospital","MVP Medical College","Superspeciality Hospital","ESIS Hospital","Curie Manavta Hospital","Magum Heart Inst.","Saibaba Heart Inst.","Kilbil","Nelson","Chiranjeev","Bytco Hospital","Wockhardt Hospital"};

String [][]childlist1={
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
"8888871151"
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
"06692100"
},
{
"02532508802"
},
{
"02532580647"
},
{
"02532595982","02532595983"
},
{
"02532465722"
},
{
"06624121"
}
};

public MyHelpAdapter(Context context)
{
	// TODO Auto-generated constructor stub
	this.context=context;
	
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
		View convertView, ViewGroup parent) 
	{
	// TODO Auto-generated method stub
	View view;
	TextView tv;
	LayoutInflater inflate=LayoutInflater.from(context);
	view=inflate.inflate(R.layout.help_parent, null);
	/*TextView tv=new TextView(context);
	tv.setText(parentlist[groupPosition]);
	tv.setPadding(50, 10, 10, 10);
	tv.setTextSize(25);
	tv.setTextColor(Color.WHITE);*/
	tv=(TextView)view.findViewById(R.id.xtxvwExpndparenttxt);
	tv.setText(parentlist1[groupPosition]);
	
	return view;
}

@Override
public View getChildView(int groupPosition, int childPosition,
		boolean isLastChild, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	
	TextView tv;
	LayoutInflater inflate=LayoutInflater.from(context);
	view=inflate.inflate(R.layout.help_child, null);
/*	TextView tv=new TextView(context);
	tv.setText(childlist[groupPosition][childPosition]);
	tv.setPadding(50, 10, 10, 10);
	tv.setTextSize(20);
	tv.setTextColor(Color.GRAY);
	*/
	tv=(TextView)view.findViewById(R.id.xtxvwExpndChildtxt);
	tv.setText(childlist1[groupPosition][childPosition]);
	view.setTag(""+groupPosition);
	view.setOnClickListener(new OnClickListener()
	{
		
		@Override
		public void onClick(View arg0)
		{
			int pos=Integer.parseInt(view.getTag().toString());
			
			      Intent callIntent = new Intent(Intent.ACTION_DIAL);          
	            callIntent.setData(Uri.parse("tel:"+childlist1[pos][0]));          
	            context.startActivity(callIntent); 
		}
	});
	
	return view;
	
}


@Override
public boolean isChildSelectable(int groupPosition, int childPosition) 
{
	// TODO Auto-generated method stub
	return true;
}

}

