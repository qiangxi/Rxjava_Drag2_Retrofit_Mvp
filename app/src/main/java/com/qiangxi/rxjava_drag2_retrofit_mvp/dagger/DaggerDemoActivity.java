package com.qiangxi.rxjava_drag2_retrofit_mvp.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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

public class DaggerDemoActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_dagger_demo);
        UserInfoComponent2 component2 = DaggerUserInfoComponent2.builder().userInfoModule2(new UserInfoModule2()).build();
        DaggerUserInfoComponent.builder()
                .userInfoComponent2(component2)
                .userInfoModule(new UserInfoModule())
                .build().inject(this);
        mUserInfoA.setName("张三");
        mUserInfoA.setSex(0);
        mUserInfoB.setSex(23);
        mCarInfo.setCarName("兰博基尼");
        Log.e("tag", mUserInfoA.toString() + "\n" + mUserInfoB.toString() + "\n" + mCarInfo.toString());

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaggerDemoActivity.this, DaggerDemoActivity2.class);
                startActivity(intent);
            }
        });
    }
}
