
package com.assignment.businessboomertask.productdetails.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Translations {

    @SerializedName("en_US")
    private EnUS mEnUS;

    public EnUS getEnUS() {
        return mEnUS;
    }

    public void setEnUS(EnUS enUS) {
        mEnUS = enUS;
    }

}
