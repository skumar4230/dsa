package org.example.defaultmethod;

public interface GreetExt extends Greeting {
    default void greet() {
        System.out.println("Hello from B");
    }
}
