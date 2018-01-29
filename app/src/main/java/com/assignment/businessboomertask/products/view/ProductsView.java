package com.assignment.businessboomertask.products.view;

import com.assignment.businessboomertask.base.BaseView;
import com.assignment.businessboomertask.products.model.Item;

import java.util.List;

/**
 * Created by shika on 28-Jan-18.
 */

public interface ProductsView extends BaseView {

    void loadProducts(List<Item> items);
    void loadAuthToken(String token);
}
