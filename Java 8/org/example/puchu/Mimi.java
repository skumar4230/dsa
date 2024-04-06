package org.example.puchu;

@FunctionalInterface
interface Add {
    void add(int a, int b);
}

public class Mimi {


    public static void main(String[] args) {
        //        Dodo d = ()-> System.out.println("playing");
        //        d.play();
        Dodo d = new Dodo() {
            public void play() {
                System.out.println("playing with annonymous inner class");
            }
        };
        d.play();
        Add add = new Add() {
            public void add(int x, int y) {
                System.out.println(x + y);
            }
        };
        add.add(45, 56);
        Add add1 = (x, y) -> System.out.println(x - y);
        add1.add(85, 44);

    }
}
