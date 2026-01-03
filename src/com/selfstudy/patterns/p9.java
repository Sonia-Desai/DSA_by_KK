package com.selfstudy.patterns;

public class p9 {
    public static void main(String[] args) {
        int n = 3;
        int a = 1;

        for(int row = 1 ; row <= n ; row++){
            for(int col = 1; col <= n ; col++){
                System.out.print(a);

            }
            a++;
            System.out.println();
        }
    }
}
