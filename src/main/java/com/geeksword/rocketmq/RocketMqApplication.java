package com.geeksword.rocketmq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RocketMqApplication {

    public static void main(String[] args){
        new SpringApplication(RocketMqApplication.class).run(args);
    }
}
