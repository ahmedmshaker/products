
package com.assignment.businessboomertask.productdetails.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Option {

    @SerializedName("code")
    private String mCode;
    @SerializedName("id")
    private Long mId;
    @SerializedName("position")
    private Long mPosition;
    @SerializedName("translations")
    private Translations mTranslations;
    @SerializedName("values")
    private List<Value> mValues;
    @SerializedName("_links")
    private com.assignment.businessboomertask.productdetails.model._links m_links;

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

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

    public Translations getTranslations() {
        return mTranslations;
    }

    public void setTranslations(Translations translations) {
        mTranslations = translations;
    }

    public List<Value> getValues() {
        return mValues;
    }

    public void setValues(List<Value> values) {
        mValues = values;
    }

    public com.assignment.businessboomertask.productdetails.model._links get_links() {
        return m_links;
    }

    public void set_links(com.assignment.businessboomertask.productdetails.model._links _links) {
        m_links = _links;
    }

}
