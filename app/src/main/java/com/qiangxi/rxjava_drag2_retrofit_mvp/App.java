package com.qiangxi.rxjava_drag2_retrofit_mvp;

import android.app.Application;

import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.DaggerUserInfoComponent;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.DaggerUserInfoComponent2;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.UserInfoComponent;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component.UserInfoComponent2;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module.UserInfoModule;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module.UserInfoModule2;

/**
 * 作者 任强强 on 2017/4/17 12:27.
 */

public class App extends Application {
    private static UserInfoComponent sUserInfoComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        UserInfoComponent2 userInfoComponent2 = DaggerUserInfoComponent2.builder()
                .userInfoModule2(new UserInfoModule2())
                .build();
        sUserInfoComponent = DaggerUserInfoComponent.builder()
                .userInfoComponent2(userInfoComponent2)
                .userInfoModule(new UserInfoModule())
                .build();
    }

    public static UserInfoComponent getUserInfoComponent() {
        return sUserInfoComponent;
    }
}
