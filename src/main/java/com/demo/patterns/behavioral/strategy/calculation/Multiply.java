package com.demo.patterns.behavioral.strategy.calculation;

public class Multiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println(String.format("Multiply: %d - %d", a, b));
        return a * b;
    }
}
