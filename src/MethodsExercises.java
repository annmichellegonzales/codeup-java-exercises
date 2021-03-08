import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        addition(4, 8);
        subtraction(16, 8);
        multiplication(20, 10);
        division(6, 2);
        modulus(9, 3);

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


}
