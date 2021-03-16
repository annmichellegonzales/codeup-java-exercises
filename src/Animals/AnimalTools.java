package Animals;

import java.util.Scanner;

public class AnimalTools {


    public static void getCanineDetails() {
        Canine canine;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Input 'dog' or 'wolf' to know its details: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("dog")) {
                canine = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                        "German Shepherd Dog", "Black and Tan");
            } else {
                canine = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                        "Northwestern Wolf", false, "North America");
            }

            canine.printDetails();

        System.out.println("Would you like more details on a canine? (yes/y)");

        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            getCanineDetails();
        }


    }

    public static void getFelineDetails() {
        Feline feline;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 'cat' or 'jaguar' to know its details: ");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("cat")) {
//            feline = new Cat();
            feline = new Cat("Egyptian Goddess Bast", "prrrr >^.^<", "MEOWZERZ", "Long-haired");
        } else {
            feline = new Jaguar(true, "Americas", "Aztec God Tezcatlipoca", "PRRR", "ROAR!");
        }

        feline.printDetails();

        System.out.println("Would you like more details on a feline? (yes/y)");

        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            getFelineDetails();
        }
    }


}
