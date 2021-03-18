package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        return (double) grades.stream().reduce(Integer::sum).get() / grades.size();
    }
//
//    private String name;
//    private List<Integer> grades;
//
//    public Student(String name) {
//        this.name = name;
//        this.grades = new ArrayList<>();
//    }
//
//    public String getName(String name) {
//        return name;
//    }
//
//    public void addGrade(int grade) {
//        grades.add(grade);
//    }
//
//
//    public double getGradeAverage() {
//        int sum = 0;
//            for (Integer grade : grades) {
//                 sum += grade;
//            }
//            return (double) sum / grades.size();
////        return (double) grades.stream().reduce(Integer::sum).get() / grades.size();
//    }


//    public static void main(String[] args) {
//
//
//        Student x = new Student("Xavier", grades);
//        ArrayList<Integer> grades = new ArrayList<>();
//        getName("Xavier");
//        x.grades.add(70);
//        x.grades.add(100);
//        x.grades.add(95);
//        System.out.println(x.name + Student.grades);
//        System.out.println(x.getGradeAverage());
//
//    }

}
