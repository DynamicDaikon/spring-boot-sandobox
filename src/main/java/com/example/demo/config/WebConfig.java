package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // すべてのパスに対して
            .allowedOrigins("http://localhost:5173") // フロントエンドのオリジンを許可
            .allowedMethods("GET", "POST", "PUT", "DELETE") // 許可するHTTPメソッド
            .allowedHeaders("*") // 許可するヘッダー
            .allowCredentials(true); // Cookieを含むリクエストを許可する場合
      }
    };
  }
}
