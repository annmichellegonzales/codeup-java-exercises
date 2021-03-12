package inheritanceLecture.vehicle;

public class InheritanceLecture {
    public static void main(String[] args) {


        Person p = new Person(); //invoking constructor
        p.name = "Ann";

        Employee e = new Employee();
        e.name = "Michelle";
        e.employeeNumber = 1001;
        e.stateEmployeeNumber();


//        System.out.println(p); //reference id
//        System.out.println(p.name); //null
//        System.out.println(e.name);
//        System.out.println(e.getName());

    }
}
