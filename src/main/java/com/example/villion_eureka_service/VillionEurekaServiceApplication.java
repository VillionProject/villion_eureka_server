package com.example.villion_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 이 어노테이션으로 유레카 서버의 역할로서 서버로 역할을 해서 스프링 부트에 의해 기동
public class VillionEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VillionEurekaServiceApplication.class, args);
    }

}
