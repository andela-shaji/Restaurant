package com.android.java.miss.restaurant.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.java.miss.restaurant.R;
import com.android.java.miss.restaurant.helpers.ItemModel;

public class MainActivity extends AppCompatActivity {

  ItemModel model;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Intent intent = getIntent();
    if (intent.getExtras() != null) {

      model = intent.getParcelableExtra("ITEM_BUNDLE");

    }
  }
}
