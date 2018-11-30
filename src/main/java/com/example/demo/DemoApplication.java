package com.example.demo;

import com.example.demo.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {
    @Autowired
    private Task task;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
