package se.dsve;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class MainTest {

    static LocalTime myObj = LocalTime.now();

    @Test
    public void convertFromFahrenheitToCelsiusTest() throws Exception {
        assertEquals(100.0, Main.convertFromFahrenheitToCelsius(212.0));
    }

    @Test
    public void convertInchesToMetersTest() throws Exception {
        assertEquals(25.4, Main.convertInchesToMeters(1000));
    }

    @Test
    public void convertMinutesToYears() throws Exception {
        assertEquals(6, Main.convertMinutesToYears(3456789));
    }

    @Test
    public void convertMinutesToDays() throws Exception {
        assertEquals(210, Main.convertMinutesToDays(3456789));
    }

    @Test
    public void commonMinutesMethodTest() throws Exception{
        long millisToTestWith = 1_598_875_091_803L;
        long millisToMinutes = millisToTestWith / 1000 / 60;
        assertEquals(millisToMinutes, Main.commonMinutesMethod(millisToTestWith));
    }

    @Test
    public void returnsMinutesTest() throws Exception {
        long actualMinuteNow = myObj.getMinute();
        long totalMilliseconds = System.currentTimeMillis();
        assertEquals(actualMinuteNow, Main.returnCurrentMinute(totalMilliseconds));
    }

    @Test
    public void returnsHourTest() throws Exception {
        long actualMinuteNow = myObj.getHour();
        long totalMilliseconds = System.currentTimeMillis();
        assertEquals(actualMinuteNow, Main.returnCurrentHour(totalMilliseconds));
    }
}