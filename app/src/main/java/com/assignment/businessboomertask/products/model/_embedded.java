
package com.assignment.businessboomertask.products.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class _embedded {

    @SerializedName("items")
    private List<Item> mItems;

    public List<Item> getItems() {
        return mItems;
    }

    public void setItems(List<Item> items) {
        mItems = items;
    }

}
