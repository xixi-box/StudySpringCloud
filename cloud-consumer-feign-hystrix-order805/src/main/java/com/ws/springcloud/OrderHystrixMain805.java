package com.ws.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther zzyy
 * @create 2020-02-20 11:55
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain805
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderHystrixMain805.class,args);
    }
}
