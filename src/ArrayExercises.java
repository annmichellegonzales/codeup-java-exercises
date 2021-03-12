import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {

//        simpsons();
        addSimpson(simpsons());


//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        String[] simpsons = {"Lisa", "Bart", "Maggie"};

//        Person[] simpsons = new Person[3];
//        simpsons[0] = new Person("Lisa");
//        simpsons[1] = new Person("Bart");
//        simpsons[2] = new Person("Maggie");
//        for (int i = 0; i < simpsons.length; i++) {
//            System.out.println(simpsons[i].getName());

//            for (Person simpson : simpsons) {
//                System.out.println(simpson.getName());
//            }

//        }

    }

    public static String[] simpsons() {
        String[] simpsons = {"Lisa", "Bart", "Maggie"};
        System.out.println(Arrays.toString(simpsons));
        return simpsons;
    }

    public static String[] addSimpson(String[] arr) {
//        Arrays.fill(arr, "Sideshow Bob");
//        System.out.println(Arrays.toString(arr));

        String[] simpsons = new String[3];
        simpsons[3] = new String("Marge");
        System.out.println(simpsons[3]);
        return simpsons;
    }

}





// i got a social security number LOL Arrays.toString is necessary because of that.
