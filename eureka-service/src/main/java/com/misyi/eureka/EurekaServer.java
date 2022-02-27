package com.misyi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 注册中心启动类
 *
 * @author licong
 * @date 2022-02-26 下午10:15
 */
// 指定该项目是一个 SpringBoot 应用
@SpringBootApplication
// 代表该项目是一个 eureka 服务
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {
        // 启动 SpringBoot 项目
        SpringApplication.run(EurekaServer.class, args);
    }
}
