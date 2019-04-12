package com.cardinalhealth.fuse.katas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanCalculatorTest {
    RomanCalculator subject;

    @BeforeEach
    public void setUp() {
        subject = new RomanCalculator();
    }

    @Test
    public void addOnePlusOne() {
        subject.enter("I");
        subject.enter("I");
        assertEquals("II", subject.add());
    }
}