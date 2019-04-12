package com.cardinalhealth.fuse.katas;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
    private VendingMachine subject;

    @BeforeEach
    void setUp() {
        subject = new VendingMachine();
    }

    @Test
    @DisplayName("shows 'INSERT COINS' on the display")
    void initialDisplay() {
        assertEquals("INSERT COINS", subject.getDisplay());
    }


    @Test
    @DisplayName("when a Nickel is inserted the display shows '$0.05'")
    void insertCoin() {
        subject.insertCoin("NICKEL");

        assertEquals("$0.05", subject.getDisplay());
    }
}
