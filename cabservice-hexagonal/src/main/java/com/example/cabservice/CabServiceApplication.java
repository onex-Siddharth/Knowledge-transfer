package com.example.cabservice;

import com.example.cabservice.domain.port.out.CabRepositoryPort;
import com.example.cabservice.domain.service.CabService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CabServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CabServiceApplication.class, args);
    }

    @Bean
    public CabService cabService(CabRepositoryPort cabRepositoryPort) {
        return new CabService(cabRepositoryPort);
    }
}
