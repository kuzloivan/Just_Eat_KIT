package com.chisw.justeatkit.models;

/**
 * Created by Ivan on 23.06.2015.
 */
public class CuisineTypesModel {

    private long Id;
    private String Name;
    private String SeoName;

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

    public String getSeoName() {
        return SeoName;
    }

    public void setSeoName(String seoName) {
        SeoName = seoName;
    }
}
