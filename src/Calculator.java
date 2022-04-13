/*
Author: Aaron Koeppe
Date: April 13th, 2022
Version: 1.0
 */

/**
 * Creates Calculator class implementing the interface basicMath for the use of basic math operatons such as addition, subtraction, multiplication, and division.
 */
public class Calculator implements BasicMath {
    /**
     * Adds addition functionality to the Calculator to be used within the main class.
     * @param a - First value used within the addition equation.
     * @param b - Second value used within the addition equation.
     * @return the sum of (a + b).
     */
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Adds subtraction functionality to the Calculator to be used within the main class.
     * @param a - First value used within the subtraction equation.
     * @param b - Second value used within the subtraction equation.
     * @return the difference of (a - b).
     */
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Adds the multiplication functionality to the Calculator to be used within the main class.
     * @param a - First value used within the multiplication equation.
     * @param b - Second value used within the multiplication equation.
     * @return the product  of (a * b).
     */
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Add the division fucntionality to the Calculator to be used wirthin the main class.
     * @param a - First value used within the division equation.
     * @param b - Second value used within the division equation.
     * @return the product of (a / b).
     */
    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}