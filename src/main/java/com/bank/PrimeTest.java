package com.bank;

public class PrimeTest {
    public static void main(String[] args) {
        test3();
        test2();
        test1();
    }

    private static void test3() {
        int i = 200000;
        int sum = i>1?2:1;
        for (int m = 3, n; m <= i; m+=2) {
            for (n = 3; n < m && (m % n != 0); n+=2);
            if (n >= m) {
                sum += m;
            }
        }
        System.out.println("test3运行的结果是："+sum);
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
        System.out.println("test2运行的结果是："+sum);
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
        System.out.println("test1运行的结果是："+sum);
    }
}
