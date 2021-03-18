package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;


public class GradesApplication {
    private final Map<String, Student> students;
    private final Input input;

    public GradesApplication(Map<String, Student> students, Input input) {
        this.students = students;
        this.input = input;
    }

    // Starts App
    public void init() {
        System.out.println("Welcome!");
        runInteraction();
    }

    // Abstracts the Part that Repeats
    private void runInteraction() {
        System.out.println(getStudentsList());
        System.out.println("\nWhat student would you like to see more information on?");
        String response = input.getString();
        if (students.containsKey(response)) {
            System.out.println(getStudentInfo(response));
        } else {
            System.out.println("\nSorry, no student found with the GitHub username of " + response);
        }
        System.out.println("\nWould you like to enter a new response?");
        boolean willContinue = input.yesNo();
        if (willContinue) {
            runInteraction();
        } else {
            System.out.println("\nGoodbye!");
        }
    }

    // Returns a message containing a list of students
    private String getStudentsList() {
        String output = "Here are the user names of our students:\n\n";
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            output += "|" + entry.getKey() + "| ";
        }
        return "\n" + output.trim();
    }

    // Returns a formatted message containing student information
    private String getStudentInfo(String username) {
        return String.format(
                "%nName: %s - GitHub Username: %s%nCurrent Average: %.2f",
                students.get(username).getName(),
                username,
                students.get(username).getGradeAverage());
    }

    // Used to populate the HashMap of students
    private static HashMap<String, Student> createStudents() {

        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Fred");
        s1.addGrade(0);
        s1.addGrade(50);
        s1.addGrade(100);

        Student s2 = new Student("Cathy");
        s2.addGrade(50);
        s2.addGrade(50);
        s2.addGrade(75);

        Student s3 = new Student("Bob");
        s3.addGrade(80);
        s3.addGrade(20);
        s3.addGrade(100);

        students.put("fred123", s1);
        students.put("cathy123", s2);
        students.put("bob123", s3);

        return students;

    }

    public static void main(String[] args) {
        GradesApplication ga = new GradesApplication(createStudents(), new Input());
        ga.init();
    }




//        var j = new Student("Jean", grades);
//        j.addGrade(70);
//        j.addGrade(95);
//        j.addGrade(100);
//        students.put(j, "phoenix");
//
//        var l = new Student("Logan", grades);
//        l.addGrade(60);
//        l.addGrade(50);
//        l.addGrade(100);
//        students.put(l, "wolverine");
//
//        var o = new Student("Ororo", grades);
//        o.addGrade(100);
//        o.addGrade(99);
//        o.addGrade(100);
//        students.put(o, "storm");
//
//        var s = new Student("Scott", grades);
//        s.addGrade(80);
//        s.addGrade(95);
//        s.addGrade(89);
//        students.put(s, "cyclops");

//        System.out.println(students);
//        System.out.println();

//        int student = 1;
//        String studentString;
//        switch (student) {
//            case 1:
//                studentString = "Jean";
//                break;
//            case 2:
//                studentString = "Logan";
//                break;
//            case 3:
//                studentString = "Ororo";
//                break;
//            case 4:
//                studentString = "Scott";
//                break;
//            default:
//                studentString = "Sorry, no student found with the GitHub username of \"\".";
//        System.out.println(studentString);

}


