package com.assignment.businessboomertask.base;

import android.app.Application;

import com.assignment.businessboomertask.base.component.ApplicationComponent;
import com.assignment.businessboomertask.base.component.DaggerApplicationComponent;
import com.assignment.businessboomertask.base.modules.ContextModule;
import com.assignment.businessboomertask.base.modules.NetworkModule;

/**
 * Created by shika on 25-Jan-18.
 */

public class ProductApplication extends Application {


    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this))
                .networkModule(new NetworkModule(Constants.BASE_URL))
                .build();

    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
