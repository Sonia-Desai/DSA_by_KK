package com.selfstudy.patterns;

public class p13 {
    public static void main(String[] args) {
        int n = 3;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
                System.out.println();
            }
        }
    }
