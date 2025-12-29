package com.selfstudy.linearsearch;
//search in range
public class p3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int start = 3;
        int end = 8;
        System.out.println(SearchElement(arr,target,start,end));

    }
    public static int SearchElement(int[] arr, int find , int start , int end) {
        if (arr.length == 0) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;

    }
}
