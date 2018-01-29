
package com.assignment.businessboomertask.products.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Image {

    @SerializedName("id")
    private Long mId;
    @SerializedName("path")
    private String mPath;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getPath() {
        return mPath;
    }

    public void setPath(String path) {
        mPath = path;
    }

}
