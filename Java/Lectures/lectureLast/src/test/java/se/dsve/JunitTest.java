package se.dsve;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * lectureLast
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-10-07}.
 * https://github.com/deskavaenkelt/
 */

class JunitTest {

    private Methods methods;

    @BeforeEach
    void setUp() {
        methods = new Methods();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void doubleTheInput_one() throws Exception {
        assertEquals(10, methods.doubleTheInput(5));
    }

    @Test
    public void doubleTheInput_two() throws Exception {
        assertEquals(4, methods.doubleTheInput(2));
    }
}