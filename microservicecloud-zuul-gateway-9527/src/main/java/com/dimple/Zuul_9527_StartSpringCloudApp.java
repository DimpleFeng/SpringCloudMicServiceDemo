package com.dimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @className: Zuul_9527_StartSpringCloudApp
 * @description:
 * @auther: Dimple
 * @date: 08/02/19
 * @version: 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
