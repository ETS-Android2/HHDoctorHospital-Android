package com.chuangjin.yunyisdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.chuangjin.HHDoctorV.HHDoctorSDK;
import com.chuangjin.HHDoctorV.WebViewShopXActivity;
import com.chuangjin.yunyisdk.R;

import mlxy.utils.T;

/**
 * Created by cxf on 2018/9/17.
 */

public class LauncherActivity extends Activity {
    EditText phonenum;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        phonenum = findViewById(R.id.phonenum);
        findViewById(R.id.hospital).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    HHDoctorSDK.openHospital(LauncherActivity.this, phonenum.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}