package se.dsve.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {

    private final UserInput userInput = new UserInput();

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
        assertEquals(12, userInput.parseStringToInt("12"));
        assertEquals(-1, userInput.parseStringToInt("1.2"));
        assertEquals(-1, userInput.parseStringToInt("Darkwing Duck"));
    }

    @Disabled
    @Test
    void getNumberDouble() {
        fail();
    }

    @Test
    void parseStringToDouble() {
        assertEquals(1.2, userInput.parseStringToDouble("1.2"));
        assertEquals(-1, userInput.parseStringToDouble("Darkwing Duck"));
    }

    @Disabled
    @Test
    void closeScanner() {
        fail();
    }
}