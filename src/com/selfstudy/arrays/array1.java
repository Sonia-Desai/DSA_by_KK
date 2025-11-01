package com.selfstudy.arrays;

class demo{
    public static void test(int [] nums){
        System.out.println(nums[0]);
        System.out.println(nums);
        for(int  i = 0 ; i<=nums.length-1 ; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for(int i = nums.length-1 ; i>=0 ; i--){
            System.out.print(nums[i]+" ");
        }

    }
}
public class array1 {
    static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        demo d1 = new demo();
        d1.test(arr);





    }
}
