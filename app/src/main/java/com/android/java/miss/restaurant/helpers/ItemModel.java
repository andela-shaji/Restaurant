package com.android.java.miss.restaurant.helpers;

/**
 * Created by suadahaji.
 */

public class ItemModel {
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
}
