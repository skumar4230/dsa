package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 56, 15, 65, 25, 45, 15, 65, 3, 87, 1, 58, 78, 23, 45, 35);
        //from list of integers find first element of the list using stream function
        list.stream().findFirst().ifPresent(System.out::println);
        //find total number of elements
        System.out.println(list.stream().count());
        //find all even and odd numbers that exist in the list
        System.out.println("list of even number ");
        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
        System.out.println("list of odd numbers");
        list.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
        //no which start with 5
        System.out.println("no start with 5");
        list.stream().filter(num -> num.toString().startsWith("5")).forEach(System.out::println);
        System.out.println("duplicate values");
        Set<Integer> temp = new HashSet<>();
        list.stream().filter(num -> !temp.add(num)).forEach(System.out::println);
        System.out.println("find max values");
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("max value is " + max.get());
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("min value is " + min.get());
        System.out.println("sort in ascending order");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("sort in descending order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("check array duplicates or not");
        int[] numbers = {1, 2, 4, 5, 2, 6, 7, 1};
        if (Arrays.stream(numbers).distinct().count() != numbers.length) {
            System.out.println("contains duplicates");
        } else {
            System.out.println("contains unique values");
        }
        System.out.println("printing without duplicates");
        //from array
        Arrays.stream(numbers).distinct().forEach(System.out::println);
        System.out.println("from list ");
        list.stream().sorted().distinct().forEach(System.out::println);
        System.out.println("square of list elements and  greaater than 50");
        list.stream().map(num -> num * num).filter(num -> num > 50).forEach(System.out::println);
        System.out.println("sort an array and convert to stream");
        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println("use map to convert in upper case");
        List<String> words = Arrays.asList("Sok", "sourav", "sourav", "soker");
        words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
        System.out.println("Max in array");
        Arrays.stream(numbers).max().ifPresent(System.out::println);
        System.out.println("concatenate two streams");
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> s2 = Stream.of(5, 6, 7, 8);
        Stream.concat(s1, s2).forEach(System.out::println);
        System.out.println("print 10 random numbers");
        Random random = new Random();
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
        System.out.println("print date and Time");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("print in dd-MM-yyyy");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateFormatter.format(localDateTime));
        System.out.println("check for empty list using optional");
        //        List<String> list1 = Arrays.asList("Dev", "Dev","Development", "Developer");
        List<String> list1 = null;
        Optional<List<String>> optionalList = Optional.ofNullable(list1);
        optionalList.ifPresentOrElse(i -> i.stream().forEach(System.out::println), () -> System.out.println("the list is empty"));
        System.out.println("find no of occurrences");
        int[] values = {10, 1, 20, 30, 10, 100, 45, 40, 40};
        int number = 40;
        long rep = Arrays.stream(values).filter(value -> value == number).count();
        System.out.println(rep);
        System.out.println("find only duplicate elements with its count from arraylist");
        Map<String, Long> map = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.entrySet().stream().filter(m -> m.getValue() > 1).forEach(m -> System.out.println(m.getKey() + "=" + m.getValue()));
        System.out.println(map);
        System.out.println("sum of salary of employee");
        Employee employee = new Employee("John", 1000L);
        Employee employee1 = new Employee("Jonathan", 1560L);
        Employee employee2 = new Employee("Jonathan", 1560L);
        Employee employee3 = new Employee("Jonathan", 1560L);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        Double salary =employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(salary);
        System.out.println("count character of each string ");
        String word = "Jack and Jill School";
        Map<Character,Long> charCount = word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
        System.out.println("list of object into map by considering duplicate keys and store in sorted order ");
        Map<String,Double> uniqueEmployees= employees.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary,(existing,replacement)->existing,()->new TreeMap<>(Comparator.naturalOrder())));
        System.out.println(uniqueEmployees);
        System.out.println("find first non- repeated character in it using Stream function");


    }
}
