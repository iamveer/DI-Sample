package com.cvsingh.disample.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by audax on 02-02-2018.
 */

public class Util {

    private Context context;

    public Util(Context context) {
        this.context = context;
    }

    public void logger(String message) {
        Log.e(context.getClass().getName(), message);
    }

    public void toaster(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public void showSnackBar(View view, String message) {
        Snackbar snackbar = Snackbar
                .make(view, message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    public boolean isNetworkConnected() {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }

}
