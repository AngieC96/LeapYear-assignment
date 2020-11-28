package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestLeapYear {

    private final LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000})
    void isLeapYear(int year) {
        // assertEquals(true, leapYear.leapYear(year));
        assertTrue(leapYear.leapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2001, 1900})
    void isNotLeapYear(int year) {
        // assertEquals(false, leapYear.leapYear(year));
        assertFalse(leapYear.leapYear(year));
    }
}
