package com.assignment.businessboomertask.productdetails.view;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.assignment.businessboomertask.R;
import com.assignment.businessboomertask.base.Constants;
import com.assignment.businessboomertask.productdetails.model.ProductModelDetail;
import com.assignment.businessboomertask.productdetails.presenter.ProductDetailsPresenterImpl;

import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ProductDetailsFragment extends Fragment implements ProductDetailsView {


    @Inject
    ProductDetailsPresenterImpl productDetailsPresenter;


    @BindView(R.id.view_pager)
    ViewPager viewPager;

    @BindView(R.id.product_name)
    TextView productName;

    @BindView(R.id.product_rating)
    RatingBar ratingBar;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    private String code = "";
    private String authToken = "";
    int currentPage = 0;


    public ProductDetailsFragment() {
        // Required empty public constructor
    }


    public static ProductDetailsFragment newInstance(String param1, String param2) {
        ProductDetailsFragment fragment = new ProductDetailsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((DetailsActivity)getActivity()).getDetailsComponent().inject(this);
        if (getArguments() != null) {
            code = getArguments().getString(Constants.CODE);
            authToken = getArguments().getString(Constants.AUTH_TOKEN);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_details, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        productDetailsPresenter.setView(this);
        productDetailsPresenter.onResume();
    }


    private void gotoNext(final int size){
        final Handler handler = new Handler();

        final Runnable update = new Runnable() {
            public void run() {
                if (currentPage == size - 1) {
                    currentPage = 0;
                }
                currentPage++;
                viewPager.setCurrentItem(currentPage, true);
            }
        };


        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                handler.post(update);
            }
        }, 100, 500);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        productDetailsPresenter.onDestroy();
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showLoadingDialog() {
        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void dismissLoadingDialog() {
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void showErrMsg(String msg) {

    }

    @Override
    public void showNoInternetMsg() {

    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getAccessToken() {
        return authToken;
    }

    @Override
    public void showDetails(ProductModelDetail productModelDetail) {
        ratingBar.setRating(productModelDetail.getAverageRating());
        productName.setText(productModelDetail.getName());
        ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(getActivity(), productModelDetail.getImages());
        viewPager.setAdapter(imagePagerAdapter);
        gotoNext(productModelDetail.getImages().size());
    }
}
