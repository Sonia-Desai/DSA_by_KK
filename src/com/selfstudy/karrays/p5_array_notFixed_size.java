package com.selfstudy.karrays;

public class p5_array_notFixed_size {
    public static void main(String[] args) {
        int [] [] nums = {
                {1,2,3,4},
                {5},
                {4,6,7}
        };

        for(int rows = 0 ; rows<=nums.length -1 ; rows++){
            for(int cols = 0 ; cols<nums[rows].length ; cols++){
                System.out.print(nums[rows][cols]+" ");
            }
            System.out.println();
        }
    }
}
