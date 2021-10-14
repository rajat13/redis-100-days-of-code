package com.rajat13.redisclusterspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.rajat13.redisclusterspringboot")
public class RedisClusterSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisClusterSpringbootApplication.class, args);
	}

}
