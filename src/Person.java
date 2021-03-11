import java.util.Scanner;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;

    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println(this.name + " says hi!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ann");
        person1.sayHello();
        person1.setName("Michelle");
        person1.sayHello();
        System.out.println(person1.getName());

    }

}
