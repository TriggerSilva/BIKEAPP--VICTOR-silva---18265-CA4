package com.icanstudioz.taxicustomer.custom;

import android.support.multidex.MultiDexApplication;

import com.crashlytics.android.Crashlytics;
import com.icanstudioz.taxicustomer.R;
import com.icanstudioz.taxicustomer.session.SessionManager;
import com.mapbox.mapboxsdk.Mapbox;
import io.fabric.sdk.android.Fabric;


/**
 * VICTOR SILVA - 18265
 *
 * CA4 - DORSET COLLEGE
 *
 * ANDROID APPLICATION
 *
 */

public class MyApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        Mapbox.getInstance(getApplicationContext(), getString(R.string.mapboxkey));
        SessionManager.initialize(getApplicationContext());

    }


}
