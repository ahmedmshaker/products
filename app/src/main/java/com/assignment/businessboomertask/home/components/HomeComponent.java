package com.assignment.businessboomertask.home.components;

import com.assignment.businessboomertask.base.component.ApplicationComponent;
import com.assignment.businessboomertask.home.HomeScope;
import com.assignment.businessboomertask.home.modules.HomeModule;
import com.assignment.businessboomertask.home.view.MainActivity;
import com.assignment.businessboomertask.products.view.ProductsFragment;

import dagger.Component;

/**
 * Created by shika on 25-Jan-18.
 */
@HomeScope
@Component(modules = HomeModule.class,dependencies = ApplicationComponent.class)
public interface HomeComponent {

    void inject(MainActivity mainActivity);
    void inject(ProductsFragment productsFragment);
}
