package com.selfstudy.karrays;

import java.util.Scanner;
//Array of premitives
public class p2 {
    public static void main(String[] args) {
        int arr [] = new int[5];
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

        System.out.print("Enter the elements of the array");
        int [] number = new int [size];


        for(int j = 0 ; j<=arr.length;j++){

            arr[j]=sc.nextInt();
            if(arr.length==size){

                System.out.print(arr[j]+" ");
            }



        }

        for(int num : number){
            System.out.println("Using for each loop");
            System.out.print(num+" ");
        }
        System.out.print("Loop Starts ");

    }

}
