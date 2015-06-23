package com.chisw.justeatkit;

import com.chisw.justeatkit.models.ResponseModel;
import com.chisw.justeatkit.models.RestaurantModel;
import com.chisw.justeatkit.utils.RestaurantObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Ivan on 23.06.2015.
 */
public class RestoreManager extends Observable {

    List<RestaurantModel> models = new ArrayList<>(0);

    public List<RestaurantModel> getModels() {
        return models;
    }

    public void setModels(List<RestaurantModel> models) {

        this.models = models;
        setChanged();
        notifyObservers(models.size()>0? RestaurantObserver.LOADED_RESTAURANTS:RestaurantObserver.NO_RESTAURANTS);
    }
}
