package com.chisw.justeatkit.network;

import com.chisw.justeatkit.models.ResponseModel;
import com.chisw.justeatkit.models.RestaurantModel;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Part;
import retrofit.http.Query;

/**
 * Created by Ivan on 23.06.2015.
 */
public interface Api {

    @GET("/restaurants")
    public void getRestaurant(@Query("q") String query, Callback<ResponseModel> responce);
}
