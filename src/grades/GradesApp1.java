package grades;

import util.Input1;

import java.util.HashMap;
import java.util.Map;

// TODO: I can't seem to start the application. Help!
// TODO: Even when it was running, it never let me enter in more than one student before exiting.
// TODO: The grade average is WAY too precise. It only needs to display to two decimal places.
// TODO: Why do I keep seeing information for Fred when I search for Cathy's info?
class GradesApplication1 {

    private final Map<String, Student1> students;
    private final Input1 input;

    public GradesApplication1(Map<String, Student1> students, Input1 input) {
        this.students = students;
        this.input = input;
    }

    // Starts App
    public void init1() {
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
        for (Map.Entry<String, Student1> entry : students.entrySet()) {
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
    private static HashMap<String, Student1> createStudents() {

        HashMap<String, Student1> students = new HashMap<>();

        Student1 s1 = new Student1("Fred");
        s1.addGrade(0);
        s1.addGrade(50);
        s1.addGrade(100);

        Student1 s2 = new Student1("Cathy");
        s2.addGrade(50);
        s2.addGrade(50);
        s2.addGrade(75);

        Student1 s3 = new Student1("Bob");
        s3.addGrade(80);
        s3.addGrade(20);
        s3.addGrade(100);

        students.put("fred123", s1);
        students.put("cathy123", s2);
        students.put("bob123", s3);

        return students;

    }

    public static void main(String[] args) {
        GradesApplication1 ga = new GradesApplication1(createStudents(), new Input1());
        ga.init1();
    }

}