package com.spring_boot_profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringBootProfileApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootProfileApplication.class, args);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);
    }

    @Profile("dev")
    @Bean
    public String devBean() {
        return "dev";
    }

//    @Profile("qa")
//    @Bean
//    public String qaBean() {
//        return "qa";
//    }

    @Profile("prod")
    @Bean
    public String prodBean() {
        return "prod";
    }
}
