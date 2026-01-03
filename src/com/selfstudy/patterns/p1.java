package com.selfstudy.patterns;

public class p1 {
    static void main(String[] args) {
        int n = 14 ;
        for(int row = 1 ; row  <= n*2-1 ; row++){
            for(int col = 1 ; col <= n*2-1 ; col++){
                if(row==n&& col==n){
                    System.out.print("#"+" ");
                }
                else if(row==n || col==n){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
