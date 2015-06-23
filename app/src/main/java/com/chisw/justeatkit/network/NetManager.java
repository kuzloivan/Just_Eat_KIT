package com.chisw.justeatkit.network;

import com.chisw.justeatkit.models.ResponseModel;
import com.chisw.justeatkit.models.RestaurantModel;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Ivan on 23.06.2015.
 */
public class NetManager {

    public NetManager(){

    }

    public void getRestaurant(String code){
        RestClient.get().getRestaurant(code, new Callback<ResponseModel>() {
            @Override
            public void success(ResponseModel responseModel, Response response) {


            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
