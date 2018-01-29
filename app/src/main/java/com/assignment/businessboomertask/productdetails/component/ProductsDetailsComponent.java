package com.assignment.businessboomertask.productdetails.component;

import com.assignment.businessboomertask.base.component.ApplicationComponent;
import com.assignment.businessboomertask.productdetails.DetailsScope;
import com.assignment.businessboomertask.productdetails.modules.DetailsModule;
import com.assignment.businessboomertask.productdetails.view.ProductDetailsFragment;

import dagger.Component;

/**
 * Created by ashaker on 1/29/2018.
 */
@DetailsScope
@Component(modules = {DetailsModule.class} , dependencies = {ApplicationComponent.class})
public interface ProductsDetailsComponent {

    void inject(ProductDetailsFragment productDetailsFragment);

}
