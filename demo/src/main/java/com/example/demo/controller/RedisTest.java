package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTest {
    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/RedisTest")
    private String incr() {
        Long hh = redisTemplate.opsForValue().increment("haha");
        return "增加后的值:" + hh;
    }


}
