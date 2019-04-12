package com.cardinalhealth.fuse.katas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberWriterTest {
    private NumberWriter subject;

    @BeforeEach
    void setUp() {
        subject = new NumberWriter();
    }

    @Test
    public void testOneThroughTen() {
        assertEquals("one", subject.numToWord(1));
        assertEquals("two", subject.numToWord(2));
        assertEquals("three", subject.numToWord(3));
        assertEquals("four", subject.numToWord(4));
        assertEquals("five", subject.numToWord(5));
        assertEquals("six", subject.numToWord(6));
        assertEquals("seven", subject.numToWord(7));
        assertEquals("eight", subject.numToWord(8));
        assertEquals("nine", subject.numToWord(9));
        assertEquals("ten", subject.numToWord(10));
    }
}
