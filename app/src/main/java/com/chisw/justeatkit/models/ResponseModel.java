package com.chisw.justeatkit.models;

import java.util.List;

/**
 * Created by Ivan on 23.06.2015.
 */
public class ResponseModel {

   private String ShortResultText;
   private List<RestaurantModel> Restaurants;

    public String getShortResultText() {
        return ShortResultText;
    }

    public void setShortResultText(String shortResultText) {
        ShortResultText = shortResultText;
    }

    public List<RestaurantModel> getRestaurants() {
        return Restaurants;
    }

    public void setRestaurants(List<RestaurantModel> restaurants) {
        Restaurants = restaurants;
    }
}
