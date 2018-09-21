package com.springboot.wsh.entity;

import java.io.Serializable;

/**
 * @Title: UserEntity
 * @ProjectName springboot_rabbit_mq
 * @Description: 用户实体类
 * @Author WeiShiHuai
 * @Date 2018/9/20 14:22
 */
public class UserEntity implements Serializable {

    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
