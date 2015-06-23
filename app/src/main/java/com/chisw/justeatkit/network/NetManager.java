package com.chisw.justeatkit.network;

import android.content.Context;
import android.widget.Toast;

import com.chisw.justeatkit.RestoreManager;
import com.chisw.justeatkit.models.ResponseModel;
import com.chisw.justeatkit.models.RestaurantModel;
import com.chisw.justeatkit.utils.LocationUtil;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Ivan on 23.06.2015.
 */
public class NetManager {

    private Context context;
    private RestoreManager restoreManager;

    public NetManager(Context context, RestoreManager restoreManager){
        this.context = context;
        this.restoreManager = restoreManager;
    }

    public void getRestaurant(){
        String postCode = LocationUtil.getPostCode(context);
        if(postCode == null)
            postCode ="se13";
        RestClient.get().getRestaurant(postCode, new Callback<ResponseModel>() {
            @Override
            public void success(ResponseModel responseModel, Response response) {

                restoreManager.setModels(responseModel.getRestaurants());
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(context,error.getLocalizedMessage(),Toast.LENGTH_SHORT);
                restoreManager.setModels(new ArrayList<RestaurantModel>());
            }
        });
    }
        public void getRestaurant(String code){
        RestClient.get().getRestaurant(code, new Callback<ResponseModel>() {
            @Override
            public void success(ResponseModel responseModel, Response response) {

                restoreManager.setModels(responseModel.getRestaurants());
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(context,error.getLocalizedMessage(),Toast.LENGTH_SHORT);
                restoreManager.setModels(new ArrayList<RestaurantModel>());
            }
        });
    }
}
