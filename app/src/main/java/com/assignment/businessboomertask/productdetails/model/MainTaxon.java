
package com.assignment.businessboomertask.productdetails.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class MainTaxon {

    @SerializedName("children")
    private List<Child> mChildren;
    @SerializedName("code")
    private String mCode;
    @SerializedName("id")
    private Long mId;
    @SerializedName("images")
    private List<Image> mImages;
    @SerializedName("left")
    private Long mLeft;
    @SerializedName("level")
    private Long mLevel;
    @SerializedName("name")
    private String mName;
    @SerializedName("parent")
    private Parent mParent;
    @SerializedName("position")
    private Long mPosition;
    @SerializedName("right")
    private Long mRight;
    @SerializedName("root")
    private Root mRoot;
    @SerializedName("translations")
    private Translations mTranslations;
    @SerializedName("_links")
    private com.assignment.businessboomertask.productdetails.model._links m_links;

    public List<Child> getChildren() {
        return mChildren;
    }

    public void setChildren(List<Child> children) {
        mChildren = children;
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

    public Long getLeft() {
        return mLeft;
    }

    public void setLeft(Long left) {
        mLeft = left;
    }

    public Long getLevel() {
        return mLevel;
    }

    public void setLevel(Long level) {
        mLevel = level;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Parent getParent() {
        return mParent;
    }

    public void setParent(Parent parent) {
        mParent = parent;
    }

    public Long getPosition() {
        return mPosition;
    }

    public void setPosition(Long position) {
        mPosition = position;
    }

    public Long getRight() {
        return mRight;
    }

    public void setRight(Long right) {
        mRight = right;
    }

    public Root getRoot() {
        return mRoot;
    }

    public void setRoot(Root root) {
        mRoot = root;
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
