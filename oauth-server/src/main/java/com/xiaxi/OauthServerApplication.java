package com.xiaxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

@SpringBootApplication
public class OauthServerApplication {

	@Bean
	public RedisTokenStore redisTokenStore() {
		RedisTokenStore tokenStore = new RedisTokenStore(redisConnectionFactory());
		return tokenStore;
	}

	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName("r-bp11cf8caa7228d4.redis.rds.aliyuncs.com");
		factory.setDatabase(27);
		factory.setPassword("AuthGate1");
		factory.setPort(6379);
		return factory;
	}


	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}

}


