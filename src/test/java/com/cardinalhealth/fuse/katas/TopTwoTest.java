package com.cardinalhealth.fuse.katas;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopTwoTest {
    private TopTwo subject;

    @BeforeEach
    void setUp() {
        subject = new TopTwo();
    }

    @Test
    void testFindTopTwo() {
        assertEquals(Arrays.asList(3, 4), subject.findTopTwo(Arrays.asList(3, 2, 1, 4)));
    }

    @Disabled
    void testFindTopTwoDates() {
        assertEquals(Arrays.asList("02/23/2002", "12/22/2013"), subject.findTopTwoDates(Arrays.asList("07/12/1987", "02/23/2002", "09/22/1953", "12/22/2013", "01/01/1991", "11/21/1997")));
    }
}