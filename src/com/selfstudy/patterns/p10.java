package com.selfstudy.patterns;

public class p10 {
    public static void main(String[] args) {
        int n = 5 ;


        for(int row = 1 ; row<=n ; row++){
            int a = 1;
            for(int col = 1 ; col<=n ; col++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
