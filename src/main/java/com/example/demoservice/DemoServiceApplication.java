package com.example.demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * Запуск Spring Boot приложения
 */

@SpringBootApplication
public class DemoServiceApplication {

    // Инжектим список
    public DemoServiceApplication(List<TestInterface> testInterfaceList) {
        testInterfaceList.forEach(TestInterface::test);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }
}