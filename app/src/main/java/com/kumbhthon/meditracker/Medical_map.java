package com.kumbhthon.meditracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.Utils.Constants;


public class Medical_map extends FragmentActivity {
    // Google Map
    private GoogleMap googleMap;
    private WebView programWebView;


    //Medical Arrays
    private double latt2[] = {19.9652014,
            19.9647655,
            19.9641022,
            19.9637658,
            19.9665636,
            19.9674731,
            19.9681954,
            19.9695611,
            19.970051,
            19.9735748,
            19.9735685,
            19.976505,
            19.9830052,
            19.9835986,
            19.9835734,
            19.9843266,
            19.9847823,
            19.9869052,
            19.9828014,
            19.9815567,
            19.981915,
            19.9758505,
            19.9741526,
            19.9731922,
            19.9730521,
            19.9705322,
            19.9705403,
            19.9733131,
            19.9728503,
            19.9725727,
            19.9748861,
            19.9748861,
            19.9765346,
            19.9777581,
            19.9785445,
            19.9791435,
            19.9825421,
            19.9829962,
            19.9848799,
            19.9855712,
            19.9891663,
            19.9558913,
            19.9569715,
            19.9652292,
            19.9693319,
            19.9695001,
            19.9695001,
            19.9721526,
            19.9726955,
            19.9754385,
            19.9825453,
            19.9824822,
            19.9879938,
            20.0091292,
            20.0109965,
            20.0122621,
            20.0120488,
            20.0133538,
            20.0138407,
            20.0152256,
            20.0151937,
            20.0125745,
            20.0102117,
            20.0099048,
            20.0064614,
            20.0061712,
            20.0042985,
            20.0027901,
            20.002793,
            20.0027858,
            20.0028773,
            20.0028863,
            20.0079765,
            20.007514,
            20.0057544,
            20.0052909,
            20.0046961,
            20.0049221,
            20.005292,
            20.0057035,
            20.0028149,
            //nsk road
            19.9799633,
            19.969595,
            19.969595,
            19.9701833,
            19.9596116,
            19.9572432,
            19.9583583,
            19.9545333,
            19.957745,
            19.957745,
            19.9585833,
            19.9616016,
            19.9533816,
            19.9522333,
            19.9540583,
            19.9643183,
            19.976765,
            19.976765,
            19.977465,
            19.9724499,
            19.9809616,
            19.980725,
            19.9805533,
            19.9805083,
            19.9804833,
            //masrul
            20.0472531,
            20.0112415,
            20.0112415,
            20.0472531,
            20.0472531,
            20.0347544,
            20.0351655,
            20.0145975,
            20.0354432,
            20.0354432,
            20.0327371,
            20.0327371,
            20.0354432,
            20.0354432,
            20.0472531,
            //cidco
            19.9918978,
            19.9695598,
            19.9694764,
            19.969403,
            19.96927,
            19.9691304,
            19.9689799,
            19.9682489,
            19.9682489,
            19.9684316,
            19.9694311,
            19.9695044,
            19.9695991,
            19.9738338,
            19.9742205,
            19.9758396,
            19.9763882,
            19.9703496,
            19.9693843,
            19.9698597,
            19.9701878,
            19.9757194,
            19.9703496,
            19.9693273,
            19.9693423,
            19.9694311,
            19.9695044,
            19.9686708,
            19.9686708,

            //panchavati
            20.0100288,
            20.0100332,
            20.0110976,
            20.0114041,
            20.0093804,
            20.0088228,
            19.9970723,
            19.996782,


    };
    private double lon2[] = {73.7533984,
            73.7536474,
            73.7537057,
            73.7536557,
            73.7533561,
            73.7533667,
            73.7533198,
            73.7535696,
            73.7532252,
            73.7545119,
            73.7545215,
            73.7548413,
            73.7559096,
            73.7563234,
            73.7564116,
            73.7566618,
            73.7568674,
            73.7578738,
            73.7561563,
            73.7555746,
            73.754039,
            73.7549036,
            73.7547115,
            73.7546541,
            73.7546191,
            73.752435,
            73.7521763,
            73.7498064,
            73.7479067,
            73.7469989,
            73.7466241,
            73.7466241,
            73.7469327,
            73.7468686,
            73.7469815,
            73.7471003,
            73.74829191,
            73.7483919,
            73.7488064,
            73.748925,
            73.7497934,
            73.7725974,
            73.7732283,
            73.775844,
            73.7816096,
            73.7817021,
            73.7838043,
            73.791348,
            73.7908513,
            73.790234,
            73.7900776,
            73.7882459,
            73.7882599,
            73.7877609,
            73.7877703,
            73.7925588,
            73.7952487,
            73.795045,
            73.7889361,
            73.7886714,
            73.7870693,
            73.7872798,
            73.7872258,
            73.7872319,
            73.78722595,
            73.7542677,
            73.7570429,
            73.7582651,
            73.7645562,
            73.7676152,
            73.7685702,
            73.7678864,
            73.7667149,
            73.7648661,
            73.7545825,
            //nsk rd

            73.8047966,
            73.8198716,
            73.8198716,
            73.8214816,
            73.830465,
            73.833483,
            73.8349233,
            73.837875,
            73.83838,
            73.83838,
            73.8385566,
            73.8391766,
            73.8387133,
            73.8397733,
            73.83727,
            73.8241166,
            73.810025,
            73.810025,
            73.8047633,
            73.8022699,
            73.7965866,
            73.7980582,
            73.8002483,
            73.8002483,
            73.8010316,
            //masrul
            73.8059981,
            73.7968189,
            73.7968189,
            73.8059981,
            73.8059981,
            73.8037669,
            73.8034197,
            73.7964643,
            73.8033556,
            73.8033556,
            73.8032887,
            73.8032887,
            73.8033556,
            73.8033556,
            73.8059981,
            //cidco
            73.7658069,
            73.7543668,
            73.7544453,
            73.7544453,
            73.7554035,
            73.7561698,
            73.7569868,
            73.7593403,
            73.7593403,
            73.7605199,
            73.7671261,
            73.7665994,
            73.7662174,
            73.7660208,
            73.7663916,
            73.7680308,
            73.7698184,
            73.7703375,
            73.7614948,
            73.7619416,
            73.7623571,
            73.7705815,
            73.7703375,
            73.7695095,
            73.7677822,
            73.7671261,
            73.7665994,
            73.7607687,
            73.7607687,

            //panchavati
            73.7942431,
            73.7948537,
            73.7953153,
            73.7962562,
            73.7995751,
            73.801986,
            73.7804837,
            73.7797618,

    };


    private String nameMed[] = {"Atharva Medical",
            "Nilesh Medical",
            "Swapnil Medical",
            "Anush Medical",
            "Vishal Medical",
            "Sarvesh Medical",
            "Kalpataru Medical",
            "Vaibhav Medical",
            "New Renuka Medical",
            "Sawali medical",
            "Shree Ram Medical",
            "Anmol Medical",
            "Om Sai Medical",
            "Bhagirathi Medical",
            "Trimurti Medical",
            "Matoshree Medical",
            "Samarth Medical",
            "Balaji Medical",
            "Shree Medical",
            "Yash Medical",
            "Ganesh Medical",
            "Karneshan Medical",
            "Ekvira Medical",
            "Samarth Medical",
            "Asmita Medical",
            "Anjali Medical",
            "Sitgotai Medical",
            "Sanjivanee Medical",
            "Ekvira Medical",
            "Sai Medical",
            "Indrayani Medical",
            "Atharva Medical",
            "Samarth Medical",
            "Subhash Medical",
            "Sachin Medical",
            "Ganesh Medical",
            "Krushna Medical",
            "Gajanan Medical",
            "Sukhakarta Medical",
            "Om Medical",
            "Mahavir Medical",
            "Shreeram aushadhalaya ",
            "Krishna medical ",
            "Ashapuri medical ",
            "Mahesh Medical",
            "Om Medical ",
            "Chetan Medical ",
            "Pratham Medical",
            "Life care Medical ",
            "Mutha Medical ",
            "Shreeniwas Medical",
            "Annapurna Medical",
            "Jeevak Medical",
            "Godawari Medical ",
            "Jay Medical",
            "Gaikwad Medical",
            "Lakshmi Medical",
            "Ravikiran Medical",
            "Daulat Medical",
            "Matoshri Medical",
            "Yashashri Medical",
            "Sanap Medical",
            "Prakash Medical",
            "Siddhi Medical",
            "Swagat Medical",
            "RK Medical",
            "Raaj Medical",
            "Swagat Medical",
            "Suraj Medical",
            "Prince Medical",
            "Rajebahaddar Medical",
            "Om Medical",
            "Prafulla Medical",
            "New Yashodha Medical",
            "Shree balanad Medical",
            "Apollo Medical",
            "Yash Medical",
            "Apollo Medical",
            "Vijan Medical",
            "Jivandeep Medical",
            "Anand Medical",
            //nsk rd
            "Trisha Meidcal",
            "Pooja medical",
            "Dutta medical",
            "Bhakti medical",
            "Vedant medical",
            "Sun farmacy",
            "Shree medical",
            "Datta medical",
            "Chandan medical",
            "Archanam medical",
            "Jayganesh medical",
            "Prathamesh medical",
            "Archana medical",
            "Shaha medical",
            "Shahyadri medical",
            "Vinayak medical",
            "Swami samrth medical",
            "New Ashapuri medical",
            "Sanjivanee medical",
            "Tushar medical",
            "Chaitanya medical",
            "Shantanu medical",
            "Niramay medical",
            "SAmarth medical",
            "Shree Sai medical",

            //masrul
            "jagdamb medical",
            "sai care medical",
            "varad medical",
            "shree seami samarth medical",
            "Ashapuri medical",
            "prashant medical",
            "prashant medical",
            "pritish medical ",
            "kalika mdical ",
            "yogiraj medical ",
            "rajendra medical",
            "pavitra medical ",
            "rajyog medical",
            "shreepad medical",
            "prerna medical",

            //cidco
            "Bhagwati medical",
            "Sewa medical",
            "Tirupati medical",
            "Dinesh medical",
            "Gargi medical",
            "Sanjivani medical",
            "gaurav medical",
            "Dipak Medical",
            "Swami medical",
            "Manudevi Medical",
            "Om medical",
            "chetan medical",
            "Amrutprabha Medical",
            "Pragati Medical",
            "Mhesh Medical",
            "Varad Medical",
            "sai Medical",
            "Jivan medical",
            "manoj medical",
            "swami samartha medical",
            "maharashtra medical",
            "pragzi medical ",
            "tulza medical",
            "yuvati medical",
            "mahaesh medical ",
            "Om medical",
            "chetan medical",
            "jai medical",
            "new mahavir medical",


            //panchavati
            "New jayvanti medical",
            "Prakash medical",
            "Satyam medical",
            "varad medical",
            "om medical",
            "Sarswati medical",
            "Prabhuram medical",
            "Rajdut medical",

    };
    private String add[] = {"Ambad-Trimurti chowk link road, Indraprastha colony, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Indraprastha colony, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Indraprastha colony, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Upendra nagar colony, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Jai Hind colony, Mahajan nagar, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Jai Hind colony, Mahajan nagar, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Jai Hind colony, Mahajan nagar, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Mahajan nagar, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Mahajan nagar, Nashik, Maharashtra 422010",
            "Ambad-Trimurti chowk link road, Mhasoba nagar, Ambika nagar, Nashik, Maharashtra 422007",
            "Ambad-Trimurti chowk link road, Mhasoba nagar, Ambika nagar, Nashik, Maharashtra 422007",
            "Ambad-Trimurti chowk link road, Abhiyanta nagar, Nashik, Maharashtra 422007",
            "Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
            "Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
            "Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
            "Shivshakti nagar, Nashik, Maharashtra",
            "Shivshakti nagar, Nashik, Maharashtra",
            "42, Untawadi road, Tidke nagar, Nashik, Maharashtra 422008",
            "Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422008",
            "Ambad-Trimurti chowk link road, Savata nagar, Nashik, Maharashtra 422007",
            "Trimurti to Kamatwade road, Durga nagar, Nashik, Maharashtra 422007",
            "	Ambad-Trimurti chowk link road, Pawan nagar, Nashik, Maharashtra 422007",
            "	Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
            "		Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
            "Ambad-Trimurti chowk link road, Mhasoba nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
            "Rugved society, Gajanan nagar, Mahajan nagar, Nashik, Maharashtra",
            "Rugved society, Gajanan nagar, Mahajan nagar, Nashik, Maharashtra",
            "Modakeshwar nagar road, SAptashrungi nagar, Modakeshwar nagar, Nashik, Maharashtra 422007",
            "Saptshrungi Niwas road, SAptshrungi nagar, Kamatwade Gaon, Nashik, Maharashtra 422010",
            "Saptshrungi Niwas road, SAptshrungi nagar, Kamatwade Gaon, Nashik, Maharashtra 422010",
            "IIt Ambad road, Siddhatek nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Siddhatek nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Siddhatek nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Kartikey nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Kartikey nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Kartikey nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Kartikey nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Kartikey nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Kartikey nagar, Nashik, Maharashtra 422007",
            "IIt Ambad road, Kartikey nagar, Khutawad nagar,  Nashik, Maharashtra 422007",
            "IIt Ambad road, MIDC, Satpur, Nashik, Maharashtra 422007",
            "patherdi phata , pathardi road prashant nagar patharadi phata nashik 422010",
            "Pathardi to ambad road, MIDC ambad , Nashik 422010",
            "Chetna nagar national highway 3 , chetna nagar , rane nagar , Nashik 422009",
            "Veer savarkar marg shreeram colony, Nashik 422010",
            "Sambhaji stadium road , shreeram colony Nashik 422010",
            "Sambhaji stadium road , shreeram colony Nashik 422010",
            "Lekha nagar by pass road , Lekha colony , Nashik 422010",
            "Lekha nagar by pass road , Lekha colony , Nashik 422010",
            "Shanti Nagar, Lekha nagar Nashik 422009",
            "Govinda nagar nashik ",
            "Govinda nagar nashik ",
            "Old agra road , renuka nagar Nashik 422002",
            "Ahilya Holkar Bridge, Saraf bajar panchavati Nashik 422001",
            "Panchavati Nashik 422003",
            "Makhamalabaad naka Hirawadi Nashik 422003",
            "Makhamalabaad naka Hirawadi Nashik 422003",
            "37, Makhamalabaad road , datta nagar , navanath nagar Nashik 422003",
            "37, Makhamalabaad road , datta nagar , navanath nagar Nashik 422003",
            "37, Makhamalabaad road , Ganesh Nagar, Hirawadi Nashik 422003",
            "37, Makhamalabaad road , Ganesh Nagar Hirawadi Nashik 422004",
            "9, Pethroad , Raajpal colony, Panchavati Nashik 422003",
            "Panchavati Nashik 422003",
            "Panchavati Nashik 422003",
            "Tilak road, Ravivar karanja nashik 422002 ",
            "Tilak road, Ravivar karanja nashik 422002 ",
            "Mahatma Gandhi road, Ravivar karanja, Shalimar Nashik 422001",
            "Wawre lane, Shalimaar Nashik 422001",
            "Wawre lane, Shalimaar Nashik 422001",
            "Wawre lane, Shalimaar Nashik 422001",
            "Wawre lane, Shalimaar Nashik 422001",
            "Mahatama nagar road, St Kabir nagar, Parijat nagar, Nashik, Maharashtra 422005",
            " Mahatama nagar road, St Kabir nagar, Parijat nagar, Nashik, Maharashtra 422005",
            " Mahatama nagar road, St Kabir nagar, Parijat nagar, Nashik, Maharashtra 422005",
            " 1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
            " 1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
            " 1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
            " 1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
            " 1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
            " 1/3, college road, Patil colony, Canda corner, Nashik, Maharashtra 422005",
            " Mahatma nagar road, Samrtha nagar, Parijat nagar, Nashik, Maharashtra 422005",
            //nsk rd

            "19,Ashoka Marg,Kalptaru nagar,nasik,maharashtra 422011",
            "canal RD, neharu nagar, nashik, maharashtra 422214",
            "canal RD, neharu nagar, nashik, maharashtra 422214",
            "canal RD, neharu nagar, nashik, maharashtra 422214",
            "Akshay lakshami, shikhre wadi, nashik RD, Nashik pune RD, Prakash nagar, nashik RD, Nshik, Maharashtra 422214",
            "5, Nashik-pune RD, gaykhe colony, Deolali gaon, nashik maharashtra 422214",
            "Zaveri colony RD, Rosa colony, SAne guruji nagar, nashik, maharashtra 422214",
            "17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
            "17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
            "17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
            "17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
            "17, Sawami bunglow, kala nagar jail RD kala nagar, maharashtra 422214",
            "nashik-pune RD, rajwada nagar, Deolali gaon, nashik maharashtra 422214",
            "nashik-pune RD, rajwada nagar, Deolali gaon, nashik maharashtra 422214",
            "nashik-pune RD, rajwada nagar, Deolali gaon, nashik maharashtra 422214",
            "nashik-pune RD, Jetvan nagar, deolali gaon, nashik maharashtra 422214",
            "Nashik-shirdi, narhar nagar, tagore nagar, nashik maharashtra 422214    ",
            "Nashik-shirdi, narhar nagar, tagore nagar, nashik maharashtra 422214   ",
            "Pujya Ravishankar marg, Kalpatru nagar, nashik, maharashtra 422214",
            "Pujya Ravishankar marg, Kalpatru nagar, nashik, maharashtra 422214",
            "35, Ashoka marg, Jaydip nagar, Kalpataru nagar, nashik maharashtra 422214",
            "35, Ashoka marg, Jaydip nagar, Kalpataru nagar, nashik maharashtra 422214",
            "31, Ashoka marg, Happy home colony, gulshan colony, nashik maharashtra 422006",
            "19, Ashoka marg, kalpataru nagar, nashik maharashtra 422011",
            "19, Ashoka marg, kalpataru nagar, nashik maharashtra 422011",

            //marsul

            "vaiduwadi,mhasrul gaon nasik",
            "loksahakar nagar,nasik",
            "loksahakar nagar,nasik",
            "vaiduwadi,mhasrul gaon nasik",
            "vaiduwadi,mhasrul gaon nasik",
            "sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
            "sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
            "loksahakar nagar,nasik",
            "sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
            "sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
            "meri-rasbihari link road,pokar colony,vaiduwadi nasik 422004",
            "meri-rasbihari link road,pokar colony,vaiduwadi nasik 422004",
            "sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
            "sn 233/D,maharahtra state highway 17,kalananagar,nasik 422004",
            "vaiduwadi,mhasrul gaon nasik",
            //cidco
            "42, untwadi road, tidke nagar, nashik, maharashtra 422008",
            "pelicon park road, uttam nagar, nashik, maharashtra 422010",
            "pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
            "pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
            "pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
            "pelicon park road, uttam nagar, nashik, maharashtra 422010 ",
            "pelicon park road, uttam nagar, nashik, maharashtra 422010",
            "pelicon park road, morwadi, nashik, maharashtra 422010",
            "pelicon park road, morwadi, nashik, maharashtra 422010",
            "pelicon park road, Shir ram colony, nashik, maharashtra 422010",
            "Sambhaji stadium Road,shri ram colony,Nasik, Maharashtra 422010",
            "Sambhaji stadium Road,shri ram colony,Nasik, Maharashtra 422010",
            "Sambhaji stadium Road,shri ram colony,Nasik, Maharashtra 422010",
            "N-10/M-1/24/3,lekha nagar,nasik,maharasthra 422010",
            "N-10/M-1/24/3,lekha nagar,nasik,maharasthra 422010",
            "shivaji chawk,prabhat colony,nasik,maharashtra 422009",
            "N-3/M/43,old cidco,shanti nagar,lekha nagar,nasik,maharashtra 422009",
            "Chetana nagar,national highway 3,chetana nagar,rane nagar,Nasik,maharashtra 422009",
            "Chetana nagar,national highway 3,chetana nagar,rane nagar,Nasik,maharashtra 422009",
            "Chetana nagar,national highway 3,chetana nagar,rane nagar,Nasik,maharashtra 422009",
            "Chetana nagar,national highway 3,chetana nagar,rane nagar,Nasik,maharashtra 422009",
            "N-6/k-6 old cidco shanti nagar,lekhanagar ,nashik maharashtra 422009",
            "chetana nagar,national highway 3,rane nagar,nashik,maharashtra 422009",
            "chetana nagar,national highway 3,rane nagar,nashik,maharashtra 422009",
            "sambhaji studio road shriram ,colony,nashik 422010",
            "sambhaji studio road shriram ,colony,nashik 422010",
            "sambhaji studio road shriram ,colony,nashik 422010",
            "vijay nagar nashik 422010",
            "vijay nagar nashik 422010",
            "trimbak maharashtra 422212",
            "teli galli, trimbak maharashtra 422212",
            "teli galli, trimbak maharashtra 422212",
            "teli galli, trimbak maharashtra 422212",
            "trimbak maharashtra 422212",
            "gaidhani lane ,vaidhya vadi,trimbak",
            "gaidhani lane ,vaidhya vadi,trimbak",
            "gaidhani lane ,vaidhya vadi,trimbak",
            "teli galli, trimbak maharashtra 422212",
            "teli galli, trimbak maharashtra 422212",
            "teli galli, trimbak maharashtra 422212",
            //panchavati
            "Panchvati, Nashik, maharashtra",
            "Panchavati, Nashik, Maharashtra",
            "Panchavati, Nashik, Maharashtra",
            "Loksahakar nagar, nashik, maharashtra",
            "wadar wali, nashik, maharashtra 422003",
            "68, Hirawadi road, mahalakshmi nagar, nshik, maharashtra 422003",
            "Trimbak road, police staff colony, nashik, maharashtra 422002",
            "Trimbak road, matoshree nagar, nashik, maharashtra 422002",
    };
   /* private String cont[] ={" 0253 - 2510002",
            "0253 - 2532310",
    		"0253 - 2319091, 2598503",
    		"0253 - 2393915",
    		"0253 - 2507250",
    		"9226144619",
    		"0253 - 2581754",
    		"9822401029",
    		"0253 - 2310047, 2310047",
    		"0253 - 2350834",
    		"0253 - 2517733",
    		"0253 - 4916872",
    		"0253 - 2576051",
    		"0253 - 2502218",
    		"0253 - 2570081",
    		"0253 - 2357658",
    		"0253 - 2591357",
    		"0253 - 2354836",
    		"0253 - 2563854",
    		"0253 - 2576481",
    		"0253 - 2569873",
    		"0253 - 2560580",
    		"0253 - 2591156",
    		"0253 - 2313058",
    		"0253 - 2516335",
    		"0253 - 2310004",
    		"0253 - 2561455",
    		"0253 - 2560752",
    		"0253 - 2542007",
    		"0253 - 2596717",
    		"0253 - 2240382",
    		"0253 - 2576942",
    		 "0253 - 2257888",
    		"0253 - 2315480, 2315580",
    		"(253)-2313075",
    		"9822425591",
    		"0253-2491687",
    		"(253)-2357658",
    		"(253)-2501316",
    		"(253)-2581156",
    		"(253)-2520082",
    		"(253)-2391863",
    		"(253)-2492057",
    		"(253)-2508692",
    		"9422769475",
    		"(253)-2318069",
    		"(253)-2312052",
    		"(253)-2506848","7845619712","9547816479"
};*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
            sendLocatorAction("Medical Store");
        try {

            // Loading map

            initilizeMap();


            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            LatLng latLng = new LatLng(19.998176, 73.772719);

            // Show the current location in Google Map
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(17));
            googleMap.setMyLocationEnabled(true);
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            Criteria criteria = new Criteria();

            Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));

            if (location != null) {
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(location.getLatitude(), location.getLongitude()), 10));

                CameraPosition cameraPosition = new CameraPosition.Builder()
                        .target(new LatLng(location.getLatitude(), location.
                                getLongitude()))      // Sets the center of the map to location user
                        .zoom(17)                   // Sets the zoom
                        .bearing(1000)                // Sets the orientation of the camera to east
                        .tilt(60)                   // Sets the tilt of the camera to 30 degrees
                        .build();                   // Creates a CameraPosition from the builder
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

            }


            setMarkers2();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void setMarkers2() {

        for (int i = 0; i <= lon2.length; i++) {

            // create marker
            MarkerOptions marker2 = new MarkerOptions().position(new LatLng(latt2[i], lon2[i])).title("" + nameMed[i]);
            //
            marker2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.pill));


            // adding marker
            googleMap.addMarker(marker2);

        }
    }

    public void onMarkerClick(Marker marker) {

        Toast.makeText(this, marker.getTitle(), Toast.LENGTH_LONG).show();
    }

    /**
     * function to load map. If map is not created it will create it for you
     */
    private void initilizeMap() {
        if (googleMap == null)
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        // WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setContentView(R.layout.map_activity);

        {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);


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

    private void sendLocatorAction(String data) {
        SharedPreferences pref = getSharedPreferences(Constants.USER_PREFERENCES, Context.MODE_PRIVATE);
        new ServerLoader(getApplicationContext())
                .addActionDetails(pref.getString(Constants.USER_MOBILE_NUM_1_PREF, null), Constants.TYPE_LOCATOR, data, "n/a");
    }

}
