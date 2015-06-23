package com.chisw.justeatkit.models;

/**
 * Created by Ivan on 23.06.2015.
 */
public class DealsModel {

    private  String Description;
    private  String DiscountPercent;
    private  String QualifyingPrice;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDiscountPercent() {
        return DiscountPercent;
    }

    public void setDiscountPercent(String discountPercent) {
        DiscountPercent = discountPercent;
    }

    public String getQualifyingPrice() {
        return QualifyingPrice;
    }

    public void setQualifyingPrice(String qualifyingPrice) {
        QualifyingPrice = qualifyingPrice;
    }
}
