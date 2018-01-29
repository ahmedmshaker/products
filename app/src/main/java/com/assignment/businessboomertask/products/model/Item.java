
package com.assignment.businessboomertask.products.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Item {

    @SerializedName("averageRating")
    private Long mAverageRating;
    @SerializedName("barcode")
    private String mBarcode;
    @SerializedName("code")
    private String mCode;
    @SerializedName("id")
    private Long mId;
    @SerializedName("images")
    private List<Image> mImages;
    @SerializedName("name")
    private String mName;
    @SerializedName("options")
    private List<Object> mOptions;
    @SerializedName("_links")
    private com.assignment.businessboomertask.products.model._links m_links;

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

    public List<Object> getOptions() {
        return mOptions;
    }

    public void setOptions(List<Object> options) {
        mOptions = options;
    }

    public com.assignment.businessboomertask.products.model._links get_links() {
        return m_links;
    }

    public void set_links(com.assignment.businessboomertask.products.model._links _links) {
        m_links = _links;
    }

}
