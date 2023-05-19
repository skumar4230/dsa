package com.sourav;

import java.util.Scanner;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
//        //printing in fibonacci sequence
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
//        int numberOfTerms = scanner.nextInt();
//
//        System.out.println("Fibonacci sequence:");
//        for (int i = 0; i < numberOfTerms; i++) {
//            int fibonacciNumber = fibonacci(i);
//            System.out.print(fibonacciNumber + " ");
//        }
//    }
//
//    public static int fibonacci(int n) {
//        if (n <= 1)
//            return n;
//        else
//            return fibonacci(n - 1) + fibonacci(n - 2);
//    }

        //fibonaacci number
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);

}}
