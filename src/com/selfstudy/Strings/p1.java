package com.selfstudy.Strings;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {


        String s1 = new String("soni");
        String s2 = new String("soni ");

        System.out.println(s1 == s2  );
        System.out.println(s1.equals(s2));
        System.out.println(s1.charAt(0));

        System.out.println(Arrays.toString ( new int[]{10,20,30,40,50,60,70,80,90,100}));
        String a = null;
        System.out.println(a);
        System.out.println(a.equals(a));

    }
}
