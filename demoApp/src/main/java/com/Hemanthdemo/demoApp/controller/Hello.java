package com.Hemanthdemo.demoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello{

    @RequestMapping("/")
    public String greet(){
        return "Caption Jack sparrow Hello !";
    }
    @RequestMapping("/about")
    public String bubu(){
        return " I am bubu's best friend";
    }
}