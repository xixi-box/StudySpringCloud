package com.ws.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/24 14:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class providepayment8004 {
    public static void main(String[] args) {
        SpringApplication.run(providepayment8004.class, args);
    }
}
