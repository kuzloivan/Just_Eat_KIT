package com.chisw.justeatkit.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.chisw.justeatkit.App;
import com.chisw.justeatkit.RestoreManager;
import com.chisw.justeatkit.network.NetManager;

/**
 * Created by Ivan on 23.06.2015.
 */
public class GenericActivity extends AppCompatActivity{

    protected NetManager netManager;
    protected RestoreManager restoreManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App app = (App) getApplicationContext();
        restoreManager = app.getRestoreManager();
        netManager = app.getNetManager();
    }
}
