package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.qiangxi.rxjava_drag2_retrofit_mvp.R;
import com.qiangxi.rxjava_drag2_retrofit_mvp.bean.UserInfo;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.annotation.QualifierUserInfoA;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.annotation.QualifierUserInfoB;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.DaggerUserInfoComponent;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module.UserInfoModule;

import javax.inject.Inject;

public class DaggerDemoActivity extends AppCompatActivity {
    @QualifierUserInfoA
    @Inject
    UserInfo mUserInfoA;

    @QualifierUserInfoB
    @Inject
    UserInfo mUserInfoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_demo);
        DaggerUserInfoComponent.builder()
                .userInfoModule(new UserInfoModule())
                .build().inject(this);
        mUserInfoA.setName("张三");
        mUserInfoA.setSex(0);
        mUserInfoB.setSex(23);
        Log.e("tag", mUserInfoA.toString() + "\n" + mUserInfoB.toString());
    }
}
