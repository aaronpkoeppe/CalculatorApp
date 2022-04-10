import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int counter = 0;
        Calculator basicCalculator = new Calculator();
        AdvancedCalc advancedCalculator = new AdvancedCalc();
        Memory memory = new Memory();

        System.out.println("welcome to the calculator app");
        System.out.println("---------------------------\n");
        while (true) {
            counter++;
            if (counter == 0) {
                System.out.println("please enter a number corresponding to which operation you would like to use\n");
            }
            else if (counter > 0) {
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

        Scanner sc = new Scanner(System.in);
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 0:
                            System.out.println("thank you for using the calculator app :)");
                            System.exit(0);
                        case 1:
                            System.out.println("you have chosen addition");
                            System.out.println("please enter your first number");
                            String x1 = sc.nextLine();
                            double xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                            System.out.println("please enter your second number");
                            String y1 = sc.nextLine();
                            double yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                            System.out.println("the sum of your numbers is " + basicCalculator.add(xToAdd, yToAdd) + "\n");
                            memory.setMemoryValue(basicCalculator.add(xToAdd, yToAdd));
                            System.out.println("would you like to perform another operation? (y/n) \n");
                            if (sc.next().equals("n")) { // requires a double input to work
                                System.out.println("thank you for using the calculator app :)");
                                exit();

                            }
                            break;

                        case 2:
                            System.out.println("you have chosen subtraction\n");
                            System.out.println("please enter your first number");
                            x1 = sc.nextLine();
                            xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                            System.out.println("please enter your second number");
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
                        case 3:
                            System.out.println("you have chosen multiplication\n");
                            System.out.println("please enter your first number");
                            x1 = sc.nextLine();
                            xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                            System.out.println("please enter your second number");
                            y1 = sc.nextLine();
                            yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                            System.out.println("the product of your numbers is " + basicCalculator.multiply(xToAdd, yToAdd) + "\n");
                            System.out.println("would you like to perform another operation? (y/n) \n");
                            if (sc.next().equals("n")) { // requires a double input to work
                                System.out.println("thank you for using the calculator app :)");
                                exit();
                            }
                            break;
                        case 4:
                            System.out.println("you have chosen division\n");
                            System.out.println("please enter your first number");
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
                        case 5:
                            System.out.println("you have chosen the power operation");
                            System.out.println("please enter your first number");
                            x1 = sc.nextLine();
                            xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                            System.out.println("please enter your second number");
                            y1 = sc.nextLine();
                            yToAdd = y1.equals("M") ? memory.memoryRecall() : Double.parseDouble(y1);
                            System.out.println("the power of " + xToAdd + " to " + yToAdd + "= " + advancedCalculator.pow(xToAdd, yToAdd) + "\n");
                            System.out.println("would you like to perform another operation? (y/n) \n");
                            if (sc.next().equals("n")) { // requires a double input to work
                                System.out.println("thank you for using the calculator app :)");
                                exit();
                            }
                            break;
                        case 6:
                            System.out.println("you have chosen the square root operation");
                            System.out.println("please enter your number");
                            x1 = sc.nextLine();
                            xToAdd = x1.equals("M") ? memory.memoryRecall() : Double.parseDouble(x1);
                            System.out.println("the square root of your number is " + advancedCalculator.sqrt(xToAdd) + "\n");
                            System.out.println("would you like to perform another operation? (y/n) \n");
                            if (sc.next().equals("n")) { // requires a double input to work
                                System.out.println("thank you for using the calculator app :)");
                                exit();
                            }
                            break;
                        case 7:
                            memory.memoryClear();
                            break;


                    }
        }
    }

      public static void exit() {
        System.exit(0);
    }
}



