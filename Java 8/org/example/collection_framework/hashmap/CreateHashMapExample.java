package org.example.collection_framework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
    public static void main(String[] args) {
        //Map can't contain duplicates
        Map<String,Integer> numbers = new HashMap<>();
        System.out.println("is empty: "+numbers.isEmpty() );
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);//value get updated if we try to give duplicate
        numbers.put("six", 7);
        System.out.println("printing map:"+ numbers);
        System.out.println("printing size: "+numbers.size());
        System.out.println("getting all the keys");
        numbers.keySet().forEach(System.out::println);
        System.out.println("all the keys: "+ numbers.keySet());
        System.out.println("all array size of keys: "+ numbers.keySet().size());

        System.out.println("is empty: "+numbers.isEmpty() );
        System.out.println("check for key present or not: "+numbers.containsKey("Three"));
        System.out.println("check for key present or not: "+numbers.containsKey("three"));
        System.out.println("check for value present or not: "+numbers.containsValue(4));

        System.out.println("getting all values: "+numbers.values());
        System.out.println("getting array size all values: "+numbers.values().size());

        System.out.println("getting value using key: " +numbers.get("one"));
        System.out.println("getting key using key: " +numbers.entrySet());
    }
}
