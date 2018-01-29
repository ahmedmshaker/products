
package com.assignment.businessboomertask.productdetails.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class _links {

    @SerializedName("self")
    private Self mSelf;
    @SerializedName("variants")
    private Variants mVariants;

    public Self getSelf() {
        return mSelf;
    }

    public void setSelf(Self self) {
        mSelf = self;
    }

    public Variants getVariants() {
        return mVariants;
    }

    public void setVariants(Variants variants) {
        mVariants = variants;
    }

}
