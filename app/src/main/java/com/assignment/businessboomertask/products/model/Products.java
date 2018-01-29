
package com.assignment.businessboomertask.products.model;

import com.google.gson.annotations.SerializedName;

public class Products {

    @SerializedName("limit")
    private Long mLimit;
    @SerializedName("page")
    private Long mPage;
    @SerializedName("pages")
    private Long mPages;
    @SerializedName("total")
    private Long mTotal;
    @SerializedName("_embedded")
    private _embedded m_embedded;
    @SerializedName("_links")
    private _links m_links;

    public Long getLimit() {
        return mLimit;
    }

    public void setLimit(Long limit) {
        mLimit = limit;
    }

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public Long getPages() {
        return mPages;
    }

    public void setPages(Long pages) {
        mPages = pages;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

    public _embedded get_embedded() {
        return m_embedded;
    }

    public void set_embedded(_embedded _embedded) {
        m_embedded = _embedded;
    }

    public _links get_links() {
        return m_links;
    }

    public void set_links(_links _links) {
        m_links = _links;
    }

}
