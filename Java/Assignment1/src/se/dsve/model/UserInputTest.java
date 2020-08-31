package se.dsve.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Disabled
    @Test
    void getString() {
        fail();
    }

    @Disabled
    @Test
    void getNumberInt() {
        fail();
    }

    @Test
    void isInteger() {
        assertTrue(UserInput.isInteger("12"));
        assertFalse(UserInput.isInteger("1.2"));
        assertFalse(UserInput.isInteger("Darkwing Duck"));
    }

    @Disabled
    @Test
    void getNumberDouble() {
        fail();
    }

    @Test
    void isDouble() {
        assertTrue(UserInput.isDouble("1.2"));
        assertFalse(UserInput.isDouble("Darkwing Duck"));
    }

    @Disabled
    @Test
    void closeScanner() {
        fail();
    }
}