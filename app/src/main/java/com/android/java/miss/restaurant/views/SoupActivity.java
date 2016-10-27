package com.android.java.miss.restaurant.views;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.android.java.miss.restaurant.HomeActivity;
import com.android.java.miss.restaurant.R;
import com.android.java.miss.restaurant.helpers.ActivityLauncher;

public class SoupActivity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener {
  private Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_soup);
    initialize();
  }

  public void initialize() {
    toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    setUpNavigationDrawer();

  }

  private void setUpNavigationDrawer() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.list_drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
    navigationView.setItemIconTintList(null);
  }

  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    int id = item.getItemId();
    if (id == R.id.nav_menu) {
      ActivityLauncher.runIntent(this, HomeActivity.class);
      finish();
    } else if (id == R.id.nav_feedback) {
      finish();
    }  else if (id == R.id.nav_booking) {
      finish();
    }
    else if (id == R.id.nav_contact) {
      finish();
    }
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.list_drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

}
