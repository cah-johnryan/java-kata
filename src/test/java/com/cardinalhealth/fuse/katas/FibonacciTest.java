package com.cardinalhealth.fuse.katas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    Fibonacci subject;

    @BeforeEach
    void setUp() {
        subject = new Fibonacci();
    }

    // 10 -> 55
    // 20 -> 6765
    // 30 -> 832040
    // 40 -> 102334155
    // 50 -> 12586269025
    @Test
    public void testFibZeroIsZero() {
        assertEquals(0, subject.compute(0));
    }

    @Test
    public void testFibOneIsOne() {
        assertEquals(1, subject.compute(1));
    }

    @Test
    public void testFibTenIs55() {
        assertEquals(55, subject.compute(10));
    }
}
