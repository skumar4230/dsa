package com.sourav;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //takes input from user till user does not press X or x
        int ans = 0;
        while (true) {
            //takes the operator as input
            System.out.println("Plz specify operator or close x to close the calculator");
            char op = scanner.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '%' || op == '*') {
                System.out.println("plz specify 1st number");
                int a = scanner.nextInt();
                System.out.println("plz specify 2nd number");
                int b = scanner.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '%') {
                    ans = a % b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }

            } else if (op == 'X' || op == 'x') {
                System.out.println("Thanks for using the application");
                scanner.close();
                break;
            } else {System.out.println("Invalid input");}
            System.out.println(ans);
        }



    }
}

