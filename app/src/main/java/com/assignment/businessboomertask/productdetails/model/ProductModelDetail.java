
package com.assignment.businessboomertask.productdetails.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ProductModelDetail {


    @SerializedName("averageRating")
    private Long mAverageRating;
    @SerializedName("barcode")
    private String mBarcode;
    @SerializedName("channels")
    private List<Channel> mChannels;
    @SerializedName("code")
    private String mCode;
    @SerializedName("id")
    private Long mId;
    @SerializedName("images")
    private List<Image> mImages;
    @SerializedName("name")
    private String mName;
    @SerializedName("options")
    private List<Option> mOptions;

    @SerializedName("translations")
    private Translations mTranslations;
    @SerializedName("_links")
    private com.assignment.businessboomertask.productdetails.model._links m_links;

    public Long getAverageRating() {
        return mAverageRating;
    }

    public void setAverageRating(Long averageRating) {
        mAverageRating = averageRating;
    }

    public String getBarcode() {
        return mBarcode;
    }

    public void setBarcode(String barcode) {
        mBarcode = barcode;
    }

    public List<Channel> getChannels() {
        return mChannels;
    }

    public void setChannels(List<Channel> channels) {
        mChannels = channels;
    }

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

    public List<Image> getImages() {
        return mImages;
    }

    public void setImages(List<Image> images) {
        mImages = images;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<Option> getOptions() {
        return mOptions;
    }

    public void setOptions(List<Option> options) {
        mOptions = options;
    }




    public Translations getTranslations() {
        return mTranslations;
    }

    public void setTranslations(Translations translations) {
        mTranslations = translations;
    }

    public com.assignment.businessboomertask.productdetails.model._links get_links() {
        return m_links;
    }

    public void set_links(com.assignment.businessboomertask.productdetails.model._links _links) {
        m_links = _links;
    }

}
