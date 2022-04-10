import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.add(0, 1));
        assertEquals(5, calculator.add(2, 3));
        assertEquals(5000.5, calculator.add(1000, 4000.5));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(0, 1));
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3000.5, calculator.subtract(1000, 4000.5));
    }
}
