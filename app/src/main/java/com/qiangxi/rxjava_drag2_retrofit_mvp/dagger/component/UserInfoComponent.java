package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.component;

import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.DaggerDemoActivity;
import com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.module.UserInfoModule;

import dagger.Component;

/**
 * 作者 任强强 on 2017/4/13 15:29.
 */
@Component(modules = UserInfoModule.class)
public interface UserInfoComponent {
    void inject(DaggerDemoActivity activity);
}
