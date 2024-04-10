package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalExample {
//flatmap and map also
    //to handle null pointer exceptions we use optional
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "John", "John@email.com", Arrays.asList(124567.0, 65656.0, 985959.0, 54549.0, 556554.0));
        Customer customer2 = new Customer(102, "Alice", "Alice@email.com", Arrays.asList(123456.0, 987654.0, 456789.0));
        Customer customer3 = new Customer(103, "Bob", null, Arrays.asList(987654.0, 123789.0, 456123.0));
        Customer customer4 = new Customer(104, "Emily", "Emily@email.com", Arrays.asList(456123.0, 789456.0, 123789.0));
        Customer customer5 = new Customer(105, "David", "David@email.com", Arrays.asList(987654.0, 789456.0, 123456.0));
        //empty
        //of
        //nullable
        //orElse
        //orElseThrow

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //        Optional<String> emailOptional = Optional.of(customer3.getEmail());//if object is not null
        //        System.out.println(emptyOptional);
        Optional<String> email = Optional.ofNullable(customer3.getEmail());
        System.out.println(email);

        Optional<String> email1 = Optional.ofNullable(customer2.getEmail());
        System.out.println(email1);
        System.out.println(email1.get());//to get the values

        //        if(email.isPresent()){
        //            System.out.println(email.get());
        //        }
        //to get a default value if there is no data
        System.out.println(email.orElse("default data "));
        //to get a customised exception
//        System.out.println(email.orElseThrow(() -> new IllegalArgumentException("No default value")));
        //map
        System.out.println(email.map(e->e.toUpperCase()).orElseGet(() -> "default value"));
        System.out.println(email1.map(e->e.toUpperCase()).orElseGet(() -> "default value"));


        List<Customer> customers = Arrays.asList(customer1, customer2, customer3,customer4,customer5);
        System.out.println(customers);
        //using flatmap
        customers.stream().flatMap(customer -> customer.getPhone().stream()).forEach(System.out::println);
        //using map
        customers.stream().map(customer -> customer.getPhone()).forEach(System.out::println);

        customers.stream().filter(customer -> customer.getEmail().contains("a")).findAny().orElse(new Customer());
    }


}
