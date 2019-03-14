package com.cardinalhealth.fuse.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberWriterTest {

    private NumberWriter numberWriter = new NumberWriter();

    @Test
    public void testOneThroughTen() {
        assertEquals("one", numberWriter.numToWord(1));
        assertEquals("two", numberWriter.numToWord(2));
        assertEquals("three", numberWriter.numToWord(3));
        assertEquals("four", numberWriter.numToWord(4));
        assertEquals("five", numberWriter.numToWord(5));
        assertEquals("six", numberWriter.numToWord(6));
        assertEquals("seven", numberWriter.numToWord(7));
        assertEquals("eight", numberWriter.numToWord(8));
        assertEquals("nine", numberWriter.numToWord(9));
        assertEquals("ten", numberWriter.numToWord(10));
    }

}
