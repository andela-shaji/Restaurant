package com.android.java.miss.restaurant.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.android.java.miss.restaurant.R;
import com.android.java.miss.restaurant.helpers.ItemModel;

import java.util.ArrayList;

/**
 * Created by suadahaji.
 */

public class ItemAdapter extends ArrayAdapter<ItemModel> {

  public ItemAdapter(Context context, ArrayList<ItemModel> itemModels) {
    super(context, 0, itemModels);
  }

  @NonNull
  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    // Get the data item for this position
    ItemModel itemModel = getItem(position);

    // Check if an existing view is being reused, otherwise inflate the view
    if (convertView == null) {
      convertView = LayoutInflater.from(getContext()).inflate(R.layout.cardview_layout, parent, false);
    }

    TextView itemTitle = (TextView) convertView.findViewById(R.id.itemTitle);
    Button itemCost = (Button) convertView.findViewById(R.id.itemCost);

    itemTitle.setText(itemModel.getName());
    itemCost.setText(itemModel.getCost());


    return convertView;
  }
}
