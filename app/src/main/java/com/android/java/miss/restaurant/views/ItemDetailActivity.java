package com.android.java.miss.restaurant.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.android.java.miss.restaurant.R;
import com.android.java.miss.restaurant.SaladActivity;
import com.android.java.miss.restaurant.fragments.ItemDetailFragment;

public class ItemDetailActivity extends AppCompatActivity {
  private Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_item_detail);

    toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    if (savedInstanceState == null) {
      ItemDetailFragment fragment = new ItemDetailFragment();
      Bundle bundle = getIntent().getBundleExtra(SaladActivity.ITEM_BUNDLE);
      fragment.setArguments(bundle);
      getFragmentManager().beginTransaction()
              .add(R.id.detailContainer, fragment)
              .commit();
    }

  }


  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
      finish();
    }
    return true;
  }


}
