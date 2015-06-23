package com.chisw.justeatkit.network;

import android.util.Log;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Created by Ivan on 23.06.2015.
 */
public class RestClient {

    private static final String ROOT = "http://api-interview.just-eat.com";
    private static final String AUTHORIZATION_HEADER ="Authorization";
    private static final String ACCEPT_TENANT_HEADER ="Accept-Tenant";
    private static final String ACCEPT_LANGUAGE_HEADER ="Accept-Language";

    private static final String AUTHORIZATION ="Basic VGVjaFRlc3RBUEk6dXNlcjI=";
    private static final String ACCEPT_TENANT ="uk";
    private static final String ACCEPT_LANGUAGE ="en-GB";

    private static Api REST_CLIENT;
    public static  Api get(){ return REST_CLIENT;}

    static {
        setupRestClient();
    }
    private static void setupRestClient() {
        Gson gson = new GsonBuilder().create();

        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(ROOT)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setConverter(new GsonConverter(gson))
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addHeader(ACCEPT_LANGUAGE_HEADER, ACCEPT_LANGUAGE);
                        request.addHeader(ACCEPT_TENANT_HEADER, ACCEPT_TENANT);
                        request.addHeader(AUTHORIZATION_HEADER, AUTHORIZATION);
                    }
                });

        RestAdapter restAdapter = builder.build();
        REST_CLIENT = restAdapter.create(Api.class);
    }
}
