package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module;

import com.qiangxi.rxjava_drag2_retrofit_mvp.bean.CarInfo;

import dagger.Module;
import dagger.Provides;

/**
 * 作者 任强强 on 2017/4/14 13:12.
 */
@Module
public class UserInfoModule2 {

    @Provides
    CarInfo provideCarInfo() {
        return new CarInfo();
    }
}
