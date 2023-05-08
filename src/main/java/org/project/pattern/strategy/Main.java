package org.project.pattern.strategy;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        lambdaWay();
        oldWay();
    }

    private static void lambdaWay() {
        System.out.println("Using lambda");
        Context addStrategy = new Context((a, b) -> a + b);
        Context multiplyStrategy = new Context((a, b) -> a * b);
        Context subtractsStrategy = new Context((a, b) -> a - b);
        Context divideStrategy = new Context((a, b) -> a / b);

        System.out.println(addStrategy.perform(10, 5));
        System.out.println(multiplyStrategy.perform(10, 5));
        System.out.println(subtractsStrategy.perform(10, 5));
        System.out.println(divideStrategy.perform(10, 5));
    }

    private static void oldWay() {
        System.out.println("Using implementation");

        Context addStrategy = new Context(new AddStrategy());
        Context multiplyStrategy = new Context(new MultiplyStrategy());
        Context subtractsStrategy = new Context(new SubstractStrategy());
        Context divideStrategy = new Context(new DivideStrategy());

        System.out.println(addStrategy.perform(10, 5));
        System.out.println(multiplyStrategy.perform(10, 5));
        System.out.println(subtractsStrategy.perform(10, 5));
        System.out.println(divideStrategy.perform(10, 5));
    }
}
