package com.example.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  // Spring에게 설정 클래스임을 알림
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")                  // CORS 허용할 경로 (예: /api/hello)
                        .allowedOrigins("http://localhost:3000") // 허용할 프론트엔드 주소
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드
                        .allowedHeaders("*")                     // 허용할 헤더
                        .allowCredentials(true);                 // 쿠키 전송 허용 여부
            }
        };
    }
}