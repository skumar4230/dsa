package com.sourav;

import java.util.Scanner;

public class Reverse {
    //reverse a number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide number to reverse");
        long l = scanner.nextLong();
        long result = 0;

        while (l>0) {
            long rem = l%10;
            l/=10;

            result  =  (result*10+rem);

        }
        System.out.print(result);


    }
}
