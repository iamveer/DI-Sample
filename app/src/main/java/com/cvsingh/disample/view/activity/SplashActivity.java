package com.cvsingh.disample.view.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.cvsingh.disample.BaseActivity;
import com.cvsingh.disample.R;
import com.cvsingh.disample.databinding.ActivitySplashBinding;
import com.cvsingh.disample.model.request.NotificationRequest;

import dagger.android.AndroidInjection;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class SplashActivity extends BaseActivity {

    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);

        //showSnackBar("Welcome Bro");
        callGetNotificationListAPI();
    }

    private void callGetNotificationListAPI() {
        NotificationRequest request = new NotificationRequest();
        request.setNoOfRecords("10");
        request.setOffset("0");
        request.setUserId("7");
        apiService.getNotificationList(request)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listCommonResponse -> {
                    if (listCommonResponse.getStatus() == 1001) {
                        showSnackBar(listCommonResponse.getStatusMessage());
                        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                        finish();
                        //System.out.print(listCommonResponse.getNotificationList());
                    } else showSnackBar(listCommonResponse.getStatusMessage());
                }, e -> {
                    showSnackBar(e.getMessage());
                });
    }

    @Override
    public View getRootView() {
        return binding.getRoot();
    }


}
