package com.cvsingh.disample.di;

import android.app.Application;
import android.content.Context;

import com.cvsingh.disample.api.ApiService;
import com.cvsingh.disample.utils.Constants;
import com.cvsingh.disample.utils.Util;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by audax on 01-02-2018.
 */

@Module
public class AppModule {

    @Provides
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    Util provideUtil(Context context) {
        return new Util(context);
    }

    @Provides
    Cache provideHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    @Provides
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        return gsonBuilder.create();
    }

    @Provides
    OkHttpClient provideOkHttpClient(Cache cache) {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.cache(cache);
        client.connectTimeout(30, TimeUnit.SECONDS);
        client.readTimeout(30, TimeUnit.SECONDS);
        client.addInterceptor(loggingInterceptor);
        return client.build();
    }

    @Provides
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @Provides
    ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
