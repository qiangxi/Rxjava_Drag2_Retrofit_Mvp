package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 作者 任强强 on 2017/4/17 10:56.
 */

@Scope
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ActivitySingleton {
}
