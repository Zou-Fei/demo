package com.example.demo.test;


import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class PostsProperties {
    private String title;
    private String content;


}
