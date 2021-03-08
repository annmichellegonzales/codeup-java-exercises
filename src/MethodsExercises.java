import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        addition(4, 8);
//        subtraction(16, 8);
//        multiplication(20, 10);
//        division(6, 2);
//        modulus(9, 3);
//        multiply(2, 8);
//        multiplyLoop(2, 3);
//        System.out.println(getInteger(1, 10));
//        getInteger(1, 10);
//        System.out.println(factorial(1, 10));
//        displayTable();
        diceRoll();

    }

//    public static void addition(int x, int y) {
//        System.out.println(x + y);
//    }

//    public static void subtraction(int x, int y) {
//        System.out.println(x - y);
//    }
//
//    public static void multiplication(int x, int y) {
//        System.out.println(x * y);
//    }
//
//    public static void division(int x, int y) {
//        System.out.println(x / y);
////        If dividing by 0, an error will occur.
//    }
//
//    public static void modulus(int x, int y) {
//        System.out.println(x % y);
//    }
//
//
//    public static int multiply(int x, int y) {
//        int result = 0;
//        while (x > 0) {
//            result += y;
//            x--;
//        }
//        return result;
//    }
//*********************TRAVIS BONUS***************
// Bonus 1a - loop
//public static int multiplyLoop(int num1, int num2) {
//    int multiplied = 0;
//    do {
//        multiplied += num1;
//        num2--;
//    } while (num2 != 0);
//    return multiplied;
//}
//    // Bonus 1b - recursion
//    public static int multiplyRecursion(int num1, int num2) {
//        int multiplied = 0;
//        if (num2 != 0) {
//            multiplied = num1 + multiplyRecursion(num1, num2 - 1);
//        }
//        return multiplied;
//    }
//    // Exercise 2
//    public static boolean isBetween(int min, int max, int check) {
//        return (min <= check && max >= check);
//    }
//    public static int getRangeInput(int min, int max, Scanner input) {
//        System.out.println("Enter a number between " + min + " and " + max + ":");
//        return input.nextInt();
//    }
//    public static int getInteger(int min, int max, Scanner input) {
//        int userInt = getRangeInput(1, 10, input);
//        if (!isBetween(1, 10, userInt)) {
//            System.out.println("Your number was not in the range");
//            userInt = getInteger(min, max, input);
//        }
//        return userInt;
//    }
//
//******************************************************************


//    public static String getInteger(int min, int max) {
//        System.out.println("Enter a number between 1 and 10:");
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return "Your number is: " + userInput;
//        } else {
//            return getInteger(1, 10);
//        }
//
//    }

//    public static long factorial(long factorial, int num) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer from 1-10.");
//        int userNum = sc.nextInt();
//        System.out.println("Would you like to continue?");
//        String userResponse = sc.next();
//        System.out.println("Your integer is: " + userNum);
//        if (userResponse.equals("yes") && userNum >= 1 && userNum <= 10) {
//            for (int i = 1; i <= num; i++) {
//                factorial *= i;
//            }
//        }
//        System.out.println("Would you like to proceed to a factorial?");
//        String userResponseFactorial = sc.next();
//        if (userResponseFactorial == "yes") {
//            return factorial;
//        }
//        return factorial;
//    }
//



    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for your first die.");
        int dieType1 = sc.nextInt();
        System.out.println("Enter the number of sides for your second die.");
        int dieType2 = sc.nextInt();

        int hit = dieType1 - 1 + 1;
        int damage = dieType2 -1 +1;

        System.out.println("Please type in /roll to roll your dice.");
        String rollDice = sc.next();
        if(rollDice.equals("/roll")) {
            System.out.println("You hit for: " +  ((int)(Math.random()*hit +1)));
            System.out.println("Your damage is: " +  ((int)(Math.random()*damage +1)));
        }

        System.out.println("Would you like to roll again?");
        String again = sc.next();
        if (again.equals("yes")) {
            diceRoll();
        } else {
            System.out.println("Thanks for playing!");
        }

    }

}


