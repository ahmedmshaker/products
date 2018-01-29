
package com.assignment.businessboomertask.productdetails.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Variants {

    @SerializedName("href")
    private String mHref;

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

}
