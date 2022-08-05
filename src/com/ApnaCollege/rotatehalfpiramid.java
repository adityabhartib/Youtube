package com.ApnaCollege;

public class rotatehalfpiramid {
    public static void main(String[] args) {
        int m = 4;
        //outerloop
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=m-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
