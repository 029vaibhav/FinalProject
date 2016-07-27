package com.udacity.gradle.builditbigger.util;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by vaibhav on 2/7/16.
 */
public class Utility {

    public static Utility utility;
    ProgressDialog progressDialog;

    public static Utility getInstance() {
        if (utility == null) {
            utility = new Utility();
        }
        return utility;
    }

    public void showDialog(Context context) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(context);
        }
        progressDialog.show();
    }

    public void hideDialog() {

        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

}
