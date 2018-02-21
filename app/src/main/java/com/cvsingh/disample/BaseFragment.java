package com.cvsingh.disample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cvsingh.disample.api.ApiService;
import com.cvsingh.disample.utils.Util;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by audax on 02-02-2018.
 */

public class BaseFragment extends Fragment {

    @Inject
    Util util;

    @Inject
    ApiService apiService;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void logger(String message) {
        util.logger(message);
    }

    public void toaster(String message) {
        util.toaster(message);
    }

    public boolean isNetworkConnected() {
        return util.isNetworkConnected();
    }
}
