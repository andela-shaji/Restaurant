package com.android.java.miss.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.android.java.miss.restaurant.adapters.ItemAdapter;
import com.android.java.miss.restaurant.fragments.ItemListFragment;
import com.android.java.miss.restaurant.helpers.ActivityLauncher;
import com.android.java.miss.restaurant.helpers.ItemModel;
import com.android.java.miss.restaurant.views.ItemDetailActivity;

import java.util.ArrayList;

public class SaladActivity extends AppCompatActivity implements ItemListFragment.Callbacks{

  private Toolbar toolbar;
  private ListView itemListView;
  private ArrayList<ItemModel> items;
  private ItemAdapter itemAdapter;

  public static final String ITEM_BUNDLE = "ITEM_BUNDLE";
  private static final int REQUEST_CODE = 1001;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_salad);
    toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
    setTitle("Soup");


    /*itemListView = (ListView) findViewById(R.id.listview_item);
    items = new ArrayList<>();
    itemAdapter = new ItemAdapter(this, items);
    initializeData();

    itemListView.setAdapter(itemAdapter);
    itemListView.setOnItemClickListener(
            new AdapterView.OnItemClickListener()
            {
              @Override
              public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {

                ItemModel model = items.get(position);
                activity.onItemSelected(model);
              }
            }
    );
*/

    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        ActivityLauncher.runIntent(SaladActivity.this, HomeActivity.class);
      }
    });

  }

  private void initializeData() {
    ItemModel newItemOne = new ItemModel("Vegetable Soup", "Vegetable Soup", "$10.00", "https://images8.alphacoders.com/396/thumb-350-396327.jpg");
    ItemModel newItemTwo = new ItemModel("Melayamum Soup", "Soup Steaming Bread", "$8.00", "https://images2.alphacoders.com/276/thumb-350-276382.jpg");
    ItemModel newItemThree = new ItemModel("Pichlsteiner Soup", "Soup Steaming Bread", "$20.00", "https://images6.alphacoders.com/749/thumb-350-749237.jpg");
    ItemModel newItemFour = new ItemModel("Minestrone Soup", "Soup Steaming Bread", "$35.00", "https://images5.alphacoders.com/407/thumb-1920-407550.jpg");
    ItemModel newItemFive = new ItemModel("Soup Steaming", "Soup Steaming Bread", "$23.50", "https://images7.alphacoders.com/343/thumb-1920-343425.jpg");
    ItemModel newItemSix = new ItemModel("Tomato Soup", "Soup Steaming Bread", "$23.50", "https://images.alphacoders.com/435/thumb-350-435913.jpg");
    itemAdapter.add(newItemOne);
    itemAdapter.add(newItemTwo);
    itemAdapter.add(newItemThree);
    itemAdapter.add(newItemFour);
    itemAdapter.add(newItemFive);
    itemAdapter.add(newItemSix);


  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    return super.onOptionsItemSelected(item);
  }

 /* @Override
  public void onItemSelected(ItemModel model) {
    Bundle b = model.toBundle();
    Intent intent = new Intent(this, ItemDetailActivity.class);
    intent.putExtra(ITEM_BUNDLE, b);
    startActivityForResult(intent, REQUEST_CODE);
  }*/




 /* public void onItemSelected(ItemModel model) {

    Bundle b = model.toBundle();
    Intent intent = new Intent(this, ItemDetailActivity.class);
    intent.putExtra(ITEM_BUNDLE, b);
    startActivityForResult(intent, REQUEST_CODE);

  }
*/

  @Override
  public void onItemSelected(ItemModel item) {
    Bundle bundle = item.toBundle();
    Intent intent = new Intent(this, ItemDetailActivity.class);
    intent.putExtra(ITEM_BUNDLE, bundle);
    startActivityForResult(intent, REQUEST_CODE);
  }
}


