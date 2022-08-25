package school;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class School {
    public static void main(String[] args) {
        Set<Student> roster = new HashSet<>(Arrays.asList(
                Student.getStudent("Fred", 3.2, "Math", "Programming", "Physics"),
                Student.getStudent("Jill", 2.9, "Journalism"),
                Student.getStudent("Hannah", 3.4, "Math", "Chemistry", "Biology", "Physics"),
                Student.getStudent("John", 2.2, "Liberal Studies", "Math")
                )
        );
    }
}
