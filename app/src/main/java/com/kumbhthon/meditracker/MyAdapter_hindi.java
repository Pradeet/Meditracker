package com.kumbhthon.meditracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter_hindi extends BaseExpandableListAdapter
{
private Context context;


String []parentlist={"कीड़े के काटने पर",
		"बेहोशी होने पर",
		"सांप के काटने पर",
		"चुहे के काटने पर",
		"आंख मे चोट लगने पर",
		"बिजली का झटका लगने पर",
	
		"काटने या जखम होने पर",
		"बुखार होने पर",
		"मोच या खिचान होने पर",
		"कुत्ते के काटने पर",
};
		
String [][]childlist={
	
		{ 
			"१. दंश को निकाल दे|",
			"२. काटने वाले स्थान को साबुन व पानी से धोए|",
			"३. दर्द, लालिमा, सूजन के लक्षणों का निरिक्षण करे|",
			"४. आगे के इलाज के लिए मेडिकल सहायता ले|",
			
		},
					
			{
				"१. बेहोशी के अवस्था मे उसे सिर निचे व पैर ऊपर की अवस्था मे जमीन पर लिटा दे|",
				"२. अगर कसे कपडे पहने हो तो ढीले कर दे|",
				"३. जहा लिटाए हो उस स्थान को हवादार रखे।",
				"४. चेहरे को ठंडे पानी से भिगे कपडे से पोछे।",
				"५. आगे के इलाज के लिए मेडिकल सहायता ले|",

				},
			  		
			  		{
					 "१. घाव को साफ करें।",
				     "२. उस स्थान को रगडे या मसले नही।",
				     "३. दंश स्थान पर चीरा नही लगाए ।",         
				     "४. स्पलिट का प्रयोग करके दंश वाले बाजु को स्थिर रखे।",
				     "५. बॅंडेज को कसकर बांधे।",
				     
				     },
				     
			  		{
				    	 "१. काटे हुए स्थान साबुन,सेवलॉन या पानी से धोए।",
				    	 "२. घाव के स्थान पर स्वच्छ सुखी मलमपट्टी करे।",
				    	 "३. घाव की जगह स्वच्छ रखे।",
				    	 "४. आगे के इलाज के लिए अस्पताल सहायता ले।",
			  		},
			  		
			  		{
			  			"a. रासायनिक चिज के सम्पर्क मे आने पर  :-",
			  			"१. आख को  मसले नही ।",
			  			"२. आखो को तुरन्त साफ पानी से धोए।", 
			  			"३. बॅंडेज न लगाए।",
			  			"४. आगे के इलाज के लिए मेडिकल सहायता ले।",
	
			  			"b. चोट लगने पर :-",
			  			"१. स्थान पर बर्फ लगाए।",
			  			"२. दबाए नही।", 
			  			"३. आगे के इलाज के लिए अस्पताल सहायता ले।",
			  			
			  			"c. आंखों मे कुछ चले जाने पर :-",
			  			"१. आख को  मसले नही।",
			  			"२. नीचे की पलको को नीचे की और खिचे व बार बार पलक झपकाए।", 
			  			"३. आंखों को स्वच्छ पानी से धोए।",
			  			"४. आगे के इलाज के लिए अस्पताल सहायता ले।",
			  			
			  			"d. आख  मे कट जाने पर:-",
			  			"१. आंखों को निर्जंतुक जाज से ढके।",
			  			"२. कोल्ड कर्शर्म्पेन करे व रक्त के बहाव को रोकने के लिेए।", 
			  			"३. आगे के इलाज के लिए अस्पताल सहायता ले।",
			  		},
			  			
			  			{
			  				"१. मेन स्विच बंद करे।",
			  				"२. बिजली का झटका लगने वाली व्यक्ति की मदद करे।",
			  				"३. आगे के इलाज के लिए अस्पताल सहायता ले।",
			  				
				  		},
			  		
			  		{
				  			"१. स्वच्छ पानी से धोए साबुन का प्रयोग न करे।",
				  			"२. गन्दगी,खराब हो गयी कोशिकाओ को स्थान से हटा दे।",
				  			"३. अगर खुन बह रहा हो तो बॅंडेज से दबाव दे।",
				  			"४. आगे के इलाज के लिए अस्पताल सहायता ले।",
				  			},
				  			
			  		{
				  				"१. मरीज को ठंड स्थान पर रखे।",
				  				"२. अनावश्यक कपडो को उतार दे।",
				  				"३. स्पंज के पानी से भिगोकर मरिज को उससे पोछे।",
				  				"४. आगे के इलाज के लिए अस्पताल सहायता ले।",
			  		},
			  		
			  		{
			  			"१. काम न करे, आराम करे।", 
			  			"२. सुजन कम करने वाला जेल लगाए।",
			  			"३. सुजन कम करने वाली दवाइया ले।", 
			  			"४. आगे के इलाज के लिए अस्पताल सहायता ले।",
			  			}, 
	
			  		{
			  				"१. कुत्ते की लार को जखम से धोकर साफ करे।",
			  				"२. घाव को अच्छी तरह से धोए।",
			  				"३. घाव को निर्जंतुक मलमपट्टी से ढके।",  
			  				"४. आगे के इलाज के लिए अस्पताल सहायता ले।", 
			  		}
			  				  				
};


public MyAdapter_hindi(Context context) {
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
