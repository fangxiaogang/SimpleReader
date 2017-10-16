package com.xiaogang.simplereader;

import android.app.Application;

/**
 * Created by Administrator on 2017/10/16 0016.
 */

public class MyApplication extends Application {

    private static MyApplication myApplication;

    public static MyApplication getInstance() {
        return myApplication;
    }

    @SuppressWarnings("unused")
    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;

    }




}
