package com.sourav;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int count = 0;
//        while(n>0){
//            int rem = n%10;
//            //occurence for 5
//            if (rem == 5) {
//                count++;
//            }
//            n =n/10;
//        }
//
//        System.out.println(count);
//if we want occurence of any other number then ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number");
        long n = scanner.nextLong();
        System.out.println("Provide the number for which you want to check the occurence");
        int p = scanner.nextInt();
        int count = 0;
        while(n>0){
            int rem = (int) (n%10);
            //occurence for 5
            if (rem == p) {
                count++;
            }
            n =n/10;
        }

        System.out.println(count);
        //
    }
}
