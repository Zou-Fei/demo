package com.example.demo.controller;


import com.example.demo.service.sayGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @Autowired
    private sayGreetingService sayGreetingService;

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String getHello(){
        return "Hello world!";
    }

    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public String getGreeting(String name){
        // return "Hello , "+ name;
        return sayGreetingService.sayGreeting(name);
    }

    @RequestMapping(value="/getError",method = RequestMethod.GET)
    public String getError(){
        return sayGreetingService.getError();
    }

}
