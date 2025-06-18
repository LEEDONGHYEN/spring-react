package com.example.backend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // ← 이 어노테이션이 있는 위치를 기준으로 컴포넌트 스캔됨
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
