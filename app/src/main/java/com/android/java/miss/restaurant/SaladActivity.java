package com.android.java.miss.restaurant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.android.java.miss.restaurant.adapters.ItemAdapter;
import com.android.java.miss.restaurant.helpers.ActivityLauncher;
import com.android.java.miss.restaurant.helpers.ItemModel;

import java.util.ArrayList;

public class SaladActivity extends AppCompatActivity {
  private Toolbar toolbar;
  private ListView itemListView;
  private ArrayList<ItemModel> items;
  private ItemAdapter itemAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_salad);
    toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
    setTitle("Soup");



    itemListView = (ListView) findViewById(R.id.listview_item);
    items = new ArrayList<>();
    itemAdapter = new ItemAdapter(this, items);
    initializeData();

    itemListView.setAdapter(itemAdapter);

    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        ActivityLauncher.runIntent(SaladActivity.this, HomeActivity.class);
      }
    });
  }

  private void initializeData() {
    ItemModel newItemOne = new ItemModel("Soup Steaming Bread", "Soup Steaming Bread", "$10.00");
    ItemModel newItemTwo = new ItemModel("Soup Steaming Bread", "Soup Steaming Bread", "$10.00");
    ItemModel newItemThree = new ItemModel("Soup Steaming Bread", "Soup Steaming Bread", "$10.00");
    ItemModel newItemFour = new ItemModel("Soup Steaming Bread", "Soup Steaming Bread", "$10.00");
    ItemModel newItemFive = new ItemModel("Soup Steaming Bread", "Soup Steaming Bread", "$10.00");
    itemAdapter.add(newItemOne);
    itemAdapter.add(newItemTwo);
    itemAdapter.add(newItemThree);
    itemAdapter.add(newItemFour);
    itemAdapter.add(newItemFive);

  }
}
