package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PrimeTest {
    @Test
    void testPrime() {
        assertTrue(Prime.isPrime(7));
    }
    @Test
    void testNotPrime() {
        assertFalse(Prime.isPrime(8));
    }
    @Test
    void testOne() {
        assertFalse(Prime.isPrime(1));
    }
}