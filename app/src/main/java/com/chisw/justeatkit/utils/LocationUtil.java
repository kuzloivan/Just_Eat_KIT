package com.chisw.justeatkit.utils;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Created by Ivan on 23.06.2015.
 */
public class LocationUtil {

    public static String getPostCode(Context context) {

        LocationManager mLocationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

        Location location = mLocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        Geocoder geoCoder = new Geocoder(context, Locale.getDefault());
        List<Address> address = null;

        if (geoCoder != null) {
            try {
                address = geoCoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            if (address.size() > 0) {
                return address.get(0).getPostalCode();
            }
        }
        return null;
    }
}
