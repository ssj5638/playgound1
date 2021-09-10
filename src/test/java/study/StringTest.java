package study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    void replaceTest() {
        String actual = "abc".replace("b", "d");
        assertEquals(actual, "adc");
    }

    @Test
    void splitTest() {
        String[] actual = "1,2".split(",");
        assertEquals(actual[0], "1");
        assertEquals(actual[1], "2");
    }

    @Test
    void substringTest() {
        String input = "(1, 2)";
        String actual = input.substring(1, input.length() - 1);
        assertEquals(actual, "1, 2");
    }

    @Test
    void charAtTest() {
        char actual = "abc".charAt(1);
        assertEquals(actual, 'b');
    }
}
