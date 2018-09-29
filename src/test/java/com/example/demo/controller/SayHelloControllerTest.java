package com.example.demo.controller;

import com.example.demo.service.sayGreetingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SayHelloControllerTest {

    @Autowired
    public SayHelloController sayHelloController;
    @Autowired
    public sayGreetingService sayGreetingService;

    private MockMvc mvc;
    private MockMvc mvc2;

    @Before
    public void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new SayHelloController()).build();
        // = MockMvcBuilders.standaloneSetup(new sayGreetingService()).build();
    }

    @Test
    public void getGreeting() throws Exception{
//        System.out.println(sayHelloController.getGreeting("zoufei"));
//        System.out.println(sayGreetingService.sayGreeting("zoufei"));
//        mvc.perform(MockMvcRequestBuilders.get("/greeting?name=zoufei").accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();

        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello world!")));




//        System.out.println(sayHelloController.getGreeting("abc"));
//        System.out.println(sayHelloController.getHello());


    }

    @Test
    public void getGreeting2() throws Exception{
        //mvc2.perform()
        System.out.println(sayGreetingService.sayGreeting("zoufei"));
        System.out.println(sayHelloController.getGreeting("zoufei2"));
    }
}