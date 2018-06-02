package com.mikedaguillo.giflibrary

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class AppConfig {
    static void main(String... args)
    {
        SpringApplication.run(AppConfig.class, args);
    }
}
