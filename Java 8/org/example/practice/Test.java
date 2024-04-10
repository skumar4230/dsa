package org.example.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,56,87,62,49,49);
        System.out.println("from list of integers find first element of the list using stream function");
        list.stream().findFirst().ifPresent(System.out::println);
        System.out.println("find total number of elements");
       int result= (int) list.stream().count();
        System.out.println(result);

        System.out.println("duplicate values");

        Set<Integer> temp = new HashSet<>();

        list.stream().filter(num -> !temp.add(num)).forEach(System.out::println);
        System.out.println("max values");
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        list.stream().distinct().sorted().forEach(System.out::println);

    }
}
