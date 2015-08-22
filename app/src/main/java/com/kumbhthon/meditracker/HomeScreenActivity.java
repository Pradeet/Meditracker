package com.kumbhthon.meditracker;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
    private CustomAdapter adapter;
    static Context context;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        context = HomeScreenActivity.this;
        mTitle = mDrawerTitle = getTitle();

        menutitles = getResources().getStringArray(R.array.titles);
        menuIcons = getResources().obtainTypedArray(R.array.icons);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.slider_list);


        rowItems = new ArrayList<RowItem>();

        for (int i = 0; i < menutitles.length; i++) {

            RowItem items = new RowItem(menutitles[i], menuIcons.getResourceId(i, -1));
            rowItems.add(items);
        }

        menuIcons.recycle();

        adapter = new CustomAdapter(getApplicationContext(), rowItems);

        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new SlideitemListener());

        // enabling action bar app icon and behaving it as toggle button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.mipmap.ic_drawer, R.string.app_name, R.string.app_name) {
            @SuppressLint("NewApi")

            public void onDrawerClosed(View view) {
                getSupportActionBar().setTitle(mTitle);
                // calling onPrepareOptionsMenu() to show action bar icons
                invalidateOptionsMenu();
            }


            @SuppressLint("NewApi")
            public void onDrawerOpened(View drawerView) {
                getSupportActionBar().setTitle(mDrawerTitle);

                // calling onPrepareOptionsMenu() to hide action bar icons
                invalidateOptionsMenu();
            }


        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null) {
            // on first time display view for first nav item
            updateDisplay(0);
        }


        Intent i = new Intent(HomeScreenActivity.this, LocService.class);
        startService(i);

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
                fragment = new New_emeregency();
                break;
            case 1:
                fragment = new Ex_frag();
                break;
            case 2:
                fragment = new HelpMap_Fragment();
                break;
            case 3:
                fragment = new HelpCenterFragment();
                break;
            case 4:
                fragment = new Settings_Fragment();
                break;
            case 5:
                fragment = new User_guid_Fragment();
                break;
            case 6:
                fragment = new Feedback_Fragment();
                break;
            case 7:
                fragment = new Share_Fragment();
                break;
            case 8:
                fragment = new RateUs_Fragment();
                break;


            case 9:
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

        ActionBar bar = getSupportActionBar();

        getSupportActionBar().setIcon(
                new ColorDrawable(getResources().getColor(android.R.color.transparent)));

        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65e2f")));
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

