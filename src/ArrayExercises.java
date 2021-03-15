import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];
        people[0] = new Person("Lisa");
        people[1] = new Person("Bart");
        people[2] = new Person("Maggie");


        for (Person person : people) {
            System.out.println(person.getName());
        }


        people = addPerson(people, new Person("Marge"));
        for (int i = 0; i < people.length; i++)
            System.out.println(people[i].getName());

    }




    public static Person[] addPerson(Person[] people, Person person) {

        Person[] newArr = Arrays.copyOf(people, people.length + 1);
        newArr[newArr.length -1] = person;
        return newArr;
    }
}




//    public static String[] people() {
//        String[] simpsons = {"Lisa", "Bart", "Maggie"};
//        System.out.println(Arrays.toString(simpsons));
//        return simpsons;
//    }

// i got a social security number LOL Arrays.toString is necessary because of that.
//        String[] simpsons = {"Lisa", "Bart", "Maggie"};
//        for (int i = 0; i < simpsons.length; i++) {
//        System.out.println(simpsons[i].getName());
