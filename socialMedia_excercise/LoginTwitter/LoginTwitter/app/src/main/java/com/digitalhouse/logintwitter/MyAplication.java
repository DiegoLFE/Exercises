package com.digitalhouse.logintwitter;

import android.app.Application;

import com.twitter.sdk.android.core.Twitter;

/**
 * Created by digitalhouse on 28/06/17.
 */

public class MyAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Twitter.initialize(this);
    }
}
