package com.fuse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    // 10 -> 55
    // 20 -> 6765
    // 30 -> 832040
    // 40 -> 102334155
    // 50 -> 12586269025
    @Test
    public void testFibZeroIsZero() {
        Fibonacci fibonacci = new Fibonacci();

        int result = fibonacci.compute(0);

        assertEquals(0, result);

    }

    @Test
    public void testFibOneIsOne() {
        Fibonacci fibonacci = new Fibonacci();

        int result = fibonacci.compute(1);

        assertEquals(1, result);

    }

    @Test
    public void testFibTenIs55() {
        Fibonacci fibonacci = new Fibonacci();

        int result = fibonacci.compute(10);

        assertEquals(55, result);

    }


}
