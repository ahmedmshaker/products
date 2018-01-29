package com.assignment.businessboomertask.home.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.assignment.businessboomertask.R;
import com.assignment.businessboomertask.base.ProductApplication;
import com.assignment.businessboomertask.home.components.DaggerHomeComponent;
import com.assignment.businessboomertask.home.components.HomeComponent;
import com.assignment.businessboomertask.home.modules.HomeModule;
import com.assignment.businessboomertask.notifications.view.NotificationFragment;
import com.assignment.businessboomertask.products.view.ProductsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    HomeComponent homeComponent;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    private int[] tabIcons = {
      R.drawable.ic_stat_ac_unit,
        R.drawable.ic_stat_notifications,
//            R.drawable.ic_tab_contacts
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initDagger();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupViewPager(viewpager);
        setupTabIcons();


    }
    private void initDagger(){
     homeComponent = DaggerHomeComponent.builder().applicationComponent(((ProductApplication)getApplicationContext()).getApplicationComponent())
             .homeModule(new HomeModule(this))
             .build();
     homeComponent.inject(this);
    }

    public HomeComponent getHomeComponent(){
        return homeComponent;
    }




    private void setupTabIcons() {
        tabs.setupWithViewPager(viewpager);
        tabs.getTabAt(0).setIcon(tabIcons[0]);
        tabs.getTabAt(1).setIcon(tabIcons[1]);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new ProductsFragment());
        adapter.addFrag(new NotificationFragment());
        viewPager.setAdapter(adapter);
    }


}
