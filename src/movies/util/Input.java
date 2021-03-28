package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String input = scanner.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

//    public int getInt() {
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("Invalid input; please enter an integer!");
//            scanner.nextLine();
//            return getInt();
//        }
//    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Out of range. Please enter a number between " + min + " and " + max + ".");
            return getInt(min, max);
        }
    }

    private int getInt() {
        return 0;
    }

    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Invalid input; please enter a number!");
            scanner.nextLine();
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Out of range. Please enter a number between " + min + " and " + max + ".");
            return getDouble(min, max);
        }
    }
}
