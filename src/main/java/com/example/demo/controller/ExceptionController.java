package com.example.demo.controller;

import com.example.demo.util.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionController {

    @RequestMapping(value="/json",method = RequestMethod.GET)
    public String getMyException() throws MyException{
        throw new MyException("这里出错了");
    }
}
