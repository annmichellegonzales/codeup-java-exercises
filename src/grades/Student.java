package grades;

import java.util.ArrayList;

public class Student {

    private static ArrayList<Integer> grades;
    private String name;


    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades=grades;
    }



    // returns the student's name
    public static String getName(String name) {
        return name;
    }

    public static void addGrade(int grade) {
//        return getGradeAverage(grades.add(grade));
    }

    // returns the average of the students grades
    public static double getGradeAverage(double average) {
//        for (grades grade : )

    }

    public static void main(String[] args) {

        Student a = new Student("Ann", grades);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(88);
        grades.add(100);
        grades.add(70);

        System.out.println(a.name);
        System.out.println(grades);
        System.out.println(a.grades);
        getName("Ann");
        System.out.println(getName("Ann"));




    }


}
