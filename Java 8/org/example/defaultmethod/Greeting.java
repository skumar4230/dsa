package org.example.defaultmethod;

public interface Greeting {
    default void greet(){
        System.out.println("Hello from A");
    }
}
