package com.cvsingh.disample.view.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cvsingh.disample.BaseActivity;
import com.cvsingh.disample.R;
import com.cvsingh.disample.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        initializeUI();
    }

    private void initializeUI() {
        binding.btLogin.setOnClickListener(this);
    }

    @Override
    public View getRootView() {
        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLogin:
                Intent i = new Intent(LoginActivity.this, DashboradActivity.class);
                //i.putExtra(EXTRA_SAMPLE, sample);
                //i.putExtra(EXTRA_TYPE, TYPE_XML);
                transitionTo(i);
                //startActivity(i);
                break;
        }
    }
}
