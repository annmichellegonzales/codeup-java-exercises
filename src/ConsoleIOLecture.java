import java.util.Scanner;

public class ConsoleIOLecture {

        public static void main(String[] args) {

            // ================================== print() and println()

            // this:
//            System.out.println("here");
//            System.out.println("there");

            // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

            // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

            // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");

            // ================================== printf() / .format()

            // Print a formatted string using the following... printf(formatString, data)

            // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");

            // creating a string variable:
//            String bigBall = "World";
//            System.out.printf("Hello %s", bigBall);
//            System.out.printf("Hello %S", bigBall); // all caps

//
//            String firstName = "Ann";
//            String lastName = "Gonzales";
//            System.out.printf("%s %s", firstName, lastName);

            // multiple variables:
//            int three = 3;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %d %s.", three, typeOfPetGroup);

            // currency:
//            int currencyPennies = 1431;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);


//            int age = 23;
//            String name = "Fred";
//            String state = "Texas";
//            System.out.printf("%s is from %s and is % years old", name, state, age);



            // ================================== USER INPUT

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your first name.");
//        String userInput = sc.next();
//        System.out.println(userInput);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
            - remember to first prompt the user for the input
         */

//                Scanner sc = new Scanner(System.in);
//                System.out.println("What month were you born?");
//                String userInput = sc.next();
//                System.out.println("You were born in " + userInput);
//


            // .next() captures each input separated by a string:
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

            // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);

            // .nextLine():
//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);

            // Quirk of using next() then nextLine()...
            // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
            // https://coderanch.com/wiki/676482/Scanner-nextLine-gotcha
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Please enter your favorite number: ");
//            int num = sc.nextInt();
//            System.out.println(num);
//            System.out.print("Please enter your favorite words: ");
//            String words = sc.nextLine();
//            System.out.println(words);

//        }

                /* TODO: use the scanner to take in your birthday as an integer and then name of the month you were born and print it back out
            - remember to first prompt the user for the birthday day of the month and store as an integer
            - next take in name of the month with .nextLine()
            - print out the result
            - use a fix to prevent the month name input from being skipped
         */

                Scanner sc = new Scanner(System.in);
                System.out.println("What date were you born?");
                Byte date = sc.nextByte();
                sc.nextLine();
                System.out.println("What month were you born?");
                String month = sc.nextLine();
                System.out.println("Your birthday is on " + month + " " + date);



    }
}
