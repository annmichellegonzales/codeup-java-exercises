import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is: %.2f%n", pi);
//
////
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an integer:");
//        Integer yourInt = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Your integer is: " + yourInt);

        // if you enter an input that is not an int, it will get mad at you...
        // the exception is an Input Mismatch.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter 3 words");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

        // if you enter 3 words, a new line will appear that forces the user to input that third word.
        // if you enter 4 words, only the first 3 will display in the result
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a sentence");
//        String yourSentence = sc.nextLine();
//        System.out.println(yourSentence);

        // with the next() method, only Here will be displayed in the result
        // using nextLine() will display the entire sentence.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the length and width of the Codeup Classroom");
//        Integer width = sc.nextInt();
//        sc.nextLine();
//        Integer length = sc.nextInt();
//        System.out.format("The perimeter of the room is: " + ((width + width) + (length + length)) + "\n");
//        System.out.format("The area of the room is: " + length * width);


        // to parse integers, we can use:
        // double length = Double.parseDouble(lengthInput);
        // double width = Double.parseDouble(widthInput);
        // int length = Integer.parseInt(lengthInput);

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();

        System.out.println(first + second + third);



    }

}
