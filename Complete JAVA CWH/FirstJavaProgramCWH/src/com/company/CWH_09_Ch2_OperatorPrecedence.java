package com.company;

public class CWH_09_Ch2_OperatorPrecedence {
    public static void main(String[] args) {

        int a = 6 * 5 - 34 / 2;
        System.out.println(a);
/*
30-34/2
30-17= 13
 */
        int b = 60 / 5 - 34 * 2;
        /*
        12-34*2
        12-68
        -56

        */

        System.out.println(b);
        //precedence and associativity - in java it doesn't work like BODMAS of maths
        //Associativity - u can see notes on desktop cheatsheet

        //Quick Quiz
        int x = 6;
        int y =1;
        int k = x*y/2;

        System.out.println(k);
        int z = (int) Math.pow(x, 2);
        System.out.println(z);
    }
}
