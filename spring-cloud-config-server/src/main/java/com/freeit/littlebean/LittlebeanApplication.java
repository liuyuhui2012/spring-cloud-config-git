package com.freeit.littlebean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LittlebeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LittlebeanApplication.class, args);
    }

}
