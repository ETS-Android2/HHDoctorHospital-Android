# HHDoctorHospital

## 蚂蚁云医-互联网医院SDK

### 方法调用

1、SDK初始化方法（Application中）：

    HHDoctorSDK.initSDK(Application application);

2、进入互联网医院：

    HHDoctorSDK.openHospital(Activity activity,String phone);
    
    （phone：加密后的手机号）
   
   
### 参数配置

（一）、AndroidManifest的application标签下增加：

    <meta-data
        android:name="partid"
        android:value="填写获取到的机构号"/>
    <meta-data
        android:name="partcode"
        android:value="填写获取到的机构代码加密"/>
        
        
（二）、根层build.gradle下添加：

    maven {
        url 'https://maven.aliyun.com/repository/public'
    }
    maven {
      credentials {
          username '开发人员用户名'
          password '开发人员密码'
     }
        url 'https://packages.aliyun.com/maven/repository/2190323-release-1mIn35/'
    }
    maven {
     credentials {
           username '开发人员用户名'
           password '开发人员密码'
    }
        url 'https://packages.aliyun.com/maven/repository/2190323-snapshot-cGH0Qq/'
    }
 
 （三）、子build.gradle下添加：
 
    implementation 'com.chuangjin:HHDoctorSDK:1.2.0'
    
  （四）、Android-Demo：
  
    https://www.pgyer.com/27iv