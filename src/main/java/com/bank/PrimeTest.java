package com.bank;

public class PrimeTest {
    public static void main(String[] args) {
        test2();
        test1();
    }

    private static void test2() {
        int sum = 0;
        for (int m = 2; m <= 200000; m++) {
            boolean x = true;
            for (int n = 2; n <= Math.sqrt(m); n++) {
                if (m % n == 0) {
                    x = false;
                    continue;
                }
            }
            if (x) {
                sum += m;
            }
        }
        System.out.print(sum);
    }

    private static void test1() {
        int sum = 0;
        for (int m = 2; m <= 200000; m++) {
            int x = 0;
            for (int n = 2; n < m; n++) {
                if (m % n == 0) {
                    x++;
                }
            }
            if (x == 0) {
                sum += m;
            }
        }
        System.out.print(sum);
    }
}
