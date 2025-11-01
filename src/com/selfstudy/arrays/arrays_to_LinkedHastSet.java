package com.selfstudy.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class arrays_to_LinkedHastSet {
    static void main(String[] args) {
        //Write a program to remove the duplicates from given data structure but by preserving the INsertion Order

//asList(); This method will convert into Arrays into List
//here asList() method is a static method because we are going to call this with className
//asList() method is present in Arrays Class

        String[] names = {"Raj","Mounicka","Vasanti","Mounicka","Soniya"};

        System.out.println("Before Removing the Duplicates");
        System.out.println(Arrays.toString(names));

        LinkedHashSet l = new LinkedHashSet(Arrays.asList(names));

        System.out.println("After Removing the Duplicates");
        System.out.println(l);




    }
}
