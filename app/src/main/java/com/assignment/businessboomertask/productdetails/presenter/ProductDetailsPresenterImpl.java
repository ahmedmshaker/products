package com.assignment.businessboomertask.productdetails.presenter;

import com.assignment.businessboomertask.home.model.ApiService;
import com.assignment.businessboomertask.productdetails.model.ProductModelDetail;
import com.assignment.businessboomertask.productdetails.view.DetailsActivity;
import com.assignment.businessboomertask.productdetails.view.ProductDetailsView;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ashaker on 1/29/2018.
 */

public class ProductDetailsPresenterImpl implements ProductDetailsPresenter<ProductDetailsView>, Observer<ProductModelDetail> {

    private ProductDetailsView productDetailsView;
    ApiService apiService;
    DetailsActivity detailsActivity;


    @Inject
    public ProductDetailsPresenterImpl(DetailsActivity detailsActivity, ApiService apiService) {

        this.detailsActivity = detailsActivity;
        this.apiService = apiService;
    }

    @Override
    public void onResume() {
        loadProductDetails();
    }

    private void loadProductDetails() {

        productDetailsView.showLoadingDialog();
        Observable<ProductModelDetail> productModelDetailObservable = apiService.getSingleProduct(productDetailsView.getCode(),"Bearer "+ productDetailsView.getAccessToken());
        productModelDetailObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this);

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void setView(ProductDetailsView view) {
        this.productDetailsView = view;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(ProductModelDetail value) {
        productDetailsView.showDetails(value);
        productDetailsView.dismissLoadingDialog();
    }

    @Override
    public void onError(Throwable e) {
        productDetailsView.showErrMsg(e.getMessage());
        productDetailsView.dismissLoadingDialog();
    }

    @Override
    public void onComplete() {

    }
}
