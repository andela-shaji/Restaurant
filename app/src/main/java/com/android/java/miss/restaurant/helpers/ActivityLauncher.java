package com.android.java.miss.restaurant.helpers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by suadahaji.
 */
public class ActivityLauncher {
  public static final String ITEM_BUNDLE = "ITEM_BUNDLE";
  private static final int REQUEST_CODE = 1001;

  public static void runIntent(Context context, Class<?> activityClass) {
    Intent intent = new Intent(context, activityClass);
    context.startActivity(intent);
  }

  public static void eventIntent(Context context, Class<?> activityClass, ItemModel itemModel) {
    Intent intent = new Intent(context, activityClass);
    Bundle bundle = itemModel.toBundle();
    intent.putExtra(ITEM_BUNDLE, bundle);
    context.startActivity(intent);
  // startActivityForResult(intent, REQUEST_CODE);
  }

}
