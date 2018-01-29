package com.assignment.businessboomertask.home.modules;


import android.support.v4.app.FragmentManager;

import com.assignment.businessboomertask.home.HomeScope;
import com.assignment.businessboomertask.home.model.ApiService;
import com.assignment.businessboomertask.home.view.MainActivity;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by shika on 25-Jan-18.
 */

@Module
public class HomeModule {
    MainActivity mainActivity;
    public HomeModule(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }



    @HomeScope
    @Provides
    public MainActivity getMainActivity(){
        return mainActivity;
    }
    @HomeScope
    @Provides
    public ApiService getService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }

    @HomeScope
    @Provides
    public FragmentManager getSupportFragmentManager(MainActivity mainActivity){
        return mainActivity.getSupportFragmentManager();
    }


}
