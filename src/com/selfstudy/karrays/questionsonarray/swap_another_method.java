package com.selfstudy.karrays.questionsonarray;

class demo1{

    public void printArray(int[] nums1){
        for(int i = 0 ; i <= nums1.length - 1 ; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

    }
    public void test(int [] nums ,int  a , int b ){
        printArray(nums);
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        printArray(nums);

    }

}
public class swap_another_method {
    public static void main(String[] args) {
        demo1 demo = new demo1();

        int [] arr = {10 , 20 , 30 , 40 , 50};
        demo.test(arr,1, 3);

    }
}
