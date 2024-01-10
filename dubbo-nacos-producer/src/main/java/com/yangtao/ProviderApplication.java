package com.yangtao;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: kante_yang
 * @Date: 2024/1/10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo(scanBasePackages = "com.yangtao.rpc")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}