package com.selfstudy.karrays.questionsonarray;

public class Linear_search {
    public static int search(int a , int [] nums){
        int result = 0;
        for(int i = 0 ; i<=nums.length-1 ; i++){
            if(a==nums[i]){
                result = i;
                break;
            }

        }
        return result;
    }
   public  static void main(String[] args) {
       int arr[] = {10,2,40,17,80,90};
       int result1 = search(12,arr);
       System.out.println(result1);

    }
}
