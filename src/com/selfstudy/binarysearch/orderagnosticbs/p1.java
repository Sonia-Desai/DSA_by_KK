package com.selfstudy.binarysearch.orderagnosticbs;

public class p1 {
    public static void main(String[] args) {
        int arr [] = {100,90,80,70,60,50,40,30,20,10};
        int target = 20;
        int ans = search(arr,target);
        System.out.println(ans);


    }

    public static int search(int[] arr , int target){

        int start = 0 ;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target){
                    end = mid -1 ;
                }
                else{
                    start = mid  + 1;
                }
            }
            else{
                if(arr[mid] < target){
                    end = mid -1 ;
                }
                else{
                    start = mid  + 1;
                }
            }
        }

        return -1 ;
    }
}
