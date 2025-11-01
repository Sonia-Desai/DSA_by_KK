package com.selfstudy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
//Write a program to Remove Duplicates by preserving the order from given Array int[] a = {40,92,117,97,92,92,40}
public class int_to_LinkedHastSet {
public  static void main(String[] args) {
//
//        int [] a = {40,92,117,97,92,92,40};
//        Integer a1 = Integer.valueOf(a);
//        System.out.println(Arrays.toString(a1));
//     LinkedHashSet lh =new LinkedHashSet(Arrays.asList(a1));
//        System.out.println(lh);
//    }
//}

    /* Write a program to map two lists into a map */
    ArrayList<Integer> key = new ArrayList<Integer>();
key.add(1);
key.add(2);

    ArrayList<String> values = new ArrayList<String>();
values.add("A");
values.add("B");

    LinkedHashMap L = new LinkedHashMap();
    for(int i = 0; i<key.size();i++)

    {
        L.put(key.get(i),values.get(i));
    }
    System.out.println(L);


}
}



