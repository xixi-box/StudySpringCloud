package com.ws.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("***********进入 MyLogGateWayFilter:  " + new Date());

        // 获取请求参数中的username
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");

        // 如果username为空，则设置响应状态为406（Not Acceptable），并设置响应完成
        if (uname == null) {
            log.info("*******用户名为空，非法用户，o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        // 继续过滤交换机请求
        return chain.filter(exchange);
    }


    @Override
    public int getOrder() {
        return 0;
    }
}
