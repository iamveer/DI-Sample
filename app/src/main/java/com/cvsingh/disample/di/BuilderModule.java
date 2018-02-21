package com.cvsingh.disample.di;

import com.cvsingh.disample.BaseActivity;
import com.cvsingh.disample.BaseFragment;
import com.cvsingh.disample.view.activity.LoginActivity;
import com.cvsingh.disample.view.activity.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by audax on 01-02-2018.
 */

@Module
public abstract class BuilderModule {

    @ContributesAndroidInjector
    abstract BaseActivity bindBaseActivity();

    @ContributesAndroidInjector
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector
    abstract BaseFragment bindBaseFragment();

}
