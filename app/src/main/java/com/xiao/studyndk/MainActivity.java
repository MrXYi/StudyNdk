package com.xiao.studyndk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.xiao.studyndk.nativeInterface.JNITest;
import com.xiao.studyndk.nativeInterface.NativeListener;

public class MainActivity extends AppCompatActivity implements NativeListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNITest.registerListener(this);

        JNITest.init("初始化回调");

    }

    @Override
    public void showLog(int level, String msg) {
        Log.i(TAG, msg);
    }

}
