package com.Hemanthdemo.demoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Hello{

    @RequestMapping("/")
    public String greet(HttpServletRequest request){
        return "Caption Jack sparrow Hello !" + request.getSession().getId();
    }
    @RequestMapping("/about")
    public String bubu(){
        return " I am bubu's best friend";
    }
}