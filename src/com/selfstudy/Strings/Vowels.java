package com.selfstudy.Strings;

public class Vowels {

    public static void main(String[] args) {


    }
    public static boolean isVowel(char ch) {
        boolean result = false;
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            result = true;
        }
        return result;
    }
    public static String vowels(String str){
        String result = "";
        int pos = 0;
       for(int index = 0 ; index < str.length() ; index++){
           if(isVowel(str.charAt(index))){

           }
       }
       return result;
    }
}
