package com.selfstudy.karrays;

import java.util.Arrays;
import java.util.Scanner;

//Array of Strings
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str [] = new String[5];
        System.out.println("Enter The String");
       for (int i = 0; i < str.length; i++) {
           str[i] = sc.next();

    }
        System.out.println(str); //gives hexadecimal representation of the object
        System.out.println(Arrays.toString(str));  //give the value present in String array 
    }
}
