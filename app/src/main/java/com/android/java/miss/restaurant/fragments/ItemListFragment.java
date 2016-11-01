package com.android.java.miss.restaurant.fragments;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.java.miss.restaurant.R;
import com.android.java.miss.restaurant.adapters.ItemAdapter;
import com.android.java.miss.restaurant.helpers.ItemData;
import com.android.java.miss.restaurant.helpers.ItemModel;

import java.util.List;

/**
 * Created by suadahaji.
 */

public class ItemListFragment extends ListFragment {
  List<ItemModel> items = new ItemData().getItems();
  Callbacks activity;

  public ItemListFragment() {
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ItemAdapter adapter = new ItemAdapter(getActivity(), R.layout.cardview_layout, items);
    setListAdapter(adapter);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.item_list_fragment, container, false);
  }

  public interface Callbacks {
    public void onItemSelected(ItemModel item);
  }

  @Override
  public void onListItemClick(ListView l, View v, int position, long id) {
    ItemModel model = items.get(position);
    activity.onItemSelected(model);
  }

  @Override
  public void onAttach(Activity activity) {
    super.onAttach(activity);
    this.activity = (Callbacks) activity;
  }


}
