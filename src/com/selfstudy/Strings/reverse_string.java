package com.selfstudy.Strings;

public class reverse_string {
   public static void main(String[] args) {
       String str1 = "abc";
       String reverse = " ";
       char ch ;

       for(int i = 0 ; i < str1.length() ; i++){
           ch = str1.charAt(i);
           reverse = ch + reverse;
       }
       System.out.println(reverse);


    }
}
