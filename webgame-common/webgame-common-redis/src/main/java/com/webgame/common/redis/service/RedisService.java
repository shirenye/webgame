package com.webgame.common.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * spring redis 工具类
 * @author cdw
 * @date 2021-03-21
 */
@Component
public class RedisService {

    @Autowired
    public RedisTemplate redisTemplate;

}
