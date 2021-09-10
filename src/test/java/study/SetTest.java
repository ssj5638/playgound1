package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void sizeTest() {
        int actual = numbers.size();
        assertEquals(actual, 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void containsTest1(int nums) {
        assertTrue(numbers.contains(nums));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:0", "2:4", "3:5"}, delimiter = ':')
    void containsTest2(int actual, int expected) {
        assertFalse(actual == expected);
    }
}
