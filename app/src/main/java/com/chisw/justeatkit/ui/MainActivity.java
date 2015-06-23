package com.chisw.justeatkit.ui;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.chisw.justeatkit.R;
import com.chisw.justeatkit.models.ResponseModel;
import com.chisw.justeatkit.utils.RestaurantObserver;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class MainActivity extends GenericActivity {

    private Observer observer;
    private ListView listView;
    private RestoranAdapter adapter;
    private TextView emptyText;
    private EditText editText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        observer = new RestaurantObserver();
        netManager.getRestaurant();
        listView = (ListView) findViewById(R.id.list_view);
        adapter = new RestoranAdapter(this,new ArrayList<ResponseModel>());
        listView.setAdapter(adapter);
        emptyText = (TextView) findViewById(R.id.empty_text);
        editText = (EditText) findViewById(R.id.search_post_code);
        findViewById(R.id.button_search).setOnClickListener(new Clicker());
    }

    @Override
    protected void onResume() {
        super.onResume();
        restoreManager.addObserver(observer);
    }

    @Override
    protected void onPause() {
        super.onPause();
        restoreManager.deleteObserver(observer);
    }



    private class RestaurantObserver extends com.chisw.justeatkit.utils.RestaurantObserver{


        @Override
        public void noRestaurant() {
            adapter.clear();
            emptyText.setVisibility(View.VISIBLE);
            listView.setVisibility(View.INVISIBLE);
        }

        @Override
        public void onError() {
            adapter.clear();

        }

        @Override
        public void onLoaded() {
            adapter.clear();
            adapter.addAll(restoreManager.getModels());

            emptyText.setVisibility(View.INVISIBLE);
            listView.setVisibility(View.VISIBLE);
        }
    }

    private class Clicker implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            netManager.getRestaurant(editText.getText().toString());
        }
    }
}
