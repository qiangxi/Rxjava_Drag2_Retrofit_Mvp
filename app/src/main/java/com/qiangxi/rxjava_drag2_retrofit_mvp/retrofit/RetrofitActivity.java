package com.qiangxi.rxjava_drag2_retrofit_mvp.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qiangxi.rxjava_drag2_retrofit_mvp.R;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        initRetrofit();
    }

    private void initRetrofit() {

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)//连接超时时间
                .readTimeout(10, TimeUnit.SECONDS)//读取超时时间
                .cookieJar(new CookieJarImpl(this))//cookie配置
                .retryOnConnectionFailure(false)//请求失败是否重试
                .addInterceptor(new CookieInterceptor())//自定义拦截器,统一配置cookie.和cookieJar(new CookieJarImpl(this))作用相同
                .build();

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("www.baidu.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }
}
