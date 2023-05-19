package com.sourav;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        float number = scanner.nextFloat();
        //typecast(narrowing from bigger to smaller datatype))
//        int number = (int) scanner.nextFloat();
//        System.out.println(number);

        //automatic type promotion in expression
        int a = 259;
        byte b = (byte) a;
        //byte can only store value upto 256 so here it will print remainder i.e 259-256=3
        System.out.println(b);

    }
}
