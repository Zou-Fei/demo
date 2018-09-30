package com.example.demo.service.imp;

import com.example.demo.DemoApplication;
import com.example.demo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp(){
        userService.deleteAllUsers();
    }


    @Test
    public void testJdbcTemplate() throws Exception{

        //userService.createTable();
        System.out.println(userService.getAllUsers());
        userService.create(new Long(1),"a",1);
        userService.create(new Long(2),"b",2);
        userService.create(new Long(3),"c",3);

        System.out.println(userService.getAllUsers());
    }
}