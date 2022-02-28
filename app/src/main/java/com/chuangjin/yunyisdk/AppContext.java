package com.chuangjin.yunyisdk;

import android.app.Application;
import android.util.Log;

import com.chuangjin.HHDoctorV.HHDoctorSDK;
import com.chuangjin.yunyisdk.activity.LauncherActivity;


/**
 * Created by cxf on 2017/8/3.
 */

public class AppContext extends Application {

    public static AppContext sInstance;
    private boolean mBeautyInited;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        HHDoctorSDK.initSDK(this);

    }

}
