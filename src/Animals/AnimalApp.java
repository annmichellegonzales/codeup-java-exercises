package Animals;

import java.util.Scanner;

import static Animals.AnimalTools.getCanineDetails;
import static Animals.AnimalTools.getFelineDetails;


public class AnimalApp {
    public static void main(String[] args) {

        System.out.println("Hello, and welcome to my 4-legged Friends Center, where we love all animals. :D Let's get started!");
        getCanineDetails();
        getFelineDetails();
        System.out.println("Come again next time to learn more >^.^<");

    }
}