package com.DSALGO;

public class FastPower {
    public static void main(String[] args) {
        System.out.println(fastPower(248932,6));
        System.out.println(fastPower2(248932,6, 1000000007));
    }
    static int fastPower (int a, int b) {
        int res = 1;

        while (b > 0) {
            if((b&1) != 0) {
                res = res * a;
            }
            a = a * a;
            b = b >> 1;
        }

        return res;
    }

    static long fastPower2(long n, long m, int MOD) {
        long res = 1;

        while (m > 0) {
            if((m&1) != 0) {
                res = ((res * (n%MOD))%MOD);
            }
            m = m >> 1;
            n = ((n%MOD)*(n%MOD)) % MOD;
        }

        return res;
    }

}
