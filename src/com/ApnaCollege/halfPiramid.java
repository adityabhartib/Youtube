package com.ApnaCollege;

public class halfPiramid {
    public static void main(String[] args) {
        int m = 4;
        //outer loop
        for (int i = 1; i <= m; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
