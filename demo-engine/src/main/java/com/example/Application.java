package com.example;

import com.example.best.BestClass;
import com.example.test.TestClass;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        System.out.println(new TestClass().speak());
        System.out.println(new BestClass().speak());
//        Micronaut.run(Application.class, args);
    }
}