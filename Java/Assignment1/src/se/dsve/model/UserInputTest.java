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
    void parseStringToInt() {
        assertEquals(12, UserInput.parseStringToInt("12"));
        assertEquals(-1, UserInput.parseStringToInt("1.2"));
        assertEquals(-1, UserInput.parseStringToInt("Darkwing Duck"));
    }

    @Disabled
    @Test
    void getNumberDouble() {
        fail();
    }

    @Test
    void parseStringToDouble() {
        assertEquals(1.2, UserInput.parseStringToDouble("1.2"));
        assertEquals(-1, UserInput.parseStringToDouble("Darkwing Duck"));
    }

    @Disabled
    @Test
    void closeScanner() {
        fail();
    }
}