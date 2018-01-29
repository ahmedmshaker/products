package com.assignment.businessboomertask.productdetails.presenter;

import com.assignment.businessboomertask.base.BaseView;

/**
 * Created by ashaker on 1/29/2018.
 */

public interface ProductDetailsPresenter<VIEW extends BaseView> {

    void onResume();
    void onDestroy();
    void setView(VIEW view);
}
