package com.selfstudy.karrays;

import java.util.Arrays;

public class p1 {
    static void main(String[] args) {
        //array declaration

        int [] array ;

        //array creation

        array = new int [10];

        //before array initialzation of the array , accesing the array elements / indexes
        System.out.println(Arrays.toString(array));
        System.out.println(array[9]);

        //array initialization

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        //array utilization

        System.out.println(Arrays.toString(array));
        System.out.println(array[9]);


        System.out.println(array); // returns objects address

        float [] check = new float [10];
        System.out.println(Arrays.toString(check));

        //String Arrays

        String arr[] = new String[5];
        System.out.println(Arrays.toString(arr));
        //null, null, null, null, null]

        //In Java, when you create an array of objects (like String, Integer, etc.), each element is initialized to null by default.

        //That’s because String is a reference type, not a primitive type (like int or double).
        arr[0]="Soniya";
        System.out.println(Arrays.toString(arr));
    }
}
