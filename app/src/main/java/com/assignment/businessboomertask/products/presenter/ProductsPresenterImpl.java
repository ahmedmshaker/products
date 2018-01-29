package com.assignment.businessboomertask.products.presenter;

import android.util.Log;

import com.assignment.businessboomertask.base.Constants;
import com.assignment.businessboomertask.home.model.ApiService;
import com.assignment.businessboomertask.home.view.MainActivity;
import com.assignment.businessboomertask.products.model.AuthToken;
import com.assignment.businessboomertask.products.model.Products;
import com.assignment.businessboomertask.products.view.ProductsView;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by shika on 28-Jan-18.
 */

public class ProductsPresenterImpl implements ProductsPresenter<ProductsView>, Observer<AuthToken> {

    private ProductsView productsView;
    ApiService apiService;


    @Inject
    public ProductsPresenterImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void onResume() {
        loadAuthToken();
    }

    @Override
    public void onDestroy() {

    }

    private void loadAuthToken() {

        productsView.showLoadingDialog();

        Map<String, String> data = new HashMap<>();
        data.put(Constants.CLIENT_ID_KEY, Constants.CLIENT_ID_VALUE);
        data.put(Constants.CLIENT_SECRET_KEY, Constants.CLIENT_SECRET_VALUE);
        data.put(Constants.GRANT_TYPE_KEY, Constants.GRANT_TYPE_VALUE);
        data.put(Constants.USERNAME_KEY, Constants.USERNAME_VALUE);
        data.put(Constants.PASSWORD_KEY, Constants.PASSWORD_VALUE);

        Observable<AuthToken> productsObservable = apiService.getToken(Constants.CLIENT_ID_VALUE ,Constants.CLIENT_SECRET_VALUE , Constants.GRANT_TYPE_VALUE ,Constants.USERNAME_VALUE , Constants.PASSWORD_VALUE  );
        productsObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this);
    }

    private void loadProductsFromWebService(String authToken, int page, int limit) {
        Observable<Products> productsObservable = apiService.getProducts(authToken, page, limit);
        productsObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Products>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Products value) {

                        productsView.loadProducts(value.get_embedded().getItems());
                        productsView.dismissLoadingDialog();

                    }

                    @Override
                    public void onError(Throwable e) {
                        productsView.showErrMsg(e.getMessage());
                        productsView.dismissLoadingDialog();

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void setView(ProductsView productsView) {
        this.productsView = productsView;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(AuthToken value) {
        productsView.loadAuthToken(value.getAccessToken());
        loadProductsFromWebService("Bearer "+value.getAccessToken(), 1, 20);
    }

    @Override
    public void onError(Throwable e) {
        Log.d("error" , e.getMessage() );
    }

    @Override
    public void onComplete() {

    }
}
