package com.example.demo.test;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class randomTest {

    @Value("${com.demo.random.value}")
    private String random_value;

    @Value("${com.demo.random.int}")
    private Integer random_int;

    public String getRandom_value() {
        return random_value;
    }

    public void setRandom_value(String random_value) {
        this.random_value = random_value;
    }

    public Integer getRandom_int() {
        return random_int;
    }

    public void setRandom_int(Integer random_int) {
        this.random_int = random_int;
    }
}
