package com.assignment.businessboomertask.productdetails.view;

import com.assignment.businessboomertask.base.BaseView;
import com.assignment.businessboomertask.productdetails.model.ProductModelDetail;

/**
 * Created by ashaker on 1/29/2018.
 */

public interface ProductDetailsView extends BaseView {
    String getCode();
    String getAccessToken();

    void showDetails(ProductModelDetail productModelDetail);
}
