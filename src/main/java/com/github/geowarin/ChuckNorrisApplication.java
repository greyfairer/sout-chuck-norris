package com.github.geowarin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ChuckNorrisApplication {

    public static void main(String[] args) {

        SpringApplication.run(ChuckNorrisApplication.class, args);
    }
}
