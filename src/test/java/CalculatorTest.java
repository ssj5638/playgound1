import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void 덧셈() {
        assertEquals(cal.add(3, 7), 10);
    }

    @Test
    public void 뺄셈() {
        assertEquals(cal.subtract(5, 1), 4);
    }

    @Test
    public void 곱셈() {
        assertEquals(cal.multiply(3, 4), 12);
    }

    @Test
    public void 나눗셈() {
        assertEquals(cal.divide(8, 2), 4);
    }

    @AfterEach
    public void tearDown() {
        cal = null;
    }
}