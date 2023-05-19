package com.sourav;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Welcome to temp converter");
        int a =10;

        do{Scanner scanner = new Scanner(System.in);
        System.out.print("write the value of temp in celsius to convert into fahrenheit:");
        float temp = scanner.nextFloat();
        int fahrenheit = (int) ((temp * 9/5)+32);
        System.out.println("Temperature in Fahrenheit is "+fahrenheit+"°F ");}
        while (a<=10);
    }
}
