package com.example.best;

import com.example.test.TestClass;

public class BestClass {

    public String speak() {
        return new TestClass().speak() + " and Hello from Library B";
    }

}
