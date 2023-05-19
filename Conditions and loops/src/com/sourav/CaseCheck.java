package com.sourav;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        for(int i = 0; i <line.length(); i++) {
            char c = line.trim().charAt(i);
            if(c>'a'&&c<='z')
                System.out.println(c+ " is in lower case");
            else if(c>'A'&&c<'Z') System.out.println(c+ " is in upper case");

        }

    }
}
