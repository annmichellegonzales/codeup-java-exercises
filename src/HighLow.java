import java.util.Scanner;

public class HighLow {

//    public static void main(String[] args) {
//        System.out.println(checkGuess(35, 35));
//        playGame(new Scanner(System.in), (int)(Math.random()*100) + 1);
//    }

    public static void playGame(Scanner scanner, int randomNumber) {
        System.out.println("Please guess a number between 1 and 100: ");

        int userGuess = scanner.nextInt();
        if(userGuess < 1 || userGuess > 100) {
            System.out.println("Your guess is out of bounds. Please try again");
            playGame(scanner, randomNumber);
        } else {

            String response = checkGuess(userGuess, randomNumber);
            if (response.equals("You guess the correct number!")) {
                System.out.println(response);
                return;
            } else {
                playGame(scanner);
            }
        }
    }

    private static void playGame(Scanner scanner) {
    }

    public static String checkGuess(int guess, int targetNum) {

        if (guess == targetNum) {
            return "You did it! Great job!";
        }else if (guess > targetNum){
            return "Lower, plz";
        }else if (guess < targetNum){
            return "Higher, plz";
        }

        return "idk";

    }

}

