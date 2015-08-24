package com.kumbhthon.meditracker;

import java.util.ArrayList;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Route_wise_hospital extends FragmentActivity {
    // Google Map
    private GoogleMap googleMap;

    private ArrayList<Hospital> createHospitals() {
        ArrayList<Hospital> hospitals = new ArrayList<Hospital>();
        // dule
        hospitals.add(new Hospital("More Hospital", 19.995405, 73.804535,
                "Takli Road, Dwarka, Nashik, Maharashtra", "dule"));
        hospitals.add(new Hospital("Adgoan college", 20.036775, 73.852902,
                "Hindustan Nagar, Vasantdadanagar, Adgaon", "dule"));
        hospitals.add(new Hospital("apollo hospital", 20.01239, 73.818725,
                "Nashik, Maharashtra 422207", "Dule"));
        // aurangabad
        hospitals.add(new Hospital("Samruhi Clinic", 19.999396, 73.8360949,
                "Wadivarhe,Nandur Village,nashik,Maharastra", "aurangabad"));
        hospitals.add(new Hospital("Mokla Hospital", 19.9996468, 73.8540814,
                "Madsangavi,Nashik,Maharashtra", "aurangabad"));
        hospitals.add(new Hospital("Jairam Hospital", 19.966957, 73.811285,
                "Jairam Hospital,Nashik Road", "aurangabad"));
        // pune
        hospitals.add(new Hospital("Sujata Birlla Hospital", 19.959942,
                73.830678,
                "Opposite Bytco College, Nashik RdNashik, Maharashtra 422214",
                "pune"));
        hospitals
                .add(new Hospital(
                        "Sai Care Hospital",
                        19.9474908,
                        73.830678,
                        "Nashik-Pune Road,New Railway colony,Sanbhaji Nagar,Nashik 422214",
                        "pune"));
        hospitals.add(new Hospital("Suvichar Hospital", 19.982708, 73.802878,
                "Ashoka Marg Ganesh Baba Nagar Nashik, Maharashtra 422006",
                "pune"));
        hospitals
                .add(new Hospital(
                        "Bytco Hospital",
                        19.9498204,
                        73.838693,
                        "Shahu Maharaj Path, Rajwada Nagar,Deolali Gaon,Nashik,Maharashtra 422214",
                        "pune"));
        hospitals.add(new Hospital("Saivitri bai Fule Hospital", 19.9467942,
                73.8444964, "Godarej Wadi,Sanbhaji Nagar,Nashik", "pune"));
        // mumbai
        hospitals
                .add(new Hospital(
                        "Nashik hospital",
                        19.959942,
                        73.78998,
                        "kathe galli-mumbai naka link road ,bhagvat nagar,bhabha nagar,nashik,maharashtra",
                        "mumbai"));
        hospitals.add(new Hospital("Suyash hospital", 19.988974, 73.799646,
                "Suyash Hospital, Mumbai Naka, Nashik", "mumbai"));
        hospitals.add(new Hospital("Shatabdi hospital", 19.987946, 73.783785,
                "Shatabdi Hospital, Mumbai naka, Nashik", "mumbai"));
        hospitals
                .add(new Hospital("Wockhardt hospital", 19.99181, 73.790405,
                        "Wockhardt hospital, Wani House, Mumbai Naka, Nashik",
                        "mumbai"));
        hospitals
                .add(new Hospital(
                        "Bhagvati multispeciality hospital",
                        19.9876285,
                        73.7896211,
                        "kathe galli mumbai naka link road,dr homi bhabha nagar,nashik,maharashtra",
                        "mumbai"));

        // trimbak
        hospitals.add(new Hospital("rajebahdur hospital", 20.001958, 73.787503,
                "Rajebahadur Hospital, Near Nehru Garden, Nashik", "trimbak"));
        hospitals.add(new Hospital("KAKATKAR HOSPITAL", 19.9970288, 73.7737625,
                "HOLARAM COLONY,SHARANPUR,NASHIK,MAHARASHTRA", "trimbak"));
        hospitals.add(new Hospital("soham hospital", 20.000813, 73.776528,
                "Soham Hospital, Sharanpur Road, Nashik", "trimbak"));
        hospitals.add(new Hospital("sai baba heart hospital", 19.999929,
                73.784239,
                "Shree Saibaba Heart Hospital, Near Kalidas, Shalimar, Nashik",
                "trimbak"));
        hospitals.add(new Hospital("six sigma", 20.000224, 73.754675,
                "Six Sigma Hospital, Mahatma Nagar, Nashik", "trimbak"));
        hospitals.add(new Hospital("civil hospital", 19.997051, 73.778186,
                "Nashik Civil hospital, Trimbak road.", "mumbai"));
        hospitals.add(new Hospital("KAKATKAR HOSPITAL", 19.9970288, 73.7737625,
                "HOLARAM COLONY,SHARANPUR,NASHIK,MAHARASHTRA", "trimbak"));
        hospitals.add(new Hospital("Sopan hospital", 19.9911194, 73.7796873,
                "SN KUTHE MARGE,MATOSHREE NAGAR,NASHIK", "trimbak"));
        hospitals.add(new Hospital("chiranjeev hospital", 19.9977831, 78.27187,
                "480,OLD AGRA ROAD,SHALIMAR,NASHIK,MAHARASHTRA", "trimbak"));

        hospitals.add(new Hospital("Tapovan Laxminarayan Mandir", 20.002211,
                73.811004, "Nashik", "temp"));
        hospitals.add(new Hospital("Tapovan Kapila Godavari Sangam", 20.001755,
                73.811904, "Nashik", "temp"));
        hospitals.add(new Hospital("Tapovan Sadhugram 1", 20.007433, 73.814954,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Tapovan Sadhugram 2", 20.001943, 73.81962,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Tapovan Sadhugram 3", 20.001755, 73.811904,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, Yashwant maharaj Patangan",
                20.00709, 73.791868, "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, Ekmukhi datta", 20.007602,
                73.790664, "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, Goyanka dharmashala", 20.008228,
                73.79165, "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, Ahilyadevi Maidan", 20.007324,
                73.79267, "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, Mhasoba Mandir", 20.006443,
                73.792822, "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, NMC Shopping Centre", 20.00486,
                73.792566, "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, Gadge Maharaj Bridge", 20.00407,
                73.793646, "Nashik", "temp"));
        hospitals.add(new Hospital("Ramkund, Shahu Khaire Hotel", 20.00303,
                73.793353, "Nashik", "temp"));
        hospitals.add(new Hospital("Kalaram Mandir", 20.007978, 73.795885,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Bhaktidham Parisar", 20.022755, 73.794276,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Mumbai Naka", 19.988773, 73.782908,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Pimpalgaon Bahula", 19.9802, 73.711104,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Muktidham Parisar", 19.952178, 73.837111,
                "Nashik", "temp"));
        hospitals.add(new Hospital("Nasardi Godavari Sangam Ghat", 19.989729,
                73.823075, "Nashik", "temp"));
        hospitals.add(new Hospital("Kannamwar Bridge Ghat", 20.001511,
                73.805944, "Nashik", "temp"));
        hospitals.add(new Hospital("Nashikroad Railway station", 19.947885,
                73.841492, "Nashik", "temp"));

        // shahi marg

        hospitals.add(new Hospital("Ayurvedic Hospital", 20.0051139, 73.795442,
                "Mumbai Agra Road,VijayNagar Colony,Nasik,Maharashtra 422207",
                "shahi"));
        hospitals.add(new Hospital("Apollo Hospital", 20.0123842, 73.8157093,
                "Mumbai Agra Road,VijayNagar Colony,Nasik,Maharashtra 422207",
                "shahi"));
        hospitals.add(new Hospital("Indira Gandhi Hospial", 20.0091031,
                73.7954027, "Panchavati,Nashik, Maharathtra", "shahi"));
        hospitals.add(new Hospital("saptashrungi Hospital", 20.0059634,
                73.7936558, "Panchvati,Nashik,Maharashtra", "shahi"));
        hospitals.add(new Hospital("Yash Hospital", 20.0096035, 73.8065339,
                "Mumbai Agra Road,Om Nagar,Nasik,Maharashtra 422203", "shahi"));
        return hospitals;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
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

        Location location = locationManager
                .getLastKnownLocation(locationManager.getBestProvider(criteria,
                        false));

        if (location != null) {
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 10));

            CameraPosition cameraPosition = new CameraPosition.Builder()
                    .target(new LatLng(location.getLatitude(), location
                            .getLongitude())) // Sets the center of the map
                            // to location user
                    .zoom(17) // Sets the zoom
                    .bearing(1000) // Sets the orientation of the camera to
                            // east
                    .tilt(60) // Sets the tilt of the camera to 30 degrees
                    .build(); // Creates a CameraPosition from the builder
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        }

        marker();
    }

    private void marker() {
        ArrayList<Hospital> hospitals = createHospitals();
        for (int i = 0; i < hospitals.size(); i++) {
            Hospital hospital = hospitals.get(i);
            // create marker
            MarkerOptions marker = new MarkerOptions()
                    .position(new LatLng(hospital.latitude, hospital.longitude))
                    .title(hospital.name).snippet(hospital.address);

            if (hospital.route.equals("dule")) {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.light_blue));
            } else if (hospital.route.equals("aurangabad")) {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.brown));
            } else if (hospital.route.equals("pune")) {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.mipmap.hosp));
            } else if (hospital.route.equals("mumbai")) {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.pink));

            } else if (hospital.route.equals("trimbak")) {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.green));

            } else if (hospital.route.equals("temp")) {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.mipmap.hosp));
            } else if (hospital.route.equals("shahi")) {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.orange));
            } else {
                marker.icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.light_blue));
            }
            // adding marker
            googleMap.addMarker(marker);
        }
    }

    public void onMarkerClick(Marker marker) {
        Toast.makeText(this, marker.getTitle(), Toast.LENGTH_LONG).show();
    }

    /**
     * function to load map. If map is not created it will create it for you
     */
    private void initilizeMap() {

        if (googleMap == null) {
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        // WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // setContentView(R.layout.map_activity);

            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);

            // Getting reference to the Google Map
            googleMap = mapFragment.getMap(); // check if map is created
            // successfully or not
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
