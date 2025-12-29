package com.selfstudy.linearsearch;
//Search in String
public class p2 {
   public  static void main(String[] args) {
       String str = "Soniya";
       char find = 'y';
       System.out.println(search(str,find));


    }

    public static boolean search(String str , int target){

       if(str.length()==0){
           return false;
       }
        for(int i = 0 ; i<str.length() ; i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
