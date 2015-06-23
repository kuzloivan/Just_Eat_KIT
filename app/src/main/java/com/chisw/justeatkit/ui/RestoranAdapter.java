package com.chisw.justeatkit.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.chisw.justeatkit.R;
import com.chisw.justeatkit.models.CuisineTypesModel;
import com.chisw.justeatkit.models.LogoModel;
import com.chisw.justeatkit.models.ResponseModel;
import com.chisw.justeatkit.models.RestaurantModel;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;

public class RestoranAdapter extends ArrayAdapter<RestaurantModel> {
    private final LayoutInflater mInflater;

    public RestoranAdapter(Context context, ArrayList<ResponseModel> pRestoranList) {
        super(context, 0);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RestaurantModel restaurant = getItem(position);
        Holder holder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_restoran, parent, false);
            holder = new Holder();

            holder.mName = (TextView) convertView.findViewById(R.id.ar_name);
            holder.mLogo = (ImageView) convertView.findViewById(R.id.ar_logo);
            holder.mTypeOfFood = (TextView) convertView.findViewById(R.id.ar_type_of_food);
            holder.mRating = (TextView) convertView.findViewById(R.id.ar_rating);

            convertView.setTag(holder);

        } else {
            holder = (Holder) convertView.getTag();
        }

        holder.mName.setText(restaurant.getName());
        holder.mRating.setText(String.valueOf(restaurant.getRatingStars()));

        List<CuisineTypesModel> foodTypes = restaurant.getCuisineTypes();
        String type = "unknow";
        if (!foodTypes.isEmpty()) {
            type = foodTypes.get(0).getName();
        }

        holder.mTypeOfFood.setText(type);

        List<LogoModel> logos = restaurant.getLogo();
        if (!logos.isEmpty()) {
            Picasso.with(getContext()).load(logos.get(0).getStandardResolutionURL()).into(holder.mLogo);
        }
        return convertView;
    }

    private static final class Holder {
        TextView mName;
        TextView mTypeOfFood;
        TextView mRating;
        ImageView mLogo;
    }
}
