package com.selfstudy.karrays.questionsonarray;

class Demo2{
    public int max(int [] nums){
        int maxValue = nums[0];
       for(int i = 1 ; i < nums.length; i++){
           if(nums[i]>maxValue){
               maxValue = nums[i];
           }

       }
        return maxValue;
    }
}
public class FindMax {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        int[] arr = {10,20,100,90,12,1,54};
       int result = demo2.max(arr);
        System.out.println(result);

    }
}
