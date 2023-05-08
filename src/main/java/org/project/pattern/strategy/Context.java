package org.project.pattern.strategy;

public class Context {

    private final IStrategy strategy;


    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }


    int perform(Integer a, Integer b) {
      return  this.strategy.execute(a, b);
    }
}
