package com.misyi.eurekaclusterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 集群
 *
 * @author licong
 * @date 2022-02-27 10:47 下午
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterServer.class, args);
    }
}
