/*
Author: Aaron Koeppe
Date: April 13th, 2022
Version: 1.0
 */

/**
 * Memory class which is used within the Main class to access memoryValue, memoryClear, and memoryRecall.
 */
public class Memory extends Calculator {
    /**
     * creates the double memory value and sets it to 0.0 because there is no stored memory yet.
     */
    private double memoryValue = 0.0;

    /**
     * setter used to set memoryValue after the solving of a operation within main.
     *
     * @param memoryValue - sets memoryValue to the sum of whatever two numbers or single number was used in the previous operation.
     */
    public void setMemoryValue(double memoryValue) {
        this.memoryValue = memoryValue;
    }

    /**
     * sets memoryValue back to 0.0 when memoryClear is called within main.
     */
    public void memoryClear() {
        memoryValue = 0.0;
        System.out.println("memory cleared and memory set to: 0.0\n");
    }

    /**
     * returns the most recent memoryValue.
     *
     * @return memoryValue
     */
    public double memoryRecall() {
        return memoryValue;
    }
}
