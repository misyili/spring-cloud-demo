package com.misyi.serviceb.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author licong
 * @date 2022-02-26 下午11:39
 */
@RestController
@Configuration
public class ServiceBController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("greeting/{name}")
    public String sayHello(@PathVariable String name) {
        RestTemplate restTemplate = getRestTemplate();
        return restTemplate.getForObject("http://ServiceA/say-hello/" + name, String.class);
    }

}
