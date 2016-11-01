package com.android.java.miss.restaurant.helpers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suadahaji.
 */

public class ItemData {
  private List<ItemModel> items = new ArrayList<>();
  public List<ItemModel> getItems() {
    return items;
  }

  public ItemData() {
    items.add(new ItemModel("Vegetable Soup", "Vegetable Soup", "$10.00", "https://images8.alphacoders.com/396/thumb-350-396327.jpg"));
    items.add(new ItemModel("Melayamum Soup", "Soup Steaming Bread", "$8.00", "https://images2.alphacoders.com/276/thumb-350-276382.jpg"));
    items.add(new ItemModel("Pichlsteiner Soup", "Soup Steaming Bread", "$20.00", "https://images6.alphacoders.com/749/thumb-350-749237.jpg"));
    items.add(new ItemModel("Minestrone Soup", "Soup Steaming Bread", "$35.00", "https://images5.alphacoders.com/407/thumb-1920-407550.jpg"));
    items.add(new ItemModel("Soup Steaming", "Soup Steaming Bread", "$23.50", "https://images7.alphacoders.com/343/thumb-1920-343425.jpg"));
    items.add(new ItemModel("Tomato Soup", "Soup Steaming Bread", "$23.50", "https://images.alphacoders.com/435/thumb-350-435913.jpg"));

  }
}
