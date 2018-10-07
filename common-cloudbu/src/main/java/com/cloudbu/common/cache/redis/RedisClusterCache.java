package com.cloudbu.common.cache.redis;

import java.util.Set;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import com.cloudbu.common.cache.Cache;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class RedisClusterCache extends JedisCluster implements Cache {
    public RedisClusterCache(Set<HostAndPort> jedisClusterNode, int timeout, int maxAttempts, GenericObjectPoolConfig poolConfig) {
        super(jedisClusterNode, timeout, maxAttempts, poolConfig);
    }
}
