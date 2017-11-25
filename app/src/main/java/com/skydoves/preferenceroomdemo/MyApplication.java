package com.skydoves.preferenceroomdemo;

import android.app.Application;

import com.skydoves.preferenceroomdemo.components.PreferenceComponent_PrefsComponent;

/**
 * Developed by skydoves on 2017-11-24.
 * Copyright (c) 2017 skydoves rights reserved.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceComponent_PrefsComponent.init(this);
    }
}