package com.kumbhthon.meditracker;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.kumbhthon.meditracker.Adapter.DrawerAdapter;
import com.kumbhthon.meditracker.Adapter.RowItem;
import com.kumbhthon.meditracker.Analytics.ServerLoader;
import com.kumbhthon.meditracker.Fragments.About_us;
import com.kumbhthon.meditracker.Fragments.Emeregency_service;
import com.kumbhthon.meditracker.Fragments.Feedback_Fragment;
import com.kumbhthon.meditracker.Fragments.HospitalDirectoryFragment_new;
import com.kumbhthon.meditracker.Fragments.RateUs_Fragment;
import com.kumbhthon.meditracker.Fragments.Settings_Fragment;
import com.kumbhthon.meditracker.Fragments.Share_Fragment;
import com.kumbhthon.meditracker.Fragments.UserGuideFragment;
import com.kumbhthon.meditracker.Utils.Constants;
import com.kumbhthon.meditracker.Utils.LocService;
import com.kumbhthon.meditracker.Utils.PrefManager;

import java.util.ArrayList;
import java.util.List;

public class HomeScreenActivity extends ActionBarActivity {

    String[] menutitles;
    TypedArray menuIcons;

    // nav drawer title
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private List<RowItem> rowItems;
    private DrawerAdapter adapter;

    boolean doubleBackToExitPressedOnce = false;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        mTitle = mDrawerTitle = getTitle();

        menutitles = getResources().getStringArray(R.array.titles);
        menuIcons = getResources().obtainTypedArray(R.array.icons);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        // enabling action bar app icon and behaving it as toggle button

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.ic_drawer, R.string.app_name, R.string.app_name) {
            @SuppressLint("NewApi")

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mTitle);
                // calling onPrepareOptionsMenu() to show action bar icons
                invalidateOptionsMenu();
            }


            @SuppressLint("NewApi")
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle(mDrawerTitle);

                // calling onPrepareOptionsMenu() to hide action bar icons
                invalidateOptionsMenu();
            }


        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerList = (ListView) findViewById(R.id.slider_list);

        rowItems = new ArrayList<>();

        for (int i = 0; i < menutitles.length; i++) {
            RowItem items = new RowItem(menutitles[i], menuIcons.getResourceId(i, -1));
            rowItems.add(items);
        }

        menuIcons.recycle();

        adapter = new DrawerAdapter(getApplicationContext(), rowItems);

        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new SlideitemListener());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        if (savedInstanceState == null) {
            // on first time display view for first nav item
            updateDisplay(0);
        }


        Intent i = new Intent(HomeScreenActivity.this, LocService.class);
        startService(i);

        if (PrefManager.getPrefs(getApplicationContext(), Constants.REGISTER_PENDING_BIT_PREF) || PrefManager.getPrefs(getApplicationContext(), Constants.ACTION_PENDING_BIT_PREF)) {
            ServerLoader serverLoader = new ServerLoader(getApplicationContext());
            serverLoader.sendToServer();
        }
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        mDrawerLayout.openDrawer(Gravity.LEFT);
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);

    }


    class SlideitemListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            updateDisplay(position);
        }
    }

    @SuppressLint("NewApi")
    private void updateDisplay(int position) {
        Fragment fragment = null;
        switch (position) {

            case 0:
                fragment = new Emeregency_service();
                break;
            case 1:
                fragment = new HospitalDirectoryFragment_new();
                break;
            case 2:
                fragment = new Settings_Fragment();
                break;
            case 3:
                fragment = new UserGuideFragment();
                break;
            case 4:
                fragment = new Feedback_Fragment();
                break;
            case 5:
                fragment = new Share_Fragment();
                break;
            case 6:
                fragment = new RateUs_Fragment();
                break;
            case 7:
                fragment = new About_us();
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();
            // update selected item and title, then close the drawer
            setTitle(menutitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);
        } else {
            // error in creating fragment
            Log.e("MainActivity", "Error in creating fragment");
        }

    }

    @SuppressLint("NewApi")
    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);

        getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65e2f")));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // toggle nav drawer on selecting action bar app icon/title
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle action bar actions click
        switch (item.getItemId()) {
            default:
                return super.onOptionsItemSelected(item);
        }
    }

/* *//***
     * Called when invalidateOptionsMenu() is triggered

     @Override public boolean onPrepareOptionsMenu(Menu menu)
     {
     // if nav drawer is opened, hide the action items
     boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
     menu.findItem(R.id.action_settings).setVisible(!drawerOpen);

     return super.onPrepareOptionsMenu(menu);
     }*/

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

}

