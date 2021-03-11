import java.util.Scanner;

public class Person {

    private static String name;

    public String getName(){
//TODO: return the person's name
        System.out.println("Hi, can I get your name plz?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;

    }
    public String sayHello(String name){
//TODO: print a message to the console using the person's name
        return String.format("Hello, %s.", name);
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Ann";

        System.out.println(person1.name);
        System.out.println(person1.getName());
//        System.out.println(person1.setName());
//        System.out.println(person1.sayHello());



    }

}
