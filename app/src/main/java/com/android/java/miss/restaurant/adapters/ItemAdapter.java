package com.android.java.miss.restaurant.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.java.miss.restaurant.R;
import com.android.java.miss.restaurant.helpers.ItemModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by suadahaji.
 */

public class ItemAdapter extends ArrayAdapter<ItemModel> {
  private Context context;

  public ItemAdapter(Context context, ArrayList<ItemModel> itemModels) {
    super(context, 0, itemModels);
    this.context = context;
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
    ImageView itemImage = (ImageView) convertView.findViewById(R.id.itemImage);

    itemTitle.setText(itemModel.getName());
    itemCost.setText(itemModel.getCost());

    if (itemModel.getPhoto() == null) {
      itemImage.setBackgroundResource(R.drawable.soup_one);
    }
    Picasso.with(context).load(itemModel.getPhoto()).fit().into(itemImage);

    Picasso.with(context).setLoggingEnabled(true);

    Log.d("Suada", itemModel.getPhoto());

    return convertView;
  }
}
