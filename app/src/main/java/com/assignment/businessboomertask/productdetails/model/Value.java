
package com.assignment.businessboomertask.productdetails.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Value {

    @SerializedName("code")
    private String mCode;
    @SerializedName("translations")
    private Translations mTranslations;

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public Translations getTranslations() {
        return mTranslations;
    }

    public void setTranslations(Translations translations) {
        mTranslations = translations;
    }

}
