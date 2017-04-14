package com.qiangxi.rxjava_drag2_retrofit_mvp.bean;

/**
 * 作者 任强强 on 2016/10/19 17:14.
 */


public class UserInfo {
    private String name;
    private int sex;

    public UserInfo() {
    }

    public UserInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
