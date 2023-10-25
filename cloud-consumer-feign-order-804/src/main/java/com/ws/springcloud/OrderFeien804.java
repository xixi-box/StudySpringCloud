package com.ws.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/25 16:24
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeien804 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeien804.class, args);
    }
}
