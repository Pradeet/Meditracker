package com.kumbhthon.meditracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter_english extends BaseExpandableListAdapter
{
private Context context;


String []parentlist={"Insect bite","Fainting","Snake bite","RAT bite","Eye injury","Electric shock","Cuts & Wounds","Fever","Sprains & Strains","Dog bite"};

String [][]childlist={
		{ 
			"1. Remove the Stinger.", 
 "2. Wash the site throughly with soap & water.",
 "3. Observe signs of pain, redness, swelling.", 
 "4. Seek for medical help for further treatment.",
		},
		
		{ 
			"1. When someone  faint, help the person to lie down with his/her head low & legs raised.", 
 "2. Loose his/her tight clothing.",
 "3. Ventilate the area.",
 "4. Wipe the face with cool wash cloth.",
 "5. Seek for medical help for further treatment.",
			
		},
		
		{ 
			"1. Clean the wound.",
"2. Do not rub or scrub violently.",
"3. Do not make incision at the site of bite.",
"4. Immobilize the bitten limb using splint.",
"5. Make a pressure bandage.",
"6. Patient should be taken to hospital.",
	
		},
		
		{ 
			"1. Clean the wound with soap, savlon & water.",
 "2. Cover wound with clean dry dressing.",
 "3. Keep the area of wound clean.",
 "4. Visit hospital for further management.",
		},
		
		{
			"a. For Chemical Exposure to eye :-",
			"1. Dont rub eyes.",  
"2. Immediately wash the eye with clean water.",  
"3. Dont bandage the eye.",  
"4. Get medical help.",

"b. For blow to eye :-",
"1. Apply cold compression.",
"2. Dont press eye.",
"3. Visit eye specialist.",

"c. For a foreign particle in eye :-",
"1. Dont rub eyes.",
"2. Pull the lower laid down & blink repeatedly.",
"3. Rinse with eye wash.",
"4. Visit doctor for further treatment.",

"d. For cut's to eye :-",
"1. Gently cover eye with sterile gauze.",
"2. Apply cold compression for pain, bleeding, swelling.",
"3. Seek medical help for further treatment.",
		},
		
		{
			"1. First step is to switch off the current source.",
"2. Attend to the victim.", 
"3. Seek for hospital for further treatment.", 

		},
		{
			
			"1. Clean wound with water, avoid soap.", 
"2. Remove dirt/debris in the wound.", 
"3. For dressing visit hospitals.",
"4. Apply genital pressure if bleeding persist."

		},
		
		{
			"1. Keep patient in cool place.",
"2. Remove excess clothing.",
"3. Give sponge bath.",
"4. Visit doctor for further help.",

		},
		
		{
			"1. Stop the work & rest.", 
"2. Apply anti inflammatory gel.", 
"3. Can take anti inflammatory drug.",
"4. Visit doctor for further help.",

		},
		
		{
			"1. Wipe the saliva away from the wound.",
"2. Wash the wound throughly with plenty of soap water.",
"3. Cover the wound with dry sterile dressing.",
"4. Get medical aid aid as soon as possible.",

		},
				};
public MyAdapter_english(Context context) {
	// TODO Auto-generated constructor stub
	this.context=context;
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
		View convertView, ViewGroup parent) 
	{
	// TODO Auto-generated method stub
	View view;
	TextView tv;
	LayoutInflater inflate=LayoutInflater.from(context);
	view=inflate.inflate(R.layout.expandable_parentvw, null);
	/*TextView tv=new TextView(context);
	tv.setText(parentlist[groupPosition]);
	tv.setPadding(50, 10, 10, 10);
	tv.setTextSize(25);
	tv.setTextColor(Color.WHITE);*/
	tv=(TextView)view.findViewById(R.id.xtxvwExpndparenttxt);
	tv.setText(parentlist[groupPosition]);
	
	return view;
}

@Override
public View getChildView(int groupPosition, int childPosition,
		boolean isLastChild, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	
	View view;
	TextView tv;
	LayoutInflater inflate=LayoutInflater.from(context);
	view=inflate.inflate(R.layout.expandable_childvw, null);
/*	TextView tv=new TextView(context);
	tv.setText(childlist[groupPosition][childPosition]);
	tv.setPadding(50, 10, 10, 10);
	tv.setTextSize(20);
	tv.setTextColor(Color.GRAY);
	*/
	tv=(TextView)view.findViewById(R.id.xtxvwExpndChildtxt);
	tv.setText(childlist[groupPosition][childPosition]);
	
	
	return view;
	
}

@Override
public boolean isChildSelectable(int groupPosition, int childPosition) {
	// TODO Auto-generated method stub
	return true;
}

}
