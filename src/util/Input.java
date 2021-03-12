package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        } else {
            System.out.println("Invalid input; please enter an integer");
            scanner.nextLine();
            return getInt();
        }
    }

//    public int getInt(int min, int max) {
//        int userInt = getInt();
//        if(userInt >= min && userInt <= max) {
//            return userInt;
//        } else {
//            System.out.println("Out of range. Please enter a number between " + min + " and " + max);
//            getInt(min, max);
//        }
//    }

//    public void getDouble(double min, double max) {
//        double userDouble = getDouble(min, max);
//        if(userDouble >= min && userDouble <= max) {
//            return userDouble;
//        } else {
//            System.out.println("Our of range; please enter a number between " + min + " and " + max);
//        }
//
//    }








//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()

    public static void main(String[] args) {
        Input input = new Input();
//        String userInput= input.getString();
//        System.out.println(userInput);
//        System.out.println("Would you like to continue?");
//        boolean willContinue = input.yesNo();
//        if (willContinue) {
//            System.out.println("Continuing...");
//        } else {
//            System.out.println("Exiting...");
//        }

//        System.out.println("Please enter an integer.");
//        int userInt = input.getInt();
//        System.out.println("Your int is: " + userInt);
//
//        System.out.println("Please enter a double");
//        double userDouble = input.getDouble;
//        System.out.println("Your double is: " + userDouble);
//
//


    }

}
