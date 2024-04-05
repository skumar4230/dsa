package com.company;

import java.util.Scanner;

public class CWH_12_Ch2_Ps {
    public static void main(String[] args) {
        //question 1
        float a = 7 / 4f* 9 / 2f;
        System.out.println(a);
        //question 2
        char grade ='B';
        grade = (char) (grade + 8);
        System.out.println(grade);
        //Decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);
        int c = (int) Math.pow(2,3);
        System.out.println(c);
        double d = 5^2;
        System.out.println(d);
        System.out.println("X²");//used alt 0178 for 2
        System.out.println("x\u00b2");//used unicode numbers
        System.out.println("b\u2078");//used unicode numbers for degree 8
        System.out.println("H\u20820");
        System.out.println("D\u20820");
        //Question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("plese provide ur number");
        int num= sc.nextInt();
        System.out.println(num>8);
        //que 4





    }
}
