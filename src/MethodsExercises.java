import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        addition(4, 8);
        subtraction(16, 8);
        multiplication(20, 10);
        division(6, 2);
        modulus(9, 3);
//        getInteger(min, max);

    }

    public static void addition(int x, int y) {
        System.out.println(x + y);
    }

    public static void subtraction(int x, int y) {
        System.out.println(x - y);
    }

    public static void multiplication(int x, int y) {
        System.out.println(x * y);
    }

    public static void division(int x, int y) {
        System.out.println(x / y);
//        If dividing by 0, an error will occur.
    }

    public static void modulus(int x, int y) {
        System.out.println(x % y);
    }

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//
//        int userInput = getInteger(1, 10);
//    }

}
