package com.example.demoservice;

import org.springframework.stereotype.Service;

/**
 * Тестовая реализация 2
 */

@Service
public class TestInterfaceImpl2 implements TestInterface{

    @Override
    public void test() {
        System.out.println("TestInterfaceImpl2 test");
    }
}