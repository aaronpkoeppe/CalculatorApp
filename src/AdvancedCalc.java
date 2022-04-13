/*
Author: Aaron Koeppe
Date: April 13th, 2022
Version: 1.0
 */

/**
 * Creates the AdvancedCalc class that creates the ability to use advanced math operations within main.
 */
public class AdvancedCalc implements AdvancedMath {
    /**
     * Adds the square root operation to the AdvancedCalc to be used within main.
     * @param x - First  and only value used in the operation to solve the square root
     * @return the square root of x.
     */
    @Override
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    /**
     * Adds the power to operation to AdvancedCalc to be used within main.
     * @param x - First value used within the power to operation.
     * @param y - Second value used within the power to operation.
     * @return - the power of value y to the value of x.
     */
    @Override
    public double pow(double x, double y) {
        return Math.pow(x, y);
    }
}
