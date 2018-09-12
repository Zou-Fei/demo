package com.example.demo.controller;


import com.example.demo.service.sayGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @Autowired
    private sayGreetingService sayGreetingService;


    @RequestMapping("/greeting")
    public String getGreeting(String name){
       // return "Hello , "+ name;
        return sayGreetingService.sayGreeting(name);
    }

    @RequestMapping("/getError")
    public String getError(){
        return sayGreetingService.getError();
    }

}
