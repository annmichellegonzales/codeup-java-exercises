import java.util.stream.IntStream;
public class ControlFlowExercises {

    public static void main(String[] args) {

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
    }

}
