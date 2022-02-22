# HHDoctorVideo

蚂蚁云医-互联网医院SDK

测试中

1、SDK初始化方法（Application中）：
    HHDoctorSDK.initSDK(Application application);

2、进入互联网医院：
    HHDoctorSDK.openHospital(Activity activity);
    
AndroidManifest参数配置：

1、application标签下增加：

    <meta-data
        android:name="HHDoctorPartId"
        android:value="填写获取到的机构号"/>
    <meta-data
        android:name="HHDoctorPartCode"
        android:value="填写获取到的机构密钥"/>