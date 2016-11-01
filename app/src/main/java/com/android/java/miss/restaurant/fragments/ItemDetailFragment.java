package com.android.java.miss.restaurant.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.java.miss.restaurant.R;
import com.android.java.miss.restaurant.helpers.ItemModel;
import com.squareup.picasso.Picasso;

public class ItemDetailFragment  extends Fragment {
  ItemModel itemModel;

  public ItemDetailFragment() {}

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Bundle bundle = getArguments();
    if (bundle != null && bundle.containsKey(ItemModel.ITEM_NAME)) {
       itemModel = new ItemModel(bundle);

    }
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Load the layout
    View view = inflater.inflate(R.layout.detail_view_layout, container, false);
    if (itemModel != null) {
      // Display values and image

      ImageView itemImage = (ImageView) view.findViewById(R.id.image_detail);
      TextView itemTitle = (TextView) view.findViewById(R.id.food_title);
      TextView itemDescription = (TextView) view.findViewById(R.id.food_detail);


      Picasso.with(getContext()).load(itemModel.getPhoto()).into(itemImage);
      itemTitle.setText(itemModel.getName());
      itemDescription.setText(itemModel.getDescription());

    }
    return view;
  }
}
