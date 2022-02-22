package com.chuangjin.yunyisdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.chuangjin.HHDoctorV.HHDoctorSDK;
import com.chuangjin.HHDoctorV.WebViewShopXActivity;
import com.chuangjin.yunyisdk.R;

import org.jetbrains.annotations.Nullable;

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
            }
        });
        findViewById(R.id.hospital).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                HHDoctorSDK.openHospital(LauncherActivity.this);
                //机构号、包名
                //根据接口响应值跳转
                //WebViewShopXActivity.forwardWebAllURL(LauncherActivity.this, url);
                String phone="17864213635";
                String url="https://his.drant.net/hospital-member/?phone="+phone+"&key=11&type=myyy";
                Intent intent = new Intent(LauncherActivity.this, WebViewShopXActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });
    }

}
