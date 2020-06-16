package com.geng.pojo;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String  toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

}
