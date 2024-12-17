package com.example.annotation;

public class Person {
    @ValidateRange(min = 0, max = 100)
    private int age;

    public Person(int age) {
        this.age = age;
    }
}
