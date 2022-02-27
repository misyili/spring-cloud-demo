package com.misyi.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author licong
 * @date 2022-02-26 下午11:39
 */
@RestController
public class ServiceAController {

    @GetMapping("say-hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

}
