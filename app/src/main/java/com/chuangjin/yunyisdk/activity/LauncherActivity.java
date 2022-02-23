package com.chuangjin.yunyisdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.chuangjin.HHDoctorV.HHDoctorSDK;
import com.chuangjin.HHDoctorV.WebViewShopXActivity;
import com.chuangjin.yunyisdk.R;

import org.jetbrains.annotations.Nullable;

import mlxy.utils.T;

/**
 * Created by cxf on 2018/9/17.
 */

public class LauncherActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        findViewById(R.id.watch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LauncherActivity.this,"请使用手表Demo版本SDK", Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.hospital).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HHDoctorSDK.openHospital(LauncherActivity.this,"17864213635");
            }
        });
    }

}
