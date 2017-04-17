package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component;

import com.qiangxi.rxjava_drag2_retrofit_mvp.MainActivity;
import com.qiangxi.rxjava_drag2_retrofit_mvp.bean.CarInfo;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module.UserInfoModule2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 作者 任强强 on 2017/4/14 13:14.
 */
@Singleton
@Component(modules = UserInfoModule2.class)
public interface UserInfoComponent2 {
    void inject(MainActivity activity);

    CarInfo getCarInfo();
}
