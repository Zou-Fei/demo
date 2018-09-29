package com.example.demo.controller;


import com.example.demo.entity.User2;
import com.example.demo.service.sayGreetingService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

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

    @RequestMapping(value = "/user2",consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public User2 getUser2(@RequestBody User2 user2){
        user2.setName("com.demo."+user2.getName());
        user2.setAge(user2.getAge()+100);
        return user2;
    }

}
