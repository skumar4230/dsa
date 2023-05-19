package com.sourav;

import java.util.Scanner;

public class Largest_Smallest {
    public static void main(String[] args) {
        //Q: Print numbers from 1 - 100;
//        for (int i = 1; i <= 100; i++){
//            System.out.println("Iterating through loops for "+ i+"th time");
//        }
        //Q: find largest of three numbers
//        int max = a;
//        int a = 45;
//        int b = 100;
//        int c = 53;
//        if ((a > b)&& a>c){
//            System.out.println(" a is greatest number");
//        }
//        else  if ((c> b)&& c>a){
//            System.out.println(" c is greatest number");
//        }else  if ((b>c)&& b>a){
//            System.out.println(" b is greatest number");
//        }
        //2nd approach
//       do{ Scanner scanner = new Scanner(System.in);
//           System.out.println("give three numbers separated with space to find greatest number");
//           int a = scanner.nextInt();
//           int b = scanner.nextInt();
//           int c = scanner.nextInt();
//           int max = a;
//           if(c>max){
//               max = c;
//
//           }
//           if (b>max){
//               max=b;
//           }
//           System.out.println("The greatest number is "+max);}
//       while(true);

//        3rd approach
        Scanner scanner = new Scanner(System.in);
                   System.out.println("give three numbers separated with space to find greatest number");
                   int a = scanner.nextInt();
                   int b = scanner.nextInt();
                   int c = scanner.nextInt();
                   int max =Math.max(c,Math.max(a, b)) ;
                   int min =Math.min(c,Math.min(a, b)) ;
        System.out.println("The greatest number is "+max);
        System.out.println("The smallest number is "+min);
    }
}
