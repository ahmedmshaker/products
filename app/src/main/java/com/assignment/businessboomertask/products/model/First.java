
package com.assignment.businessboomertask.products.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class First {

    @SerializedName("href")
    private String mHref;

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

}
