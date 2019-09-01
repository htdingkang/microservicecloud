package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  //springcloud Ribbon 是基于Netflix Ribbon实现的一套客户端负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
