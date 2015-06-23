package com.chisw.justeatkit.utils;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Ivan on 23.06.2015.
 */
public abstract class RestaurantObserver implements Observer{
    public  static final String NO_RESTAURANTS="NO_RESTAURANTS";
    public  static final String ERROR="ERROR";
    public  static final String LOADED_RESTAURANTS="LOADED_RESTAURANTS";


    @Override
    public void update(Observable observable, Object data) {
        switch ((String)data){
            case NO_RESTAURANTS:noRestaurant(); break;
            case ERROR:onError(); break;
            case LOADED_RESTAURANTS:onLoaded(); break;
        }
    }

    public abstract void noRestaurant();
    public abstract void onError();
    public abstract void onLoaded();
}
