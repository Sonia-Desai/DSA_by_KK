package com.selfstudy.karrays;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int arr [] = new int[55];
        int a = 10;
        System.out.println("Loop Starts ");
        for(int i = 0 ; i<arr.length;i++){

            System.out.print(a+" ");
            a++;


        }
        System.out.println("Loop Ends ");


        //Now taking the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] number = new int [size];
        System.out.println("Enter the elements of the array");

        System.out.print("Loop Starts ");
        for(int j = 0 ; j<=arr.length;j++){

            arr[j]=sc.nextInt();
            System.out.print(arr[j]+" ");


        }
        System.out.print("Loop Starts ");

    }

}
