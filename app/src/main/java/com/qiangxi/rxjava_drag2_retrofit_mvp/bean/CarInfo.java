package com.qiangxi.rxjava_drag2_retrofit_mvp.bean;

/**
 * 作者 任强强 on 2017/4/14 15:01.
 */

public class CarInfo {
    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
