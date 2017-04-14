package com.qiangxi.rxjava_drag2_retrofit_mvp.retrofit;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者 qiang_xi on 2016/11/26 12:04.
 * 统一配置cookie
 */

public class CookieInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = new Request.Builder();
        builder.addHeader("Cookie","cookie");
        return chain.proceed(builder.build());
    }
}
