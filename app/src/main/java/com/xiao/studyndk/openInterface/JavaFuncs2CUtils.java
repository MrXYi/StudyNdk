package com.xiao.studyndk.openInterface;

import com.xiao.studyndk.BuildConfig;

/**
 * java端开放给C++使用的方法
 */
public class JavaFuncs2CUtils {

    public static String getApplicationID(){
        return BuildConfig.APPLICATION_ID;
    }

}
