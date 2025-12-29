package com.selfstudy.linearsearch;

public class p1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int find = 50;
        int result = SearchElement(arr, find);
        System.out.println(result);

    }

    //To find the index for the given element
//    public static int SearchElement(int [] arr,int target){
//
//         if(arr.length==0){
//             return -1;
//         }
//         for(int i = 0 ; i < arr.length ; i++){
//             if(arr[i]==target){
//                 return i;
//             }
//
//         }
//         return -1;
//
//
//    }
    public static int SearchElement(int[] arr, int find) {
        if (arr.length == 0) {
            return -1;
        }
       for(int x : arr){
           if(x==find){
               return x;
           }


        }
        return -1;

    }
}

