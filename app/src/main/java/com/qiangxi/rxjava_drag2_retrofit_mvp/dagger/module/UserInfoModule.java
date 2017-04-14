package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module;

import com.qiangxi.rxjava_drag2_retrofit_mvp.bean.UserInfo;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.annotation.QualifierUserInfoA;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.annotation.QualifierUserInfoB;

import dagger.Module;
import dagger.Provides;

/**
 * 作者 任强强 on 2017/4/13 15:23.
 */
@Module
public class UserInfoModule {

    @QualifierUserInfoA
    @Provides
    UserInfo provideUserInfoA() {
        return new UserInfo();
    }

    @QualifierUserInfoB
    @Provides
    UserInfo provideUserInfoB() {
        return new UserInfo("李四");
    }

}
