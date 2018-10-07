package com.cloudbu.common.cache.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@ConfigurationProperties(prefix="spring.redis")
public class RedisSingleCache {

    private final static Logger log = LoggerFactory.getLogger(RedisSingleCache.class);

    private String host;
    private int port;

    /**
     * 
     * @Title: getJedisPool
     * @Description: 获取jedisPool
     * @return
     */
    @Bean
    public JedisPool getJedisPool() {
        log.info("==>初始化jedis连接池");
        JedisPoolConfig config = new JedisPoolConfig();
        JedisPool pool = new JedisPool(config, host, port);
        return pool;
    }

}