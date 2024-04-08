package org.example.collection_framework.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");
        System.out.println(fruitCollection);

        fruitCollection.remove("banana");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("apple"));

        fruitCollection.forEach((element) -> {
            System.out.println(element);
        });

//        fruitCollection.clear();

        System.out.println(fruitCollection);
        System.out.println("Now using Iterator");
        Iterator<String> iterator = fruitCollection.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
//            fruitCollection.add("guava"); // will give error
            System.out.println(element);
        }
    }

}
