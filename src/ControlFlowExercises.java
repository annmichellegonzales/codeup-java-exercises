import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


//        Integer i = 5;
//        while(i<= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }


        int input = 0;

        while (input <= 100) {

            input++;


            if (input % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            if (input % 3 == 0) {
                System.out.println("Fizz");
            }
            if (input % 5 == 0) {
                System.out.println("Buzz");
            }
            if (input <= 100)
                System.out.println(String.valueOf(input++));
        }


            //        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("What number would you like to go up to?");
//        int yourInt = sc.nextInt();
//
//        System.out.println("Would you like a table?");
//        String response = sc.next();
//
//        System.out.print("number\t \t |" + "squared\t \t \t |" + "cubed\n -----------------------------------------\n");
//        if(response.equals("yes")) {
//
//            for ( int count = 1 ; count <= yourInt ; count++)
//            {
//                int squared = count * count;
//                int cubed = count * count * count;
//                System.out.println(count + "\t \t \t | " + squared + "\t \t \t \t| " + cubed);
//            }
//
//            System.out.print("number\t \t|\t" + "squared\t \t \t|\t" + "cubed\n-----------------------------------------\n");
//
//            for (int count = 1; count <= yourInt; count++) {
//                int squared = count * count;
//                int cubed = count * count * count;
//                System.out.println(count + "\t \t \t|\t " + squared + "\t \t \t \t|\t" + cubed);
//            }
//        } else {
//            System.out.println("Maybe next time, red!");
//        }


//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What grade did you make on your exam?");
//        int yourGrade = sc.nextInt();
//
//        System.out.println("Oh! You made a: " + yourGrade);
//
//        System.out.println("Would you like to know the letter grade?");
//        String response = sc.next();
//
//        if (response.equals("yes")) {
//            if (yourGrade == 100 || yourGrade >= 88) {
//                System.out.print("You made an A!");
//            } else if (yourGrade == 87 || yourGrade >= 80) {
//                System.out.print("You made a B!");
//            } else if (yourGrade == 79 || yourGrade >= 67) {
//                System.out.print("You made a C!");
//            } else if (yourGrade == 66 || yourGrade >= 60) {
//                System.out.print("You made a D!");
//            } else if (yourGrade == 59 || yourGrade >= 0) {
//                System.out.print("You made an F!");
//            }
//
//        } else {
//            System.out.print("Maybe next time");
//        }
        }

    }