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
                System.out.println("please enter a number corresponding to which calculator you would like to use\n");
            }
            else if (counter > 0) {
                System.out.println("Please choose which calculator you would like to use for your next question\n");
            }
        System.out.println("press 0 to exit");
        System.out.println("press 1 for basic calculator(addition, subtraction, multiplication, division)");
        System.out.println("press 2 for advanced calculator(power, square root)");


        System.out.println("please enter the number corresponding to the calculator you would like to use\n");
        Scanner sc = new Scanner(System.in);
        int z = Integer.parseInt(sc.nextLine());
            switch (z) {
                case 0:
                    System.out.println("thank you for using the calculator app :)");
                    System.exit(0);

                case 1:
                    System.out.println("you have chosen the basic calculator");

                    System.out.println("please enter an operation number");
                    System.out.println("---------------------------\n");
                    System.out.println("press 1 for addition operations");
                    System.out.println("press 2 for subtraction operations");
                    System.out.println("press 3 for multiplication operations");
                    System.out.println("press 4 for division operations");
                    double x, y;
                    switch (Integer.parseInt(sc.nextLine())) {
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
                            System.out.println();
                            if (sc.next().equals("n")) { // requires a double input to work
                                z = 0;
                                System.out.println("thank you for using the calculator app :)");
                                exit();
                                break;
                            }
                            break;

                        case 2:
                            System.out.println("you have chosen subtraction\n");
                            System.out.println("please enter your first number");
                            x = sc.nextDouble();
                            System.out.println("please enter your second number");
                            y = sc.nextDouble();
                            System.out.println("the difference of your numbers is " + basicCalculator.subtract(x, y) + "\n");
                            memory.setMemoryValue(basicCalculator.subtract(x, y));
                            System.out.println(memory.memoryRecall()); // stores the value properly. need to figure out how to allow the user to access it after being stored for future questions.
                            System.out.println("would you like to perform another operation? y/n \n");
                            if (sc.next().equals("n")) { // requires a double input to work
                                z = 0;
                                System.out.println("thank you for using the calculator app :)");
                                exit();
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("you have chosen multiplication\n");
                            System.out.println("please enter your first number");
                            x = sc.nextDouble();
                            System.out.println("please enter your second number");
                            y = sc.nextDouble();
                            System.out.println("the product of your numbers is " + basicCalculator.multiply(x, y) + "\n");
                            if (sc.next().equals("n")) { // requires a double input to work
                                System.out.println("thank you for using the calculator app :)");
                                exit();
                            }
                            break;
                        case 4:
                            System.out.println("you have chosen division\n");
                            System.out.println("please enter your first number");
                            x = sc.nextDouble();
                            System.out.println("please enter your second number");
                            y = sc.nextDouble();
                            System.out.println("the quotient of your numbers is " + basicCalculator.divide(x, y) + "\n");
                            break;
                    }
            }
            switch (z) {
                case 2:
                    System.out.println("you have chosen the advanced calculator");
                    System.out.println("please enter an operation number");
                    System.out.println("---------------------------\n");
                    System.out.println("press 1 for power operations");
                    System.out.println("press 2 for square root operations");
                 switch (sc.nextInt()) {
                     case 1:
                         System.out.println("you have chosen the power operation");
                         System.out.println("please enter your first number");
                         double x = sc.nextDouble();
                         System.out.println("please enter your second number");
                         double y = sc.nextDouble();
                         System.out.println("the power of " + x + " to " + y + "= " + advancedCalculator.pow(x, y) + "\n");
                         if (sc.next().equals("n")) { // requires a double input to work
                             System.out.println("thank you for using the calculator app :)");
                             exit();
                         }
                         break;
                     case 2:
                         System.out.println("you have chosen the square root operation");
                         System.out.println("please enter your number");
                         x = sc.nextDouble();
                         System.out.println("the square root of your number is " + advancedCalculator.sqrt(x) + "\n");
                         if (sc.next().equals("n")) { // requires a double input to work
                             System.out.println("thank you for using the calculator app :)");
                             exit();
                         }
                         break;
                 }
            }
        }
    }

      public static void exit() {
        System.exit(0);
    }
}



