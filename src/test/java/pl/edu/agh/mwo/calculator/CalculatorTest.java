package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5, 7));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.sub(7, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5));
    }

}
