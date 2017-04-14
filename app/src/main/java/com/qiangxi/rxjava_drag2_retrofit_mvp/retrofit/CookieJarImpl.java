package com.qiangxi.rxjava_drag2_retrofit_mvp.retrofit;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * 作者 qiang_xi on 2016/11/26 11:44.
 */

public class CookieJarImpl implements CookieJar {
    private SharedPreferences mCookieSp;

    public CookieJarImpl(Context context) {
        mCookieSp = context.getSharedPreferences("cookieInfo", Context.MODE_PRIVATE);
    }

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {

        mCookieSp.edit().putString("cookie", parseCookieInfo(cookies)).apply();
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        return null;
    }

    /**
     * 解析cookie信息
     *
     * @return 格式良好的能被服务器接受的cookie信息
     */
    private String parseCookieInfo(List<Cookie> cookies) {
        StringBuilder sb = new StringBuilder();
        if (null != cookies && cookies.size() > 0) {
            for (int i = 0; i < cookies.size(); i++) {
                if (i != cookies.size() - 1) {
                    sb.append(cookies.get(i).toString()).append(";");
                } else {
                    sb.append(cookies.get(i).toString());
                }
            }
        }
        return sb.toString();
    }
}
