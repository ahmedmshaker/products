
package com.assignment.businessboomertask.productdetails.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ProductTaxon {

    @SerializedName("id")
    private Long mId;
    @SerializedName("position")
    private Long mPosition;
    @SerializedName("taxon")
    private Taxon mTaxon;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getPosition() {
        return mPosition;
    }

    public void setPosition(Long position) {
        mPosition = position;
    }

    public Taxon getTaxon() {
        return mTaxon;
    }

    public void setTaxon(Taxon taxon) {
        mTaxon = taxon;
    }

}
