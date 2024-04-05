package com.company;

public class CWH_14_Ch3_StringMethods {
    public static void main(String[] args) {
        //Strings are immutable hence new string will be returned after storing it
        String a = "Sourav";
        String b = "Sourav";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));//checks value
        System.out.println(a == b);//checks memory

        int value = a.length();//provides length of a
        System.out.println(value);
        System.out.println(a.indexOf("a"));//index count starts from 0
        String a1 = a.toLowerCase();//converts string to lower case
        a.toLowerCase();//will not change anything unless we store it in any other variable
        System.out.println(a);
        System.out.println(a1);
        String a2 = a.toUpperCase();//converts string to upper case
        System.out.println(a2);
        String s = "    Sod   dcur  av  ";
        String a3 = s.trim();//Removes leading and trailing whitespaces from this string.
        System.out.println(a3);
        //index always starts with 0
        System.out.println(a.substring(1));//begin with
        System.out.println(a.substring(1,4));//exclusive end
        System.out.println(a.replace('S','G'));
        System.out.println(a.replace("Sou","Gau"));
        System.out.println(a.startsWith("S"));
        System.out.println(a.endsWith("v"));
        System.out.println(a.charAt(0));
        System.out.println(a.indexOf("av"));
        String g = "Pranav";
        System.out.println(g.indexOf("a",3));
        System.out.println(g.indexOf("a"));
        System.out.println(g.lastIndexOf("a"));
        System.out.println(g.indexOf("acdvsdfd"));//will return -1 if no match found
        System.out.println(g.equals("Pranav"));
        System.out.println(g.equalsIgnoreCase("pranav"));
        System.out.println("this is escape sequence \" double quote,\n next line,\t tab  ");


    }
}
