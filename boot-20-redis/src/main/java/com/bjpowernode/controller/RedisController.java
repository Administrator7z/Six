package com.bjpowernode.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    /**
     * 1. 泛型，可以String,String, 或者Object，Object， 或者不写。
     * 2. 对象的名称是 redisTemplate ， 最好不要改。
     * 3. redis常用数据类型 string ，hash ,list, set ,zset
     *    RedisTemplate 内部对redis的不同数据类型，有不同的处理类。
     *    操作string类型的数据， 从RedisTemplate中获取String类型的操作对象
     *    通过这个对象，才能处理string类型的数据。
     *
     */
    @Resource
    private RedisTemplate redisTemplate;


    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 操作redis中string类型的数据
     * set
     * get
     */

    @PostMapping("/redis/{k}/{v}")
    public String putKey(@PathVariable("k") String name, @PathVariable("v") String value){
        //添加string数据到redis

        // 设置key的序列化
        redisTemplate.setKeySerializer( new StringRedisSerializer());
        // 设置value的序列化
        redisTemplate.setValueSerializer( new StringRedisSerializer());

        //获取操作String类型的对象
        ValueOperations strvo = redisTemplate.opsForValue();

        //添加key-value
        strvo.set(name, value);

        return "创建的redis， key="+name+",value="+value;

    }

    //读取key的值
    @GetMapping("/redis/{k}")
    public String queryK(@PathVariable String k){
        // 设置key的序列化
        redisTemplate.setKeySerializer( new StringRedisSerializer());
        // 设置value的序列化
        redisTemplate.setValueSerializer( new StringRedisSerializer());

        ValueOperations strvo = redisTemplate.opsForValue();
        Object v  = strvo.get(k);
        return "获取redis， key="+k+",value="+v;
    }


    @PostMapping("/str/{k}/{v}")
    public String setString(@PathVariable String k, @PathVariable String v){
        stringRedisTemplate.opsForValue().set(k,v);
        return "使用StringRedisTemplate对象";
    }
}
