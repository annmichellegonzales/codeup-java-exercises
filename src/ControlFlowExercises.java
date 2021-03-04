import java.util.Scanner;

//import java.util.stream.IntStream;
public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What grade did you make on your exam?");
        int yourGrade = sc.nextInt();

        System.out.println("Oh! You made a: " + yourGrade);

        System.out.println("Would you like to know the letter grade?");
        String response = sc.next();

        if (response.equals("yes")) {
            if (yourGrade == 100 || yourGrade >= 88) {
                System.out.print("You made an A!");
            } else if (yourGrade == 87 || yourGrade >= 80) {
                System.out.print("You made a B!");
            } else if (yourGrade == 79 || yourGrade >= 67) {
                System.out.print("You made a C!");
            } else if (yourGrade == 66 || yourGrade >= 60) {
                System.out.print("You made a D!");
            } else if (yourGrade == 59 || yourGrade >= 0) {
                System.out.print("You made an F!");
            }

        }
    }

}