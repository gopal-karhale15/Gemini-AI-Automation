package com.example.geminiautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GeminiAutomationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeminiAutomationApplication.class, args);
    }
}