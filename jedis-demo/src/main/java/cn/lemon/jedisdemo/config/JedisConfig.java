package cn.lemon.jedisdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 此配置类存在的原因是：pom.xml文件中没有引入starter，所以需要配置相应
 * 没有引入starter的原因是springboot2.0默认使用luttuce，想要使用jedis需要手动配置，
 * 还有一种使用jedis的方法，pom文件中引入starter，使用exclude
 */
@Configuration
@Slf4j
public class JedisConfig {

    @Value("${spring.redis.host}")
    private String host;
//
//    @Value("${spring.redis.jedis.pool.max-idle}")
//    private int maxIdle;
//
//    @Value("${spring.redis.jedis.pool.min-idle}")
//    private int minIdle;
//
//    @Value("${spring.redis.jedis.pool.max-active}")
//    private int maxIActive;

    @Bean
    public JedisPool jedisPool(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(maxIdle);
//        jedisPoolConfig.setMinIdle(minIdle);
//        jedisPoolConfig.setMaxTotal(maxIActive);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig,host);
        log.info("JedisPool 连接成功");
        return jedisPool;
    }
}
