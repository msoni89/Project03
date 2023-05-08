package org.project.pattern.strategy;

public class AddStrategy implements IStrategy {

    @Override
    public int execute(Integer a, Integer b) {
        return a + b;
    }
}
