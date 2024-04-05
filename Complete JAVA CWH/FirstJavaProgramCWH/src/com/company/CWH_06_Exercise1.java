package com.company;

import java.util.Scanner;

public class CWH_06_Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in different subjects");
        System.out.println("Maths");
        float s1 = sc.nextFloat();
        System.out.println("English");
        float s2 = sc.nextFloat();
        System.out.println("Hindi");
        float s3 = sc.nextFloat();
        System.out.println("Science");
        float s4 = sc.nextFloat();
        System.out.println("S.St");
        float s5 = sc.nextFloat();
        float result =((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("Result: " + result+'%');
    }
}
