package com.springboot.wsh.controller;

import com.springboot.wsh.entity.UserEntity;
import com.springboot.wsh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: UserController
 * @ProjectName springboot_rabbit_mq
 * @Description: 用户Controller
 * @Author WeiShiHuai
 * @Date 2018/9/20 14:28
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/sendMessage/oneToOne")
    public void sendMessage() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(20);
        userEntity.setName("zhangsan");
        userService.saveUser(userEntity);
    }

    @RequestMapping("/sendMessage/oneToMany")
    public void sendMessageOneToMany() {
        //循环十次，消费者发送十条消息到RabbitMQ
        for (int i = 1; i <= 10; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setAge(20);
            userEntity.setName("zhangsan".concat(String.valueOf(i)));
            userService.saveUser(userEntity);
        }
    }

    @RequestMapping("/sendMessage/manyToMany")
    public void sendMessageManyToMany() {
        for (int i = 1; i <= 8; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setAge(20);
            userEntity.setName("zhangsan".concat(String.valueOf(i)));
            userService.saveUser(userEntity);
        }
    }

}
