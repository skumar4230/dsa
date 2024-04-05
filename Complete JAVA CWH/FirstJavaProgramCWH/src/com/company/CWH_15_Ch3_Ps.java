package com.company;

public class CWH_15_Ch3_Ps {
    public static void main(String[] args) {
        //problem 1
        String s  = "Sourav Kumar";
        System.out.println(s.toLowerCase());
        //problem 2
        String s2 = "S O U R A V";
        System.out.println(s2.replace(" ", "_"));
        //problem 3
        String s3 = "Dear <|name> , Thanks a lot!";
        System.out.println(s3);
        System.out.println(s3.replace("<|name>","Surbhi"));
        //problem 4
        String s4 = "this string conains  double and   triple spaces";
        System.out.println(s4.indexOf("  "));
        System.out.println(s4.indexOf("   "));
        //probelem 5
        String s5 = "Dear Sourav,\n This Java course is nice. \n\tThanks";
        System.out.println(s5);
    }
}
