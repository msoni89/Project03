package org.project.pattern.strategy;

public class DivideStrategy implements IStrategy {
    @Override
    public int execute(Integer a, Integer b) {
        return a / b;
    }
}
