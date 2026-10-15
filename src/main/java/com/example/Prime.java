package com.example;
public class Prime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
}