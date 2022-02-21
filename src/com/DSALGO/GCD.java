package com.DSALGO;

public class GCD {
    public static void main(String[] args) {
        System.out.println("1 :" + gcd(24,64));
        System.out.println("2 :" + gcd(120,12));
    }
    static int gcd(int a, int b) {
        if((a%b) == 0) {
            return b;
        }
        return gcd(b,(a%b));
    }
}
