package com.selfstudy.linearsearch;

import java.util.Arrays;

public class p5_2d_array {
    public static void main(String[] args) {
        int [][] arr = {
                {
                        10,20,30,40
                },{
                    50,60,70,80
        },{12,24,36,48},{
                    23,24,25,26,27
        }
        };

        int target = 70;
        int [] ans = findSearch(arr,target);
       // System.out.println(findSearch(arr,target));
        System.out.println(Arrays.toString(ans));


    }

    public static int [] findSearch(int[][] arr , int target) {

        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
               if(arr[i][j]==target){
                   return new int[]{i,j};
               }


            }
        }



        return new int[]{-1,-1};
    }
}
