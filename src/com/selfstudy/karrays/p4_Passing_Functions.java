package com.selfstudy.karrays;

import java.util.Arrays;

public class p4_Passing_Functions {
    public static void change(int[] arr){
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;



    }
    public static void main(String[] args) {
        int [] nums = {10,20,30,40,50};
        System.out.println(Arrays.toString(nums));
            change(nums);
        System.out.println(Arrays.toString(nums));
    }
}
