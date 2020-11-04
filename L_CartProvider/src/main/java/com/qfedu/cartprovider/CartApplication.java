package com.qfedu.cartprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * projectName: last
 *
 * @author: 武圣杰
 * time: 2020/11/4 21:48
 * description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.qfedu.cartprovider.dao")
public class CartApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class,args);
    }
}
