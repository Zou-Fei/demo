package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.List;

@Data
@Component
public class SFKEntity {
    private List<String> bot;
    private List<String> faq;

}
