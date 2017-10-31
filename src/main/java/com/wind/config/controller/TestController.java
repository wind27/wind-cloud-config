package com.wind.config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author qianchun 17/10/27
 **/
@RestController
public class TestController {

    public TestController() {
        System.out.println("--------------------------------");
    }

    @RequestMapping(value = "/user/provider")
    public String home() {
        return "Hello World!";
    }
}
