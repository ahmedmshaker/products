package com.assignment.businessboomertask.productdetails.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.assignment.businessboomertask.R;
import com.assignment.businessboomertask.base.Constants;
import com.assignment.businessboomertask.base.ProductApplication;
import com.assignment.businessboomertask.productdetails.component.DaggerProductsDetailsComponent;
import com.assignment.businessboomertask.productdetails.component.ProductsDetailsComponent;
import com.assignment.businessboomertask.productdetails.modules.DetailsModule;
import com.assignment.businessboomertask.products.view.ProductsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    ProductsDetailsComponent detailsComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        initDagger();

        String code = getIntent().getStringExtra(Constants.CODE);
        String authToken = getIntent().getStringExtra(Constants.AUTH_TOKEN);


        Bundle bundle = new Bundle();
        bundle.putString(Constants.CODE, code);
        bundle.putString(Constants.AUTH_TOKEN, authToken);

        ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
        productDetailsFragment.setArguments(bundle);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, productDetailsFragment)
                .commit();
    }

    private void initDagger() {
        detailsComponent = DaggerProductsDetailsComponent.builder().applicationComponent(((ProductApplication) getApplicationContext()).getApplicationComponent())
                .detailsModule(new DetailsModule(this))
                .build();
    }

    public ProductsDetailsComponent getDetailsComponent(){
        return detailsComponent;
    }

}
