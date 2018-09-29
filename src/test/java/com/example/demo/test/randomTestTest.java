package com.example.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class randomTestTest {
    @Autowired
    private randomTest randomTest;

    @Test
    public void randomTest1(){
            System.out.println(randomTest.getRandom_value());
            System.out.println(randomTest.getRandom_int());
    }


}