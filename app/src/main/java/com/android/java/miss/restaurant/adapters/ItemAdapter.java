package com.android.java.miss.restaurant.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
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

import java.util.List;

/**
 * Created by suadahaji.
 */

public class ItemAdapter extends ArrayAdapter<ItemModel> {

  private Context context;
  private List<ItemModel> objects;
  /*public static final String ITEM_BUNDLE = "ITEM_BUNDLE";
  private static final int REQUEST_CODE = 1001;*/

  public ItemAdapter(Context context, int resource,  List<ItemModel> objects) {
    super(context, resource, objects);
    this.context = context;
    this.objects = objects;

  }

  @NonNull
  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    // Get the data item for this position
    final ItemModel itemModel = objects.get(position);

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

    /*convertView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
//        ActivityLauncher.runIntent(context, HomeActivity.class);
        ActivityLauncher.eventIntent(context, ItemDetailActivity.class, itemModel);
      }
    });*/

    return convertView;
  }

 /* @Override
  public void onItemSelected(ItemModel model) {
    Bundle b = model.toBundle();
    Intent intent = new Intent(context, ItemDetailActivity.class);
    intent.putExtra(ITEM_BUNDLE, b);
    ((Activity)getContext()).startActivityForResult(intent, REQUEST_CODE);
  }*/
}
