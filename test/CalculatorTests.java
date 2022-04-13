/*
Author: Aaron Koeppe
Date: April 13th, 2022
Version: 1.0
 */

/**
 * Tests that show that every operation is running property and the outcomes are the correct outcomes.
 */


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

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.divide(20, 5));
        assertEquals(20, calculator.divide(40, 2));
        assertEquals(10.5, calculator.divide(105, 10));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.multiply(11, 5));
        assertEquals(1000, calculator.multiply(500, 2));
        assertEquals(358.8, calculator.multiply(179.4, 2));
    }

    @Test
    public void testPower() {
        AdvancedCalc advancedCalc = new AdvancedCalc();
        assertEquals(125, advancedCalc.pow(5, 3));
        assertEquals(10000, advancedCalc.pow(10, 4));
        assertEquals(12.25, advancedCalc.pow(3.5, 2));
    }

    @Test
    public void testSquareRoot() {
        AdvancedCalc advancedCalc = new AdvancedCalc();
        assertEquals(8, advancedCalc.sqrt(64));
        assertEquals(10, advancedCalc.sqrt(100));
        assertEquals(4.9, advancedCalc.sqrt(24.01));
    }
}
