import java.util.Scanner;
//import java.util.stream.IntStream;
public class ControlFlowExercises {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        int begin = 1;
//
//        System.out.println("What number would you like to go up to?");
//        int yourInt = sc.nextInt();
//
//        if (begin >= yourInt) {
//            System.out.print("number | squared | cubed \n" + begin + "      |  " + begin + "      | " + begin + "\n" +
//                    begin++ + "|" + Math.pow(begin,2) + "|" + Math.pow(begin,3));
//        }


        Scanner sc = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");
        int yourInt = sc.nextInt();

        System.out.println("Would you like a table?");
        String response = sc.next();

        if(response.equals("yes")) {


            System.out.print("number\t \t|\t" + "squared\t \t \t|\t" + "cubed\n-----------------------------------------\n");

            for (int count = 1; count <= yourInt; count++) {
                int squared = count * count;
                int cubed = count * count * count;
                System.out.println(count + "\t \t \t|\t " + squared + "\t \t \t \t|\t" + cubed);
            }
        } else {
            System.out.println("Maybe next time, red!");
        }


    }

}
