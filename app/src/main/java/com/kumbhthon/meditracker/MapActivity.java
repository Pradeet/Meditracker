package com.kumbhthon.meditracker;

import java.util.ArrayList;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapActivity extends FragmentActivity 
{
	// Google Map
    private GoogleMap googleMap;
  /* private static double lat[] ={20.012149,
		20.012346,
		20.012003,
		20.011977,
		20.007371,
		20.008194,
		20.008194,
		20.006041,
		20.00577,
		20.005401,
		20.00503,
		20.004596,
		20.004187,
		19.9617863,
		19.9641033,
		19.9649911,
		19.9681921,
		19.9681952,
		19.9690207,
		19.9709212,
		19.9737874,
		19.9746262,
		19.9765494,
		19.9767798,
		19.9770289,
		19.977186,
		19.9803555,
		19.9830052,
		19.9837591,
		19.9843266,
		19.9869056,
		19.9856034,
		19.9836093,
		19.983605,
		19.9828014,
		19.9815567,
		19.9815567,
		19.981915,
		19.981915,
		19.9755088,
		19.9742151,
		19.9730521,
		19.9729885,
		19.9713196,
		19.9705322,
		19.9733131,
		19.9728503,
		19.9728503,
		19.975421,
		19.976223,
		19.9777581,
		19.9777297,
		19.9848799,
		19.9855712,
		19.9892996,
		19.9894991,
		19.9709227,
		19.980058,
		19.9830052,
		19.9843281,
		19.9847823,
		19.9847823,
		19.95605664,
		19.9676067,
		19.9695518,
		19.9719422,
		19.9723656,
		19.9725432,
		19.975441,
		19.9825453,
		19.9846502,
		19.9879938,
		19.9908929,
		20.0119105,
		20.0133538,
		20.0140828,
		20.015186,
		20.0114551,
		20.0123961,
		20.0123146,
		20.0102117,
		20.0027901,
		19.9980758,
		20.0028975,
		20.0031496,
		20.0080997,
		20.0081994,
		20.0057544,
		20.005471,
		20.0049575,
		20.0040839,
		20.0044625,
		20.0048561,
		20.004855,
		20.005292,
		20.0057365,
		20.0070801,
		20.0028149,
		20.0081994,
		//nashik_road
		19.9799633,
		19.9799633,
		19.9788183,
		19.9771066,
		19.9699683,
		19.9701833,
		19.9707066,
		19.9596116,
		19.9572432,
		19.9572432,
		19.9581633,
		19.9583583,
		19.954315,
		19.9568733,
		19.957745,
		19.957745,
		19.957745,
		19.957745,
		19.9616016,
		19.9616016,
		19.9616016,
		19.9597066,
		19.9597066,
		19.9522333,
		19.9530266,
		19.9530266,
		19.9540583,
		19.95683,
		19.9581766,
		19.96331,
		19.976765,
		19.977465,
		19.977465,
		19.9757849,
		19.9809616,
		19.9809616,
		19.980725,
		19.980725,
		19.9805533,
		19.9804833,
		19.9804833,
		//mhasrul
		20.0354432,
		20.0472531,
		20.0472531,
		20.0399845,
		20.0112415,
		20.0112554,
		20.0095077,
		20.0472531,
		20.0472531,
		20.0409681,
		20.0347544,
		20.0151667,
		20.0141847,
		20.0144829,
		20.0134601,
		20.0139627,
		20.0399845,
		20.0354432,
		20.0139627,
		20.0354432,
		20.0327371,
		20.0335963,
		20.0354432,
		20.0354432,
		20.0135221,
		20.0135221,
		20.0112415,
		20.0472531,
		20.0327371,
		//cidco
		19.9919197,
		19.9918978,
		19.9898475,
		19.9695439,
		19.9695439,
		19.9694764,
		19.9694764,
		19.969403,
		19.96927,
		19.9691304,
		19.9690987,
		19.9689799,
		19.9689799,
		19.9682489,
		19.9686708,
		19.9695044,
		19.9686153,
		19.9682489,
		19.9686708,
		19.9731901,
		19.9738338,
		19.9742155,
		19.9758396,
		19.9758396,
		19.9729063,
		19.9724943,
		19.9703496,
		19.9698597,
		19.9701878,
		19.9763882,
		19.9757194,
		19.9729062,
		19.9729062,
		19.9703496,
		19.9698216,
		19.9693273,
		19.9691381,
		19.9690738,
		19.9693423,
		19.9693423,
		19.9693423,
		19.9693992,
		19.9694311,
		19.9686708,
		19.9686708,
		19.9691055,
		//trimbak
		19.9363883,
		19.9367151,
		19.9339958,
		19.9347898,
		19.9337299,
		19.9335757,
		19.9338167,
		19.9338956,
		19.9338872,
		19.9339044,
		19.9353255,
		19.9391411,
		19.9328464,
		19.9325028,
		19.933876,
		19.9339999,
		19.93378,
		19.934188,
		//panchavati
		20.0070533,
		20.0069778,
		20.0073999,
		20.0073999,
		20.0075339,
		20.0100351,
		20.0100288,
		20.0103171,
		20.0103171,
		20.0103171,
		20.0106277,
		20.0114041,
		20.0114041,
		20.0114041,
		20.0114041,
		20.0114041,
		20.0114041,
		20.0114041,
		20.0114041,
		20.0114041,
		20.0088228,
		19.999231,
		19.9970723,
		19.9970723,
		19.9970723,
		19.9970723,
		19.9970723,
		19.9941403,



    		};
    private static double longi[] = 
    	{
    	 73.748308,
		   73.747919,
		   73.758447,
		   73.758927,
		   73.758519,
		   73.758448,
		   73.758448,
		   73.762869,
		   73.764615,
		   73.766763,
		   73.76806,
		   73.761313,
		   73.769716,
		   73.7542377,
		   73.7534773,
		   73.75362,
		   73.7533209,
		   73.75332,
		   73.7534856,
		   73.7538621,
		   737545346,
		   73.7545942,
		   73.7547407,
		   73.7545109,
		   73.7547916,
		   73.754884,
		   73.7551772,
		   73.7559096,
		   73.7564589,
		   73.7566618,
		   73.758796,
		   73.7575469,
		   73.7565636,
		   73.7565565,
		   73.7561563,
		   73.7555746,
		   73.7555746,
		   73.754039,
		   73.754039,
		   73.7548609,
		   73.7547115,
		   73.7546191,
		   73.7545516,
		   73.7536297,
		   73.752435,
		   73.7498064,
		   73.7479067,
		   73.7479067,
		   73.7470218,
		   73.7469272,
		   73.7468686,
		   73.7468457,
		   73.7488064,
		   73.748925,
		   73.7497221,
		   73.7496112,
		   73.753852,
		   73.7552165,
		   73.7559096,
		   73.7566602,
		   73.7568674,
		   73.7568674,
		   73.7598401,
		   73.7683686,
		   73.7666945,
		   73.7724375,
		   73.7730683,
		   73.773319,
		   73.7758508,
		   73.7816096,
		   73.7828539,
		   73.7838043,
		   73.790592,
		   73.7897232,
		   73.7882459,
		   73.7881996,
		   73.7877653,
		   73.7881933,
		   73.7938063,
		   73.7943886,
		   73.7952487,
		   73.7872798,
		   73.7540959,
		   73.7543012,
		   73.7543175,
		   73.7582577,
		   73.7583507,
		   73.7645562,
		   73.7665373,
		   73.7689516,
		   73.7698002,
		   73.7687647,
		   73.7681293,
		   73.7681282,
		   73.7667149,
		   73.7649275,
		   73.7593336,
		   73.7545825,
		   73.7583507,
		   //Nashik_road
		   73.8047966,
		   73.8047966,
		   73.8083366,
		   73.809955,
		   73.821175,
		   73.8214816,
		   73.8221949,
		   73.830465,
		   73.8334383,
		   73.8334383,
		   73.8344999,
		   73.8349233,
		   73.837465,
		   73.838305,
		   73.83838,
		   73.83838,
		   73.83838,
		   73.83838,
		   73.8391766,
		   73.8391766,
		   73.8391766,
		   73.838995,
		   73.838995,
		   73.8397733,
		   73.8387383,
		   73.8387383,
		   73.83727,
		   73.833755,
		   73.83201,
		   73.8253316,
		   73.810025,
		   73.8047633,
		   73.8047633,
		   73.8035783,
		   73.7965866,
		   73.7965866,
		   73.7980582,
		   73.798058,
		   73.7992933,
		   73.8010316,
		   73.8010316,
		   //mhasrul
		   73.8033556,
		   73.8059981,
		   73.8059981,
		   73.8072986,
		   73.7968189,
		   73.7965651,
		   73.8053809,
		   73.8059981,
		   73.8059981,
		   73.8061701,
		   73.8037669,
		   73.7964842,
		   73.7960542,
		   73.7959075,
		   73.7959742,
		   73.796373,
		   73.8072986,
		   73.8033556,
		   73.796373,
		   73.8033556,
		   73.8032887,
		   73.8050365,
		   73.8033556,
		   73.8033556,
		   73.7964249,
		   73.7964249,
		   73.7968189,
		   73.8059981,
		   73.8032887,
		   //cidco
		   73.7661827,
		   73.7658069,
		   73.7621533,
		   73.7543569,
		   73.7543569,
		   73.7544453,
		   73.7544453,
		   73.7547669,
		   73.7554035,
		   73.7561698,
		   73.7563285,
		   73.7569868,
		   73.7569868,
		   73.7593403,
		   73.7607687,
		   73.7665994,
		   73.7653121,
		   73.7593403,
		   73.7607687,
		   73.7653422,
		   73.7660208,
		   73.7663719,
		   73.7680308,
		   73.7680308,
		   73.7732391,
		   73.7725719,
		   73.7703375,
		   73.7619416,
		   73.7623571,
		   73.7698184,
		   73.7705815,
		   73.7732391,
		   73.7732391,
		   73.7703375,
		   73.7699271,
		   73.7695095,
		   73.7693411,
		   73.7686961,
		   73.7677822,
		   73.7677822,
		   73.7677822,
		   73.7673777,
		   73.7671261,
		   73.7607687,
		   73.7607687,
		   73.7612532,
		   //trimbak
		   73.5350873,
		   73.5343033,
		   73.5324229,
		   73.5321526,
		   73.5313305,
		   73.531086,
		   73.531203,
		   73.5314096,
		   73.5314426,
		   73.531647,
		   73.5324988,
		   73.5384581,
		   73.526655,
		   73.530415,
		   73.5305069,
		   73.5298007,
		   73.5301786,
		   73.5295272,
		   //panchavati
		   73.7848987,
		   73.7895942,
		   73.789777,
		   73.789777,
		   73.7898739,
		   73.7935557,
		   73.7942431,
		   73.795092,
		   73.795092,
		   73.795092,
		   73.7952179,
		   73.7962562,
		   73.7962562,
		   73.7962562,
		   73.7962562,
		   73.7962562,
		   73.7962562,
		   73.7962562,
		   73.7962562,
		   73.7962562,
		   73.801986,
		   73.782221,
		   73.7804837,
		   73.7804837,
		   73.7804837,
		   73.7804837,
		   73.7804837,
		   73.7720935,




    		};*/
    private static String nameHosp[] = {"\nShri Guruji Hospital\n",
		"\nBhosale Hospital\n",
		"\nSmruti Clinic\n",
		"\nMate Clinic\n",
		"\nBoraste Maternity Hospital\n",
		"\nAccident and Superspeciality Center\n",
		"\nShurshil Eye Hospital\n",
		"\nClassical Homeo Clinic\n",
		"\nSuman Shatavdi Hospital\n",
		"\nVijan Hospital\n",
		"\nWellness Forever\n",
		"\nShree Bajaj Hospital\n",
		"\nCity Dental Hospital\n",
		"Siddhivinayak Hosp",
		"Shree worad Clinic",
		"Aarya Dental Clinic",
		"Mahale Hospital",
		"Kalpataru Mulltispeciality hospital",
		"Rajesh Clinic",
		"Niramay Homio Clinic",
		"Seva Clinic ",
		"Yashmala Dentist",
		"Suraj Clinic",
		"Gosavi Hospital",
		"Family Clinic",
		"Samrath Clinic",
		"Samrath Clinic",
		"Omkar Clinic",
		"Bhagvati Eye Hospital",
		"Sai Clinic",
		"Balaji Hospital",
		"Sidhant Dentist",
		"pushkar Eye Hospital",
		"Ajinkya Clinic",
		"Desle Clinic",
		"Dr. Roy Clinic",
		"Sidhi Clinic",
		"Spandan Hospital",
		"Trimurti Hospital",
		"Sinarji Clinic",
		"Surendra janjire orthopedic Clinic",
		"More Hospital",
		
		"Ekdant Dentist",
		"Ishawarkrupa Maternity",
		"Bhameshwar Clinic",
		"Sanjeevani Hospital",
		"Radha Clinic",
		"Sarvadhaya Dentist",
		"Chavan Hospital",
		"Bhamre Clinic",
		"Aaditya Clinic (Dentist)",
		"Navsanjeevan Clinic",
		"sukhakarta Hospital",
		"Om Dential Clinic",
		"Siddhi Mutha Hospital",
		"Sushil Eye Hospital Institute",
		"Nima Hospital",
		"Sholk clinic",
		"Ekdant Dentist",
		"Shree clinic",
		"Sushrusha clinic",
		"Renuka clinic",
		"Samarthe hospital",
		"Shreeniwas Hospital",
		"Dr. Gawali General clinic", 
		"Pratham Hospital",
		"Sunshine Hospital",
		"Life care Hospital",
		"Gunjal Hospital",
		"Phoenix Hospital",
		"Apolo clinic",
		"Shatabdi Hospital",
		"Wokhardt Hospital",
		"Anand Hospital",
		"Hariom Clinic ",
		"Shraddha Clinic",
		"Muktagangi Clinic",
		"Bacchav Hospital ",
		"Yashawant Hospital",
		"Nirmay Hospital",
		"Mulwyadh Bhagandar Hospital",
		"Rajebahaddar Hospital",
		"Shree shiv clinic",
		"Shree clinic",
		"Dental Implant center",
		"Chikitsa clinic",
		"Motwani speciallity hosp",
		"jeevan heart care",
		"Dental speciallity clinic",
		"Shree Balaji hospital",
		"City dental Center",
		"Saishishu clinic",
		"Tembe polyclinic",
		"Chaudhari hospital",
		"Vijan hospital",
		"Suman Shatabdi hospital",
		"Sushil eye hospital",
		"Six Sigma Hospital",
		"Super Speciality Dental clinic",
		//Nashik Road
		"Ayucare clinic",
		"Swara dentist",
		"Agrwal dentist",
		"Gurudev dentist",
		"Karwas dentist",
		"Shushrusha hospital",
		"Ichhamani clinic",
		"Sujata birla hospital",
		"Dr. Prasad clinic",
		"Dental health clinic",
		"Super speciality dental clinic",
		"Gujrathi hospital",
		"Bhutda's clinic",
		"Jivanjyot hospital",
		"Jyoti hospital",
		"Nathkrupa clinic",
		"Krupa Sai hospital",
		"Mogal Hospital",
		"Musale homiopathic clinic",
		"Denton dental care",
		"Shree Ram hospital",
		"Dhingra hospital",
		"Criticare hospital",
		"DantPratibha dentist",
		"Dr. Gosavi clinic",
		"Nimase hospital",
		"Vabale maternity hospital",
		"Dr. Jikare dentist",
		"Cosmatic dentist",
		"India Security press hospital",
		"Rajyog hospital",
		"Rushi dentist",
		"Bhadange clinic",
		"Gurudev clinic", 
		"Samarth Sai hospital",
		"Chaitnya hospital",
		"Chandoba clinic",
		"Arce bone & join clinic",
		"Dr. Ingale's dentist",
		"Health plus clinic",
		" Atharv clinic",
		//mhasrul
		
		"S. S. pharma",
		"Prayag hospital",
		"Cenurgy hospital",
		"shamdeep hospital",
		"vasu clinic",
		"amle hospital",
		"sai seva hospital",
		"parikshit hospital",
		"parvati clinic",
		"seva hospital",
		"onkar clinic",
		"chopda hospital",
		"sanjivani hospital",
		"sahara hospital",
		"suyog hospital",
		"pushkar hospital",
		"shamdeep hospital",
		"om dental clinic",
		"parikshit hospital ",
		"om dental clinic",
		"sakhale hospital",
		"dr. sakhale",
		"lilavati hospital",
		"TB ceneteriam hospital ",
		"Shivkrupa hospital",
		"rajni hospital ",
		"surya hospital",
		"supushpa nursing home",
		"dhanvantari ursing home",
		//cidco
		"Shree skin clinic",
		"investment clinic",
		"Bhagvati eye hosp",
		"Dentist",
		"Manishankar eye hosp",
		"Sashwat clinic",
		"Tirupati hosp",
		"Pradatta clinic",
		"Darde hosp",
		"Sanjivani hosp",
		"Dev dentist",
		"Yash hosp",
		"Om clinic",
		"Swami Hospital ",
		"Dr. Mangesh",
		"Sai Clinic ",
		"shree ram Clinic",
		"swami hospital",
		"dr mangesh",
		"shriram clinic",
		"Samarth clinic",
		"Deeta Clinic",
		"Sai Dental Clinic",
		"Sawitri Clinic",
		"Suvidha Hospital",
		"pratham hospital",
		"sitabai hospital",
		"chintamani hospital",
		"sagar dentist",
		"khode clinic",
		"sai clinic ",
		"life care hospital",
		"mahale eye clinic",
		"bhgagvati hospital",
		"bhat dentist",
		"somani hospital",
		"nest bal rugnalay",
		"good life clinic ",
		"ramole eye hospital",
		"pankaj bal rugnalay",
		"dental clinic",
		"prathamesh clinic",
		"gawali hospital",
		"Dr mangesh",
		"prachiti clinic",
		//timbka
		"ashirwad clinik ",
		"shushrut clinic",
		"upjilha rugnalay",
		"Dr manoj gaikwd hospital",
		"prakruti ayurved clinic",
		"jevan clinic",
		"mauli clinic ",
		"pramod aher clinic",
		"sameer mahajan clinic ",
		"sachin kale clinic",
		"sai ram clinic ",
		"sai clinic",
		"upasani clinic",
		"anil upasni clinic",
		"dilip more hospital",
		"londhe hospital",
		"bhagvati hospital",
		"nath clinic", 
		//panchavati
		"Dr. Makran patel clinic",
		"Satish kibe eye hosp",
		"Sadguru eye clinic",
		"Dentist",
		"Varad clinic",
		"Dentist",
		"Homiopathic clinic",
		"Mulvyadh Hosp",
		"More hosp",
		"Amle eye hosp",
		"Surya hosp",
		"Bhujbal clinic",
		"Dentist",
		"Rao clinic",
		"Aayush bal-rugnalay",
		"Piyush clinic",
		"Vasu clinic",
		"Varad hosp",
		"Ashwini clinic",
		"Vinchurkar hosp",
		"Gurukrupa clinic",
		"Dr Thorat surgen hosp",
		"Dr Chirmade eye specialist",
		"Gati clinic",
		"vimal hosp",
		"Dr jayvant gurati clinic",
		



};
    public static String address[]={
    	    "Pathardi Rd, Indira Nagar, Nashik Maharashtra,680001",
    		"42, Untavadi rd, Jagatap Nagar , Nashik, Maharashtra 680001",
    		"35, krishinagar, college rd, Nashik, Maharashtra 680001",
    		"Gangapur Rd, Patil Colony, Canada Corner, Nashik, Maharashtra,411057 ",
    		"1/3 , College Rd, Patil Colony, Canada Corner, Nashik , Maharashtra422005",
    		"Rane Nagar - Indira nagar link rd, Kishor Nagar , Nashik Maharashtra",
    		"Pelikan Park rd, Uttam Nagar, Nashik Maharashtra",
    		"Pandit Colony Rd, Pandit Colony, Nashik Maharshtra 422005",
    		"Gangapur Rd, Thakkar Nagar, Shivaji Nagar, Nashik, Maharashtra 422005",
    		"Pandit Colony Rd, Pandit Colony, Nashik Maharshtra 422005",
    		"Gangapur Rd, Thakkar Nagar, New Pandit Colony, Nashik, Maharashtra 422005",
    		"Ambad Ttrimurti Chowk Link rd, Mhasoba Nagar, Modkeshwar Nagar , Nashik ,Maharashtra 422007",
    		"Ambad Trumurti Rd Jaihind colony, Mahajan Nagar, Maharashtra,422010 ",
    		"Ambad-Trimurti chowk link road, Saigram nagar, Upendra nagar colony,Nashik, Maharashtra 422010",
    		"Ambad-Trimurti chowk link road, Indraprashta colony, Nashik, Maharashtra 422010",
    		"Ambad-Trimurti chowk link road, Indraprashta colony, Nashik, Maharashtra 422010",
    		"Ambad-Trimurti chowk link road, Jai Hind colony, Mahajan nagar, Nashik, Maharashtra 422010",
    		"Ambad-Trimurti chowk link road, Jai Hind colony, Mahajan nagar, Nashik, Maharashtra 422010",
    		"Ambad-Trimurti chowk link road, Jai Hind colony, Mahajan nagar, Nashik, Maharashtra 422010",
    		"Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Mhasoba nagar, Ambika nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Ambika nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Abhiyanta nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Abhiyanta nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Abhiyanta nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Abhiyanta nagar, Nashik, Maharashtra 422007",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Shivshakti nagar, Nashik, Maharashtra",
    		"42, Untawadi road, Tidke nagar, Nashik, Maharashtra 422008",
    		"42, Untawadi road, Tidke nagar, Nashik, Maharashtra 422008",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Ambad-Trimurti chowk link road, Savata nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Savata nagar, Nashik, Maharashtra 422007",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Ambad-Trimurti chowk link road, Pawan nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Pawan nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
    		"Rugved society, Gajanan nagar, Mahajan nagar, Nashik, Maharashtra",
    		"Modakeshwar nagar road, SAptashrungi nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
    		"Saptshrungi Niwas road, SAptshrungi nagar, Kamatwade Gaon, Nashik, Maharashtra 422010",
    		"Saptshrungi Niwas road, SAptshrungi nagar, Kamatwade Gaon, Nashik, Maharashtra 422010",
    		"Saptshrungi Niwas road, SAptshrungi nagar, Kamatwade Gaon, Nashik, Maharashtra 422010",
    		"IIt Ambad road, Siddhatek nagar, Nashik, Maharashtra 422007",
    		"IIt Ambad road, Siddhatek nagar, Nashik, Maharashtra 422007",
    		"IIt Ambad road, Siddhatek nagar, Nashik, Maharashtra 422007",
    		"IIt Ambad road, Siddhatek nagar, Nashik, Maharashtra 422007",
    		"IIt Ambad road, Kartikey nagar, Khutawad nagar, Nashik, Maharashtra 422007",
    		"IIt Ambad road, MIDC, Satpur, Nashik, Maharashtra 422007",
    		"IIt Ambad road, MIDC, Satpur, Nashik, Maharashtra 422007",
    		"Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
    		"134, Ambad-Trimurti chowk link road, Savata nagar, Nashik, Maharashtra 422007",
    		"Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
    		"Shivshakti nagar, Nashik, Maharashtra",
    		"Shivshakti nagar, Nashik, Maharashtra",
    		"Shivshakti nagar, Nashik, Maharashtra",
    		"patherdi phata , pathardi road prashant nagar patharadi phata nashik 422010",
    		"Chetna nagar national highway 3 , chetna nagar , rane nagar , Nashik 422009",
    		"Sambhaji stadium road , shreeram colony Nashik 422010",
    		"Lekha nagar by pass road , Lekha colony , Nashik 422010",
    		"Lekha nagar by pass road , Lekha colony , Nashik 422010",
    		"Lekha nagar by pass road , Lekha colony , Nashik 422010",
    		"Shanti Nagar, Lekha nagar Nashik 422009",
    		"Govinda nagar nashik ",
    		"Govinda nagar nashik ",
    		"Old agra road , renuka nagar Nashik 422002",
    		"2915, Old agra road , dwarka Nashik 422001",
    		"Makhamalabaad road, Madhuban Colony Nashik 422003",
    		"37, Makhamalabaad road , datta nagar , navanath nagar Nashik 422003",
    		"37, Makhamalabaad road , datta nagar , navanath nagar Nashik 422004",
    		"37, Makhamalabaad road , Ganesh Nagar Hirawadi Nashik 422004",
    		"Ramwadi joggers park, panchavati Nashik 422003",
    		"kalachawki Nashik 422003",
    		"kalachawki Nashik 422003",
    		"Panchavati Nashik 422003",
    		"Wawre lane, Shalimaar Nashik 422001",
    		"Mahatama nagar road, Mahatama nagar, Parijat nagar, Nashik, Maharashtra 422007",
    		"Mahatama nagar road, St Kabir nagar, Parijat nagar, Nashik, Maharashtra 422005",
    		"Mahatama nagar road, St Kabir nagar, Parijat nagar, Nashik, Maharashtra 422005",
    		"35, Krishi nagar, college road, Krishi nagar, Nashik, Maharashtra 422005",
    		"35, Krishi nagar, college road, Krishi nagar, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"Patil Lane no 1, Patil colony, College road, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
    		"35, Krishi nagar, college road, Krishi nagar, Nashik, Maharashtra 422005",
    		"Mahatma nagar road, Samrtha nagar, Parijat nagar, Nashik, Maharashtra 422005",
    		"35, Krishi nagar, college road, Krishi nagar, Nashik, Maharashtra 422005",
    		//Nashik road
    		"19, Ashoka marg, Kalpataru nagar, nashik, maharashtar 422011",
    		"19, Ashoka marg, Kalpataru nagar, nashik, maharashtar 422011",
    		"Nashik-shirdi, Samta nagar, nashik, maharashtra 422214",
    		"nashik-pune RD, samta nagar, nashik, maharashtra 422214",
    		"Canal RD, neharu nagar, nashik, maharashtra 422214",
    		"Canal RD, neharu nagar, nashik, maharashtra 422214",
    		"Sanjay gandhi nagar, Matoshree nagar, upnagar,nashik, maharashtra",
    		"Akshay lakshami, shikhre wadi, nashik RD, Nashik pune RD, Prakash nagar, nashik RD, Nshik, Maharashtra 422214",
    		"5, Nashik-pune RD, Gayakhe colony, Deolali gaon, nashik, maharashtra 422214",
    		"5, Nashik-pune RD, Gayakhe colony, Deolali gaon, nashik, maharashtra 422214",
    		"Zaveri colony RD, Rosa colony, SAne guruji nagar, nashik, maharashtra 422214",
    		"Zaveri colony RD, Rosa colony, SAne guruji nagar, nashik, maharashtra 422214",
    		"Nahsik-pune RD, Rajwada nagar, Deolali gaon, nashik, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
    		"nashik-pune RD, rajwada nagar, deolali gaon, nashik, maharashtra 422214",
    		"nashik-pune RD, rajwada nagar, deolali gaon, nashik, maharashtra 422214",
    		"nashik-pune RD, rajwada nagar, deolali gaon, nashik, maharashtra 422214",
    		"nashik-pune RD, rajwada nagar, deolali gaon, nashik, maharashtra 422214",
    		"nashik-pune RD, Gayakhe colony, deolali gaon, nashik, maharashtra 422214",
    		"nashik-pune RD, Gayakhe colony, deolali gaon, nashik, maharashtra 422214",
    		"Jayabai colony RD, dawkhar wadi, deolali gaon, nashik, maharashtra 422214 ",
    		"Nashik-shirdi, narhar nagar, tagore nagar, nashik maharashtra 422214",
    		"Pujya Ravishankar marg, Kalpatru nagar, nashik, maharashtra 422214",
    		"Pujya Ravishankar marg, Kalpatru nagar, nashik, maharashtra 422214",
    		"Pujya Ravishankar marg, Kalpatru nagar, nashik, maharashtra 422214",
    		"35, Ashoka marg, Jaydip nagar, Kalpataru nagar, nashik maharashtra 422214",
    		"35, Ashoka marg, Jaydip nagar, Kalpataru nagar, nashik maharashtra 422214",
    		"35, Ashoka marg, Jaydip nagar, Kalpataru nagar, nashik maharashtra 422214",
    		"35, Ashoka marg, Jaydip nagar, Kalpataru nagar, nashik maharashtra 422214",
    		"canal RD, neharu nagar, nashik, maharashtra 422214",
    		"19,Ashoka Marg,Kalptaru nagar,nasik,maharashtra 422214",
    		"19,Ashoka Marg,Kalptaru nagar,nasik,maharashtra 422214",
    		//mhasrul
    		
    		"sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
    		"vaiduwadi,mhasrul gaon nasik",
    		"vaiduwadi,mhasrul gaon nasik",
    		"vaiduwadi nasik",
    		"loksahakar nagar,nasik",
    	"	loksahakar nagar,nasik",
    		"abhang nagar,shree dwaraka nagari nasik 422003",
    		"vaiduwadi,mhasrul gaon nasik",
    		"vaiduwadi,mhasrul gaon nasik",
    		"sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
    		"sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
    		"loksahakar nagar,nasik",
    		"kalachowki nasik",
    		 "kalachowki nasik 422003",
    		"kalachowki nasik 422003",
    		"loksahakar nagar,nasik",
    		"vaiduwadi nasik",
    		"sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
    		"loksahakar nagar,nasik",
    		"sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
    		"meri-rasbihari link road,pokar colony,vaiduwadi nasik 422004",
    		"meri-rasbihari link road,pokar colony,vaiduwadi nasik 422004",
    		"sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
    		"sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
    		"loksahakar nagar,nasik",
    		"loksahakar nagar,nasik",
    		"loksahakar nagar,nasik",
    		"vaiduwadi,mhasrul gaon nasik",
    		"meri-rasbihari link road,pokar colony,vaiduwadi nasik 422004",
    		//cidco
    		"42, untwadi road, tidke nagar, nashik, maharashtra 422008",
    		"42, untwadi road, tidke nagar, nashik, maharashtra 422008",
    		"42, untwadi road, tidke nagar, nashik, maharashtra 422008",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
    		"pelicon park road, morwadi, nashik, maharashtra 422010",
    		"Vijay nagar,Nasik,Maharashtra 422010",
    		"Sambhaji stadium Road,shri ram colony,Nasik, Maharashtra 422010",
    		"veer sawarkar marg,Shir Ram colony, nasiik, maharashtra 422010",
    		"pelican park road,morvadi,nashik 422010",
    		"vijaynagar nashik 422010",
    		"N-10 /m 1 lekha nagar nashik maharashtra 422010",
    		"N-10 /m 1 lekha nagar nashik maharashtra 422010",
    		"N-10 /m 1 lekha nagar nashik maharashtra 422010",
    		"shivaji chawk,prabhat colony, nasik 422009",
    		"shivaji chawk,prabhat colony, nasik 422009",
    		"lekhanagar bypas road ,lekha nagar nashik,maharashta 422010",
    		"lekhanagar bypas road ,lekha nagar nashik,maharashta 422010",
    		"chetna nagar nh-3 ,rane nagar nashik 422009",
    		"chetna nagar nh-3 ,rane nagar nashik 422009",
    		"chetna nagar nh-3 ,rane nagar nashik 422009",
    		"N-3/m/43 oldcidco shanti nagar lekha nagar ,nashik 422009",
    		"N-6/k-6 old cidco ,shanti nagar ,lekha nagar nashik 422009",
    		"lekha nagar bypass road,nashik 422009",
    		"lekhanagar bypas road ,lekha nagar nashik,maharashta 422010",
    		"chetna nagar nh-3 ,rane nagar nashik 422009",
    		"chetna nagar nh-3 ,rane nagar nashik 422009",
    		"chetna nagar nh-3 ,rane nagar nashik 422009",
    		"chetna nagar nh-3 ,rane nagar nashik 422009",
    		"sambhaji stadium road ,sriram colony nashik 422010",
    		"sambhaji stadium road ,sriram colony nashik 422010",
    		"sambhaji stadium road ,sriram colony nashik 422010",
    		"sambhaji stadium road ,sriram colony nashik 422010",
    		"sambhaji stadium road ,sriram colony nashik 422010",
    		"sambhaji stadium road ,sriram colony nashik 422010",
    		"vijaynagar ,nashik 422010",
    		"vijaynagar ,nashik 422010",
    		
    		//trimbak
    		"trimbak maharashtra 422212",
    		"trimbak maharashtra 422212",
    		"trimbak maharashtra 422212",
    		"trimbak maharashtra 422212",
    		"teli galli, trimbak maharashtra 422212",
    		"telli galli , trimbak maharashtra 422212",
    		"telli galli , trimbak maharashtra 422212",
    		"telli galli , trimbak maharashtra 422212",
    		"telli galli, trimbak maharashtra 422212",
    		"trimbak maharashtra 422212",
    		"trimbak maharashtra 422212",
    		"trimbak maharashtra 422212",
    		"shivrutti nasth road ,vaidhya vada,trimbak 422212",
    		"gaidhane lane ,trimbak",
    		"telli galli, trimbak maharashtra 422212",
    		"telli galli, trimbak maharashtra 422212",
    		"telli galli, trimbak maharashtra 422212",
    		"telli galli, trimbak maharashtra 422212",
    		"Gharpure ghat road,Ashok stambh, Rawivar karanja, shivaji nagar, nashik, maharashtra 422002",
    		"Teli galli, Raviwar path, raviwar karanja, panchavati, nashk, maharashtra 422001",
    		"A17B, Gyanupaga Ln., raviwar karanja, panchavati, nashk, maharashtra 422001",
    		"A17B, Gyanupaga Ln., raviwar karanja, panchavati, nashk, maharashtra 422001",
    		"A17B, Gyanupaga Ln., raviwar karanja, panchavati, nashk, maharashtra 422001",
    		"Panchavati, Nashik, Maharashtra",
    		"Panchavati, Nashik, Maharashtra",
    		"Panchavati, Nashik, Maharashtra",
    		"Panchavati, Nashik, Maharashtra",
    		"Panchavati, Nashik, Maharashtra",
    		"Panchavati, Nashik, Maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"Loksahakar nagar, nashik, maharashtra",
    		"68, Hirawadi road, mahalakshmi nagar, nshik, maharashtra 422003",
    		"480,old agra road, shalimar, nashik, maharashtra 422001",
    		"Trimbak road, police staff colony, nashik, maharashtra 422002",
    		"Trimbak road, police staff colony, nashik, maharashtra 422002",
    		"Trimbak road, police staff colony, nashik, maharashtra 422002",
    		"Trimbak road, police staff colony, nashik, maharashtra 422002",
    		"Trimbak road, police staff colony, nashik, maharashtra 422002",
    	"	Trimbak road, police staff colony, nashik, maharashtra 422002",
    		};
    public static String contact[] = {
    		

		"8380011286",
		"02532342908",
		"108",
		"09423970136",
		"18002334475",
		"9823088159",
		"9890458859",
		"8087500768",
		"02532311064",
		"02532572371",
		"108"	,
		"108",

		"9422732654",
		"9970290452 ",
		"9922348283",
		"9272738394",
		"108",
		"108",
		"9822123972",
		"9021421244 ",
		"9290536812",
		"9860030140",
		"9422265123",
		"108",
		"9921587959", 
		"108",
		"9822013460",
		"9850078311 ",
		"8308809647", 
		"108",
		"9404756208 ",
		"9405370482",
		"8698920114",
		"9370018944",
		"9823106595",
		"9765944821",
		"108	",
		"108",
		"9923203024",
		"7745023183",
		"9403595934 ",
		"9890222757",
		"108",
		"108",
		"9403450179",
		"9890395585 ",
		"9225139507 ",
		"9922420259",
		"9422750424",
		"8806603394",
		"108",
		"9730205515 ",
		"8446999913 ",
		"9422255126",
		"9923077699",
		"9823526476",
		"9423131941",
		"8796965822",
		"02532399494",
		"02532375008",
		"02536646444",
		"02536060006",
		"02532471245",
		"02532471200",
		"02532501888",
		"02536624444",
		"02532517128",
		"9326190061",
		"9890664496",
		"9226769151",
		"02532513407",
		"108",
		"108",
		"8149772696",
		"9225324888",
		"108",
		"9226892989",
		"7875002401",
		"9420480004",
		"9823088159",
		"9890054405",
		"9881257005",
		"8600011821",
		"9422752654",
		"8888832211",
		"9822056878",
		"108",
		"9767207475",
		"9326808994",
		"108",
		"982299619",
		"9890458859",











};
    
   
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);  												//
      
		try 
		{
			
            // Loading map
			
            initilizeMap();
            
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
       LatLng latLng = new LatLng(19.998176, 73.772719);      

            // Show the current location in Google Map        
           googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(17));
            
            googleMap.setMyLocationEnabled(true);
           
            LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
            Criteria criteria = new Criteria();

            Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));
            if (location != null)
            {
            	 googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(location.getLatitude(), location.getLongitude()), 10));

                CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(location.getLatitude(), location.getLongitude()))      // Sets the center of the map to location user
                .zoom(17)                   // Sets the zoom
         //  .bearing(30)                // Sets the orientation of the camera to east
                .tilt(70)                   // Sets the tilt of the camera to 30 degrees
                .build();                   // Creates a CameraPosition from the builder
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

            }   
            
            
         // Setting a custom info window adapter for the google map
            setMarkers();
            
        }
		catch (Exception e)
		{
            e.printStackTrace();
        }
		
    }

    
    private void setMarkers()
    {
    	Datab db =new Datab(this);
    	double[] lat=db.getHospitalNames();
    	double[] longi=db.getlongi();
    	String[] name=db.getH_name();
    	for (int i=0; i <= longi.length; i++)
    	{
    	 // create marker
    		
    	MarkerOptions marker = new MarkerOptions().position(new LatLng(lat[i], longi[i])).title(""+name[i]);
    		marker.icon(BitmapDescriptorFactory.fromResource(R.mipmap.h));
        // adding marker
    		googleMap.addMarker(marker);
    	}
    	/*for (double d : lat) {
    		String string=Double.toString(d);
    		Log.d("lat", string);
		}*/
    	
    }
    
    
    
    /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initilizeMap()
    {
        if (googleMap == null)
        	//requestWindowFeature(Window.FEATURE_NO_TITLE);
            //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
              // WindowManager.LayoutParams.FLAG_FULLSCREEN);
      		//setContentView(R.layout.map_activity);	
      		
        {
        	SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map); 
        			    		
        			    		
        			    		// Getting reference to the Google Map
        			    		googleMap = mapFragment.getMap();          // check if map is created successfully or not
        			            if (googleMap == null) {
        			               Toast.makeText(getApplicationContext(),
        			                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
        			                        .show();
            }
            
        }
    }
 
    @Override
    protected void onResume() {
        super.onResume();
        initilizeMap();
    }
 
    
}
