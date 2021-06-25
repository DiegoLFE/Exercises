package com.digitalhouse.facebook;

import android.app.Application;

import com.facebook.appevents.AppEventsLogger;

/**
 * Created by digitalhouse on 28/06/17.
 */

public class MyAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppEventsLogger.activateApp(this);
    }
}
