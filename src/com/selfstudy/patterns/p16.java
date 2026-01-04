package com.selfstudy.patterns;

public class p16 {
    public static void main(String[] args) {
        int n = 8 ;

        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= n ; col++){
                if(col==1 || row==n || row==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
