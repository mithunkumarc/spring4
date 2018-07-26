package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example")
public class AppConfig {
   @Bean
   public Employee getEmployee() {
      return new Manager("Infotech");
   }
}
