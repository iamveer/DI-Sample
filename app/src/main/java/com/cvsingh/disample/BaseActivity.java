package com.cvsingh.disample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cvsingh.disample.api.ApiService;
import com.cvsingh.disample.utils.TransitionHelper;
import com.cvsingh.disample.utils.Util;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by audax on 02-02-2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    public Util util;

    @Inject
    public ApiService apiService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    public abstract View getRootView();

    public void logger(String message) {
        util.logger(message);
    }

    public void toaster(String message) {
        util.toaster(message);
    }

    public void showSnackBar(String message) {
        util.showSnackBar(getRootView(), message);
    }

    public boolean isNetworkConnected() {
        return util.isNetworkConnected();
    }

    public void transitionTo(Intent i) {
        final Pair<View, String>[] pairs = TransitionHelper.createSafeTransitionParticipants(this, true);
        ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pairs);
        startActivity(i, transitionActivityOptions.toBundle());
    }
}
