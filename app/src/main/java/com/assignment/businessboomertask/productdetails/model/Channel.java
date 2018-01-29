
package com.assignment.businessboomertask.productdetails.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Channel {

    @SerializedName("code")
    private String mCode;
    @SerializedName("color")
    private String mColor;
    @SerializedName("createdAt")
    private String mCreatedAt;
    @SerializedName("enabled")
    private Boolean mEnabled;
    @SerializedName("hostname")
    private String mHostname;
    @SerializedName("id")
    private Long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("taxCalculationStrategy")
    private String mTaxCalculationStrategy;
    @SerializedName("updatedAt")
    private String mUpdatedAt;
    @SerializedName("_links")
    private com.assignment.businessboomertask.productdetails.model._links m_links;

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public Boolean getEnabled() {
        return mEnabled;
    }

    public void setEnabled(Boolean enabled) {
        mEnabled = enabled;
    }

    public String getHostname() {
        return mHostname;
    }

    public void setHostname(String hostname) {
        mHostname = hostname;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getTaxCalculationStrategy() {
        return mTaxCalculationStrategy;
    }

    public void setTaxCalculationStrategy(String taxCalculationStrategy) {
        mTaxCalculationStrategy = taxCalculationStrategy;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public com.assignment.businessboomertask.productdetails.model._links get_links() {
        return m_links;
    }

    public void set_links(com.assignment.businessboomertask.productdetails.model._links _links) {
        m_links = _links;
    }

}
