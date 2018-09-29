package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {
    @RequestMapping(value = "/greeting2",method= RequestMethod.GET)
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/greeting");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }

    @RequestMapping(value="/greeting3",method= RequestMethod.GET)
    public String getHost(ModelMap modelMap){
        modelMap.addAttribute("host","zoufei");
        return "host";
    }





}
