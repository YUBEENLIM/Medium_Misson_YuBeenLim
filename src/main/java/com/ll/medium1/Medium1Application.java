package com.ll.medium1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Medium1Application {

    public static void main(String[] args) {

        SpringApplication.run(Medium1Application.class, args);
    }

}
