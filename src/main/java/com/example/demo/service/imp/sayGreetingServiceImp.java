package com.example.demo.service.imp;

import com.example.demo.service.sayGreetingService;
import org.springframework.stereotype.Service;

@Service("sayGreetingService")
public class sayGreetingServiceImp implements sayGreetingService {

    @Override
    public String sayGreeting(String name) {
        return "Hello , "+name+" !";
    }

    @Override
    public String getError() {
        return "Sorry,I am late！";
    }
}
