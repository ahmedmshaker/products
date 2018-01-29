
package com.assignment.businessboomertask.productdetails.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Self {

    @SerializedName("href")
    private String mHref;

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

}
