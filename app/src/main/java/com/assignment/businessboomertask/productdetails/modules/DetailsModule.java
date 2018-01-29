package com.assignment.businessboomertask.productdetails.modules;

import com.assignment.businessboomertask.home.model.ApiService;
import com.assignment.businessboomertask.productdetails.DetailsScope;
import com.assignment.businessboomertask.productdetails.view.DetailsActivity;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by ashaker on 1/29/2018.
 */

@Module
public class DetailsModule {

     DetailsActivity detailsActivity;

     public DetailsModule(DetailsActivity detailsActivity){
         this.detailsActivity = detailsActivity;
     }


     @Provides
     @DetailsScope
     ApiService getService(Retrofit retrofit){
         return retrofit.create(ApiService.class);
     }

     @Provides
     public DetailsActivity getDetailsActivity(){
         return detailsActivity;
     }
}
