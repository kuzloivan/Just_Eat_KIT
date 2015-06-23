package com.chisw.justeatkit;

import android.app.Application;

import com.chisw.justeatkit.network.NetManager;

/**
 * Created by Ivan on 23.06.2015.
 */
public class App extends Application {

    private NetManager netManager;


    @Override
    public void onCreate() {
        super.onCreate();
        NetManager netManager = new NetManager();
        netManager.getRestaurant("se19");
    }
}
