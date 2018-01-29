package com.assignment.businessboomertask.products.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.assignment.businessboomertask.R;
import com.assignment.businessboomertask.home.view.MainActivity;
import com.assignment.businessboomertask.products.model.Item;
import com.assignment.businessboomertask.products.presenter.ProductsPresenterImpl;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductsFragment extends Fragment implements ProductsView {


    @Inject
    ProductsPresenterImpl productsPresenter;

    @Inject
    ProductsRecyclerAdapter adapter;


    @BindView(R.id.recycleView)
    RecyclerView recyclerView;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;


    public ProductsFragment() {
    }


    public static ProductsFragment newInstance() {
        ProductsFragment fragment = new ProductsFragment();

        return fragment;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MainActivity)getActivity()).getHomeComponent().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_products, container, false);
        ButterKnife.bind(this, view);

        initRecyclerView();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        productsPresenter.setView(this);

        productsPresenter.onResume();
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
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
    public void loadProducts(List<Item> items) {
        adapter.setProductsItems(items);
    }

    @Override
    public void loadAuthToken(String token) {
        adapter.setAuthToken(token);
    }
}
