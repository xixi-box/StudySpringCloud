package com.ws.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/24 15:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8006 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8006.class, args);
    }
}
