package com.android.java.miss.restaurant.helpers;

import android.os.Bundle;

/**
 * Created by suadahaji.
 */

public class ItemModel {

  //	constants for field references
  public static final String ITEM_NAME = "itemName";
  public static final String ITEM_DESCRIPTION = "itemDescription";
  public static final String COST = "cost";
  public static final String PHOTO = "photo";


  private String name, description, cost, photo;

  public ItemModel(String name, String description, String cost, String photo) {
    this.name = name;
    this.description = description;
    this.cost = cost;
    this.photo = photo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  //	Create from a bundle
  public ItemModel(Bundle b) {
    if (b != null) {
      this.name = b.getString(ITEM_NAME);
      this.description = b.getString(ITEM_DESCRIPTION);
      this.cost = b.getString(COST);
      this.photo = b.getString(PHOTO);
    }
  }

  //	Package data for transfer between activities
  public Bundle toBundle() {
    Bundle b = new Bundle();
    b.putString(ITEM_NAME, this.name);
    b.putString(ITEM_DESCRIPTION, this.description);
    b.putString(COST, this.cost);
    b.putString(PHOTO, this.photo);
    return b;
  }

  @Override
  public String toString() {
    return name;
  }
}
