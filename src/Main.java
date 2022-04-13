/*
Author: Aaron Koeppe
Date: April 13th, 2022
Version: 1.0
 */


/**
 * imports java scanner to allow user input.
 */

import java.util.Scanner;

/**
 * Main class used to operate program and preform mathematical operations.
 */
public class Main {

    public static void main(String[] args) {
        /**
         * counter used to know whether its asking the first question or second question so it can output a different menu header.
         */
        int counter = 0;
        /**
         * creates basicCalculator from the Calculator method.
         * allows to use of 4 basic math operations such as addition, subtraction, multiplication, division.
         */
        Calculator basicCalculator = new Calculator();
        /**
         * creates advancedCalculator from the AdvancedCalc method
         * allows the use of two more advanced math operations such as to the power of and the square root.
         */
        AdvancedCalc advancedCalculator = new AdvancedCalc();
        /**
         * creates memory from the Memory method.
         * allows the use of storing memory into memoryValue, memoryRecall and memoryClear((see Memory.java)).
         */
        Memory memory = new Memory();
/**
 * beginning of calculator app functionality and displays the app welcome message.
 */
        System.out.println("welcome to the calculator app");
        System.out.println("---------------------------\n");
        /**
         * while look that repeats until sc = 0.
         * counter increments 1 everytime the while loop runs/repeats.
         * displays the menu for the calculator app giving the user 7 options - addition, subtraction, division, multiplication, power of, square root, and clear memory.
         */
        while (true) {
            counter++;
            if (counter == 0) {
                System.out.println("please enter a number corresponding to which operation you would like to use\n");
            } else if (counter > 0) {
                System.out.println("Please choose which operation you would like to use for your next question\n");
            }
            System.out.println("press 0 to exit");
            System.out.println("press 1 for addition operations");
            System.out.println("press 2 for subtraction operations");
            System.out.println("press 3 for multiplication operations");
            System.out.println("press 4 for division operations");
            System.out.println("press 5 for power operations");
            System.out.println("press 6 for square root operations");
            System.out.println("press 7 to clear memory");
/**
 * creates new scanner (sc) to take in user input.
 */
            Scanner sc = new Scanner(System.in);
            /**
             * switch statement that uses user input to determine which case to follow.
             * stores the total of the two values used in the operations to memoryValue.
             */
            switch (Integer.parseInt(sc.nextLine())) {
                /**
                 * case 0 - exits program if user inputs 0.
                 */
                case 0:
                    System.out.println("thank you for using the calculator app :)");
                    System.exit(0);
                    /**
                     * Case 1 - addition operation.
                     * Asks the user to input two numbers or input one number and the number stored in memory.
                     * After solving the addition equation, stores the sum of the two numbers into memory.
                     * Asks the user if they would like to preform another operation by pressing 'y" or end the program by typing in 'n'.
                     */
                case 1:
                    System.out.println("you have chosen addition");
                    System.out.println("please enter your first number or enter 'M' to use the number stored in memory");
                    String x1 = sc.nextLine();
                    double xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                    System.out.println("please enter your second number");
                    String y1 = sc.nextLine();
                    double yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                    System.out.println("the sum of your numbers is " + basicCalculator.add(xToAdd, yToAdd) + "\n");
                    memory.setMemoryValue(basicCalculator.add(xToAdd, yToAdd));
                    System.out.println("would you like to perform another operation? (y/n) \n");
                    if (sc.next().equals("n")) {
                        System.out.println("thank you for using the calculator app :)");
                        exit();

                    }
                    break;
                /**
                 * Case 2 - subtraction operation.
                 * Asks the user to input two numbers or input one number and the number stored in memory.
                 * After solving the subtraction equation, stores the difference of the two numbers into memory.
                 * Asks the user if they would like to preform another operation by pressing 'y" or end the program by typing in 'n'.
                 */
                case 2:
                    System.out.println("you have chosen subtraction\n");
                    System.out.println("please enter your first number or enter 'M' to use the number stored in memory\"");
                    x1 = sc.nextLine();
                    xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                    System.out.println("please enter your second number or enter 'M' to use the number stored in memory\"");
                    y1 = sc.nextLine();
                    yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                    System.out.println("the difference of your numbers is " + basicCalculator.subtract(xToAdd, yToAdd) + "\n");
                    memory.setMemoryValue(basicCalculator.subtract(xToAdd, yToAdd));
                    System.out.println("would you like to perform another operation? (y/n) \n");
                    if (sc.next().equals("n")) { // requires a double input to work
                        System.out.println("thank you for using the calculator app :)");
                        exit();
                    }
                    break;
                /**
                 * Case 3 - multiplication operation.
                 * Asks the user to input two numbers or input one number and the number stored in memory.
                 * After solving the multiplication equation, stores the sum of the two numbers into memory.
                 * Asks the user if they would like to preform another operation by pressing 'y" or end the program by typing in 'n'.
                 */
                case 3:
                    System.out.println("you have chosen multiplication\n");
                    System.out.println("please enter your first number or enter 'M' to use the number stored in memory\"");
                    x1 = sc.nextLine();
                    xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                    System.out.println("please enter your second number or enter 'M' to use the number stored in memory\"");
                    y1 = sc.nextLine();
                    yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                    System.out.println("the product of your numbers is " + basicCalculator.multiply(xToAdd, yToAdd) + "\n");
                    System.out.println("would you like to perform another operation? (y/n) \n");
                    if (sc.next().equals("n")) { // requires a double input to work
                        System.out.println("thank you for using the calculator app :)");
                        exit();
                    }
                    break;
                /**
                 * case 4 - division operation
                 * Asks the user to input two numbers or input one number and the number stored in memory.
                 * After solving the division equation, stores the output of the two numbers into memory.
                 * Asks the user if they would like to preform another operation by pressing 'y" or end the program by typing in 'n'.
                 */
                case 4:
                    System.out.println("you have chosen division\n");
                    System.out.println("please enter your first number or enter 'M' to use the number stored in memory\"");
                    x1 = sc.nextLine();
                    xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                    System.out.println("please enter your second number");
                    y1 = sc.nextLine();
                    yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                    System.out.println("the quotient of your numbers is " + basicCalculator.divide(xToAdd, yToAdd) + "\n");
                    System.out.println("would you like to perform another operation? (y/n) \n");
                    if (sc.next().equals("n")) { // requires a double input to work
                        System.out.println("thank you for using the calculator app :)");
                        exit();
                    }
                    break;
                /**
                 * Case 5 - power operation
                 * Asks the user to input two numbers or input one number and the number stored in memory.
                 * After solving the power operation, stores the output of the two numbers into memory.
                 * Asks the user if they would like to preform another operation by pressing 'y" or end the program by typing in 'n'.
                 */
                case 5:
                    System.out.println("you have chosen the power operation");
                    System.out.println("please enter your first number or enter 'M' to use the number stored in memory\"");
                    x1 = sc.nextLine();
                    xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                    System.out.println("please enter your second number or enter 'M' to use the number stored in memory\"");
                    y1 = sc.nextLine();
                    yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                    System.out.println("the power of " + xToAdd + " to " + yToAdd + " = " + advancedCalculator.pow(xToAdd, yToAdd) + "\n");
                    System.out.println("would you like to perform another operation? (y/n) \n");
                    if (sc.next().equals("n")) { // requires a double input to work
                        System.out.println("thank you for using the calculator app :)");
                        exit();
                    }
                    break;
                /**
                 * case 6 - square root operation
                 * Asks the user to input two numbers or input one number and the number stored in memory.
                 * After solving the square root operation, stores the output of the two numbers into memory.
                 * Asks the user if they would like to preform another operation by pressing 'y" or end the program by typing in 'n'.
                 */
                case 6:
                    System.out.println("you have chosen the square root operation");
                    System.out.println("please enter your number or enter 'M' to use the number stored in memory\"");
                    x1 = sc.nextLine();
                    xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                    System.out.println("the square root of your number is " + advancedCalculator.sqrt(xToAdd) + "\n");
                    System.out.println("would you like to perform another operation? (y/n) \n");
                    if (sc.next().equals("n")) { // requires a double input to work
                        System.out.println("thank you for using the calculator app :)");
                        exit();
                    }
                    break;
                /**
                 * clears memory, setting memoryValue to 0.0.
                 * then continues program, starting at the while loop.
                 */
                case 7:
                    memory.memoryClear();
                    break;


            }
        }
    }

    /**
     * Exits program if user inputs 0 in the menu or inputs 'n' after asking a math question.
     */
    public static void exit() {
        System.exit(0);
    }
}



