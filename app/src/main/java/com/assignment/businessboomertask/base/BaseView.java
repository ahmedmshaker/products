package com.assignment.businessboomertask.base;

/**
 * Created by shika on 28-Jan-18.
 */

public interface BaseView {

    void showMessage(String message);
    void showLoadingDialog();
    void dismissLoadingDialog();
    void showErrMsg(String msg);
    void showNoInternetMsg();
}
