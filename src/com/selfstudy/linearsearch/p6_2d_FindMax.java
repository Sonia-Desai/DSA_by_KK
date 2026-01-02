package com.selfstudy.linearsearch;

//import java.util.Arrays;

public class p6_2d_FindMax {
    public static void main(String[] args) {
        int [][] arr = {
                {
                        10,20,30,40
                },{
                50,60,70,80
        },{12,24,36,48},{
                23,24,25,26,97
        }
        };

      int ans = findSearch(arr);
        System.out.println(ans);




    }

    public static int  findSearch(int[][] arr ) {
          //  int result = arr[0][0];
            int max = Integer.MIN_VALUE;
        for(int i = 1; i< arr.length ; i++){
            for(int j = 1 ; j<arr[i].length ; j++){
              if(arr[i][j]> max){
                  max = arr[i][j];

              }


            }
        }

        return max;




    }
}
