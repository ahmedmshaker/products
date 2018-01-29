package com.assignment.businessboomertask.base.modules;

import android.content.Context;

import com.assignment.businessboomertask.base.ApplicationScope;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by shika on 25-Jan-18.
 */

@Module(includes = {ContextModule.class , NetworkModule.class})
public class PicassoModule {

    @Provides
    @ApplicationScope
    public Picasso picasso(Context context, OkHttp3Downloader okHttp3Downloader) {
        return new Picasso.Builder(context)
                .downloader(okHttp3Downloader)
                .build();
    }

    @Provides
    @ApplicationScope
    public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient) {
        return new OkHttp3Downloader(okHttpClient);
    }
}