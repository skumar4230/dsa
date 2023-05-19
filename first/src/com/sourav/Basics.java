package com.sourav;

import java.sql.SQLOutput;

public class Basics {
    public static void main(String[] args) {
        if(true){
            System.out.println("Hello World");
        }
        else {System.out.println("Nope");}

        int a = 10;
        if (a==10){
            System.out.println("The no. provided by you is "+ a);
        }
        else {
            System.out.println("nope");
    }
//        no. of iterations is not known
//        int count = 0;
//        while(count<=5){
//
//            System.out.println(count);
//            count++;
//        }

        //if no. iterations is known
//        for(initialisation;condition;increment/derement){logic to print}
        for(int count = 0; count<=9; count++){
            System.out.println(count);
        }
}}
