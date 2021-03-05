import java.util.Locale;
import java.util.Scanner;

public class MethodsLecture {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a name.");

        String name1 = sc.next();

        System.out.println("Please enter another name.");

        String name2 = sc.next();

        takeInName(name1, name2);

    }


        /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
         *   -Call each of the methods, passing in the names for each
         *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
         *   BONUS: Use the Scanner class to get the names from user input
         *  */

        public static void takeInName(String name1, String name2) {
            System.out.println("Hello " + name1 + " and " + name2 + " ");
            return;

        }







//        printMulti(2, 5);


//        printGreeting();
//
//    }
//    // ACCESS MODIFIERS
//
//    public static void printSalutation(String name) {
//        System.out.println();
//    }
//
//    public static String tryGetSalutation(String name) {
//
//        if ((name == null) || (name.equals(""))) {
//            return "No name provided";
//        }
//        else {
//            return getSalutation(name, "Why, hello ");
//        }
//    }
//
//    public static String getSalutation(String name, String greeting) {
//        return greeting + name.toUpperCase(Locale.ROOT);
//    }
//
//    // STATIC VS INSTANCE
//
//    public static int doTheMathStatic(){
//        return 1 + 2;
//    }
//
//    public int doTheMathInstance(){
//        return 1 + 2;
//    }
//
//    //  RETURNING VS VOID
//
//    public static String getGreeting(){
//        return "Hai!";
//    }
//
//    public static void printGreeting() {
//        System.out.println(getGreeting());
//    }


        // ============ Mini Exercise #1 =============
        /* TODO:
         *   -Write a public static method which returns an integer
         *   -The method should take in *two parameters* and *return* the product of multiplying them
         *   -Print the output to the console by calling the method, passing in params, and logging its output
         *   BONUS: Use the Scanner class to get the numbers from the user input
         * */


//        public static String main

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter two integers.");
//
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        System.out.println("Your numbers are: " + num1 + " and " + num2);
//
//
//        public static int multiply(int num1, int num2){
//            return num1 * num2;
//        }
//
//        public static void printMultiplicationProduct(){
//            System.out.println(multiply(int num1, int num2));





}
