package com.chisw.justeatkit;

import android.app.Application;

import com.chisw.justeatkit.network.NetManager;

/**
 * Created by Ivan on 23.06.2015.
 */
public class App extends Application {

    private NetManager netManager;
    private RestoreManager restoreManager;


    @Override
    public void onCreate() {
        super.onCreate();
        restoreManager =new RestoreManager();
        netManager = new NetManager(this,restoreManager);
    }

    public NetManager getNetManager() {
        return netManager;
    }

    public RestoreManager getRestoreManager() {
        return restoreManager;
    }
}
