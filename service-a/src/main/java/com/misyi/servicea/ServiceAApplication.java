package com.misyi.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Service A ζε‘
 *
 * @author licong
 * @date 2022-02-26 δΈε11:20
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
}
