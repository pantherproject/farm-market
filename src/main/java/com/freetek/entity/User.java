package com.freetek.entity;

import java.io.Serializable;

/**
 * user
 * Created by panther.dongdong on 2016/4/20.
 */
public class User implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
