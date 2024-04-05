package com.company;

import java.util.Scanner;

public class CWH_07_Ch1_Ps {
    public static void main(String[] args) {
        //Question 1
        Scanner sc = new Scanner(System.in);
       /* int a = 45;
        int b = 56;
        int c = 85;
        int result = a+ b + c;
        System.out.println(result);
        //Question 2
        float cgpa = (float) ((((float)result/300)*100)/9.5f);
        System.out.println("marks in CGPA: " + cgpa);
        //question 3
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        //question 4
        System.out.println("Pleae provide data in kilometre");
        float km = sc.nextFloat();
        float miles = km*0.62137119f;
        System.out.println("The converted result to miles is " + miles);*/
        System.out.println("checking whether number provided is an integer or not");
        boolean num = sc.hasNextInt();
        System.out.println(num);
    }
}
