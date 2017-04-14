package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.qiangxi.rxjava_drag2_retrofit_mvp.R;
import com.qiangxi.rxjava_drag2_retrofit_mvp.bean.CarInfo;
import com.qiangxi.rxjava_drag2_retrofit_mvp.bean.UserInfo;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.annotation.QualifierUserInfoA;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.annotation.QualifierUserInfoB;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.DaggerUserInfoComponent;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.DaggerUserInfoComponent2;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.UserInfoComponent2;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module.UserInfoModule;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module.UserInfoModule2;

import javax.inject.Inject;

public class DaggerDemoActivity2 extends AppCompatActivity {
    @QualifierUserInfoA
    @Inject
    UserInfo mUserInfoA;

    @QualifierUserInfoB
    @Inject
    UserInfo mUserInfoB;

    @Inject
    CarInfo mCarInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_demo2);
        UserInfoComponent2 component2 = DaggerUserInfoComponent2.builder().userInfoModule2(new UserInfoModule2()).build();
        DaggerUserInfoComponent.builder()
                .userInfoComponent2(component2)
                .userInfoModule(new UserInfoModule())
                .build().inject(this);
        mUserInfoA.setName("张三");
        mUserInfoA.setSex(0);
        mUserInfoB.setSex(23);
        mCarInfo.setCarName("宝马");
        Log.e("tag", mUserInfoA.toString() + "\n" + mUserInfoB.toString() + "\n" + mCarInfo.toString());
    }
}
