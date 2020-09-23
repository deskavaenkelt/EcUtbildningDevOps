package se.dsve.model;

/*
  __
 /\ \
 \_\ \    ____  __  __     __
 /'_` \  /',__\/\ \/\ \  /'__`\
/\ \L\ \/\__, `\ \ \_/ |/\  __/
\ \___,_\/\____/\ \___/ \ \____\
 \/__,_ /\/___/  \/__/   \/____/

*/

/**
 * Assignment 1 - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-08-31.
 * https://github.com/deskavaenkelt/
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorTest {

    static final double NUMBER_1 = 10;
    static final double NUMBER_2 = 3;

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addition() {
        double add = NUMBER_1 + NUMBER_2;
        assertEquals(add, calc.addition(NUMBER_1, NUMBER_2));
    }

    @Test
    void subtraction() {
        double sub = NUMBER_1 - NUMBER_2;
        assertEquals(sub, calc.subtraction(NUMBER_1, NUMBER_2));
    }

    @Test
    void multiplication() {
        double multi = NUMBER_1 * NUMBER_2;
        assertEquals(multi, calc.multiplication(NUMBER_1, NUMBER_2));
    }

    @Test
    void division() {
        double div = NUMBER_1 / NUMBER_2;
        assertEquals(div, calc.division(NUMBER_1, NUMBER_2));
    }
}