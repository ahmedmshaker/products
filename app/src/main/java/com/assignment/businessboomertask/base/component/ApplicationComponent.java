package com.assignment.businessboomertask.base.component;

import com.assignment.businessboomertask.base.ApplicationScope;
import com.assignment.businessboomertask.base.modules.NetworkModule;
import com.assignment.businessboomertask.base.modules.PicassoModule;
import com.squareup.picasso.Picasso;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by shika on 25-Jan-18.
 */

@ApplicationScope
@Component(modules={NetworkModule.class , PicassoModule.class })
public interface ApplicationComponent {


    Retrofit retrofit();
    Picasso picasso();


}