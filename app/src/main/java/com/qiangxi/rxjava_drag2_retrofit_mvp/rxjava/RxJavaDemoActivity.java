package com.qiangxi.rxjava_drag2_retrofit_mvp.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.qiangxi.rxjava_drag2_retrofit_mvp.R;


public class RxJavaDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java_demo);
    }

    public void Test1(View view) {
       RxJavaTest01.test02();
    }
}
