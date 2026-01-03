package com.selfstudy.binarysearch;

public class p1_binarysearch {
    public static void main(String[] args) {
        int arr [] = {-11,-5,-2,0,1,22,24,36,48,59,66,89,99,100};
        int target = 8;
        int ans = search(arr,target);
        System.out.println(ans);


    }

    public static  int  search(int[] nums, int target){

        int start = 0 ;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] > target){
                end = mid -1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;

    }
}
