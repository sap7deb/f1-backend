package com.f1.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.f1.api.entity"})
@EnableJpaRepositories(basePackages = {"com.f1.api.repository"})
public class F1BackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(F1BackendApplication.class, args);
    }
}
