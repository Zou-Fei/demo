package com.example.demo.controller;


import com.example.demo.entity.SFKEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceFirstKnowTestController {

    @Autowired
    private SFKEntity sfkEntity;

    @PostMapping(value="/SFKTest")
    public SFKEntity SFKTest(String appId,String nonce,String checkSum,String userId,String fromPage,String content){

        List<String> bot =new ArrayList<>();
        List<String> faq = new ArrayList<>();

        bot.add("查物流");
        faq.add("热门问题1");
        sfkEntity.setBot(bot);
        sfkEntity.setFaq(faq);
        return sfkEntity;
    }

}
