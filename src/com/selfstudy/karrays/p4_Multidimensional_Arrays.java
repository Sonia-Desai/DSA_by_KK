package com.selfstudy.karrays;

import java.util.Arrays;
import java.util.Scanner;

public class p4_Multidimensional_Arrays {
   public  static void main(String[] args)
   {
     //  int [] [] arr = new int [3] [] ;  //array declaration
      // int [] [] arr2d = {
//               {1,2,3},
//               {4,5,6},
//               {7,8,9}
//       };

  //     System.out.println(Arrays.toString(arr2d));  //[[I@27716f4, [I@8efb846, [I@2a84aee7]]
       //here address of each array is returned and its different
       Scanner sc = new Scanner(System.in);
       int [] [] nums = new int [3] [3];

       for(int row = 0 ; row<3 ; row++){ //To take imputs
           for(int col = 0 ; col<nums[row].length ; col++){
               System.out.println("Enter the number of elements in "+row +" row and "+col+"  col respectively ");
               nums[row][col]=sc.nextInt();

           }

       }

       //To take outputs normal for loop

       for(int row = 0 ; row<3 ; row++){
           for(int col = 0 ; col<nums[row].length ; col++){
               System.out.print(nums[row][col]+" ");
           }
           System.out.println();
       }

//reduced code to display output
//       for(int row = 0 ; row<3 ; row++){
//           System.out.println(Arrays.toString(nums[row]));
//       }

       //advanced for loop

//       for(int[] a : nums){
//           System.out.println(Arrays.toString(a));
//       }
   }
}
