package inheritanceLecture.vehicle;

public class Person {

    public String name;

//    public Person(String name) {
//        this.name = name;
//    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void sayHello() {
        System.out.println(this.name + " says hi!");
    }
}