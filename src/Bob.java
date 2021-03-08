import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Chat with bob.");

        String supBob = sc.nextLine();

        if (supBob.endsWith("?")) {

            String sure = ("Sure?");
            System.out.println(sure);

        } else if (supBob.endsWith("!")) {

            String chill = "Whoa, chill out!";
            System.out.println(chill);

        } else if (supBob.equals(" ")) {
            String whatever = "Whatever.";
            System.out.println(whatever);

        } else {
            String fine = "Fine. Be that way!";
            System.out.println(fine);
        }

    }

}
