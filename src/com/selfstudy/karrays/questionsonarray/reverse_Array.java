package com.selfstudy.karrays.questionsonarray;

import java.util.Arrays;
import java.util.Scanner;
class ReverseArray {
   public void reverse(int[] arr1) {
       int[] array1 = new int[arr1.length];
       printArray(arr1);
       int j = 0;
       for (int i = arr1.length - 1; i >= 0; i--) {
           array1[j] = arr1[i];
           j++;
       }
       printArray(array1);
   }
   public void printArray(int[] arr1) {
       for (int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i] + " ");
       }
       System.out.println();
   }
}
public class reverse_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] nums = new int[6];

        for(int i = 0 ; i<nums.length ; i++){
            System.out.println("Enter "+i+" element :");
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        ReverseArray obj=new ReverseArray();
        obj.reverse(nums);


    }
}
