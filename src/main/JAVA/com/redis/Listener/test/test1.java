package com.redis.Listener.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class test1 {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RedisTemplate redisTemplate=(RedisTemplate) ac.getBean("redisTemplate");
        String channel ="chat";
        redisTemplate.convertAndSend(channel,"I am LAZY!");
    }


}
