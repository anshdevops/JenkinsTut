package com.jenkins.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFormApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringFormApp.class, args);
        System.out.println("Project Initialized");
    }


}
