package com.chisw.justeatkit.models;

import java.util.List;

/**
 * Created by Ivan on 23.06.2015.
 */
public class RestaurantModel {

    long Id;
    String Name;
    String Address;
    String Postcode;
    String City;
    String Url;
    String ReasonWhyTemporarilyOffline;
    String UniqueName;

    boolean IsOpenNow;
    boolean IsSponsored;
    boolean IsNew;
    boolean IsTemporarilyOffline;
    boolean IsCloseBy;
    boolean IsHalal;
    boolean IsOpenNowForDelivery;
    boolean IsOpenNowForCollection;

    int DefaultDisplayRank;
    float RatingStars;
    int NumberOfRatings;

    List<CuisineTypesModel> CuisineTypes;

    List<LogoModel> Logo;

    List<DealsModel> Deals;
}
