package com.assignment.businessboomertask.base.modules;

/**
 * Created by shika on 25-Jan-18.
 */

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }


    @Provides
    public Context context() {
        return context;
    }
}
