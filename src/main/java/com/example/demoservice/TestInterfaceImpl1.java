package com.example.demoservice;

import org.springframework.stereotype.Service;

/**
 * Тестовая реализация 1
 */

@Service
public class TestInterfaceImpl1 implements TestInterface{

    @Override
    public void test() {
        System.out.println("TestInterfaceImpl1 test");
    }
}