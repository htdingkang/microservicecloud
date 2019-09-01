package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer        //开启服务注册功能
public class EurekaService7003_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7003_App.class,args);
    }

}
