package com.example.demo.test;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com.demo")
public class FooProperties {
    private String foo;

}
