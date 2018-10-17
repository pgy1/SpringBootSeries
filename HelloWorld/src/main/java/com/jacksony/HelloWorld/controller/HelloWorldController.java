package com.jacksony.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pengguangyu on 2018/10/17 0017.
 */
@RestController
public class HelloWorldController {
    @GetMapping(value = "/hello")
    public String index(){
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
