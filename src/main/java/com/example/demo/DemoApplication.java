package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// adnotacja spring boot
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // uruchamiam aplikacje
        SpringApplication.run(DemoApplication.class, args);
    }
}
