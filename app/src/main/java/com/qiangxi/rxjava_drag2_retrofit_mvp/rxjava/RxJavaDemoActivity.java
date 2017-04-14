package com.qiangxi.rxjava_drag2_retrofit_mvp.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.qiangxi.rxjava_drag2_retrofit_mvp.R;
import com.qiangxi.rxjava_drag2_retrofit_mvp.bean.UserInfo;
import com.orhanobut.logger.Logger;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class RxJavaDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java_demo);
    }

    private void test1() {
        //被观察对象
        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                e.onNext("qiangxi");
                e.onComplete();
            }
        });
        //观察者
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Logger.e("onSubscribe:" +d.toString());
            }

            @Override
            public void onNext(String value) {
                Logger.e("onNext:" + value);
            }

            @Override
            public void onError(Throwable e) {
                Logger.e("onError:" + e.toString());
            }

            @Override
            public void onComplete() {
                Logger.e("onComplete");
            }
        };
        //被观察对象订阅观察者
        observable.subscribe(observer);
    }

    public void Test1(View view) {
        test1();
    }

    private void Test2(){
        Observable<UserInfo> beanObservable = Observable.create(new ObservableOnSubscribe<UserInfo>() {
            @Override
            public void subscribe(ObservableEmitter<UserInfo> e) throws Exception {
            }
        });
        beanObservable.observeOn(Schedulers.io());
    }
}
