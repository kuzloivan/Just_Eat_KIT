package com.chisw.justeatkit.models;

import java.util.List;

/**
 * Created by Ivan on 23.06.2015.
 */
public class RestaurantModel {

    private  long Id;
    private  String Name;
    private  String Address;
    private  String Postcode;
    private  String City;
    private  String Url;
    private  String ReasonWhyTemporarilyOffline;
    private  String UniqueName;
    private  boolean IsOpenNow;
    private  boolean IsSponsored;
    private  boolean IsNew;
    private  boolean IsTemporarilyOffline;
    private  boolean IsCloseBy;
    private  boolean IsHalal;
    private  boolean IsOpenNowForDelivery;
    private  boolean IsOpenNowForCollection;
    private  int DefaultDisplayRank;
    private  float RatingStars;
    private  int NumberOfRatings;
    private  List<CuisineTypesModel> CuisineTypes;
    private  List<LogoModel> Logo;
    private  List<DealsModel> Deals;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getReasonWhyTemporarilyOffline() {
        return ReasonWhyTemporarilyOffline;
    }

    public void setReasonWhyTemporarilyOffline(String reasonWhyTemporarilyOffline) {
        ReasonWhyTemporarilyOffline = reasonWhyTemporarilyOffline;
    }

    public String getUniqueName() {
        return UniqueName;
    }

    public void setUniqueName(String uniqueName) {
        UniqueName = uniqueName;
    }

    public boolean isOpenNow() {
        return IsOpenNow;
    }

    public void setIsOpenNow(boolean isOpenNow) {
        IsOpenNow = isOpenNow;
    }

    public boolean isSponsored() {
        return IsSponsored;
    }

    public void setIsSponsored(boolean isSponsored) {
        IsSponsored = isSponsored;
    }

    public boolean isNew() {
        return IsNew;
    }

    public void setIsNew(boolean isNew) {
        IsNew = isNew;
    }

    public boolean isTemporarilyOffline() {
        return IsTemporarilyOffline;
    }

    public void setIsTemporarilyOffline(boolean isTemporarilyOffline) {
        IsTemporarilyOffline = isTemporarilyOffline;
    }

    public boolean isCloseBy() {
        return IsCloseBy;
    }

    public void setIsCloseBy(boolean isCloseBy) {
        IsCloseBy = isCloseBy;
    }

    public boolean isHalal() {
        return IsHalal;
    }

    public void setIsHalal(boolean isHalal) {
        IsHalal = isHalal;
    }

    public boolean isOpenNowForDelivery() {
        return IsOpenNowForDelivery;
    }

    public void setIsOpenNowForDelivery(boolean isOpenNowForDelivery) {
        IsOpenNowForDelivery = isOpenNowForDelivery;
    }

    public boolean isOpenNowForCollection() {
        return IsOpenNowForCollection;
    }

    public void setIsOpenNowForCollection(boolean isOpenNowForCollection) {
        IsOpenNowForCollection = isOpenNowForCollection;
    }

    public int getDefaultDisplayRank() {
        return DefaultDisplayRank;
    }

    public void setDefaultDisplayRank(int defaultDisplayRank) {
        DefaultDisplayRank = defaultDisplayRank;
    }

    public float getRatingStars() {
        return RatingStars;
    }

    public void setRatingStars(float ratingStars) {
        RatingStars = ratingStars;
    }

    public int getNumberOfRatings() {
        return NumberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        NumberOfRatings = numberOfRatings;
    }

    public List<CuisineTypesModel> getCuisineTypes() {
        return CuisineTypes;
    }

    public void setCuisineTypes(List<CuisineTypesModel> cuisineTypes) {
        CuisineTypes = cuisineTypes;
    }

    public List<LogoModel> getLogo() {
        return Logo;
    }

    public void setLogo(List<LogoModel> logo) {
        Logo = logo;
    }

    public List<DealsModel> getDeals() {
        return Deals;
    }

    public void setDeals(List<DealsModel> deals) {
        Deals = deals;
    }
}
