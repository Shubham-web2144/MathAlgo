package com.DSALGO;

import java.util.Arrays;

public class SieveOfErotosthenes {
    public static void main(String[] args) {
//        System.out.println(isPrimeBS(19));
        boolean primeN[] = isPrime(20);
        for(int i = 2; i <= 20; i++) {
            if(primeN[i] == true) {
                System.out.println(i);
            }
        }
    }
    static boolean[] isPrime(int n) {
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i = 2; i*i <= n; i++) {
            for(int j = i*i; j <= n; j += i){
                prime[j] = false;
            }
        }
        return prime;
    }
    static boolean isPrimeBS(int n) {
        for(int i = 2; i <= n/2; i++) {
            if((n%i) == 0) {
                return false;
            }
        }
        return true;
    }
}
