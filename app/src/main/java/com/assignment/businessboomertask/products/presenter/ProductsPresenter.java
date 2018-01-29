package com.assignment.businessboomertask.products.presenter;

import com.assignment.businessboomertask.base.BaseView;

/**
 * Created by shika on 28-Jan-18.
 */

public interface ProductsPresenter<BASEVIEW extends BaseView> {

    void onResume();
    void onDestroy();
    void setView(BASEVIEW baseview);

}
