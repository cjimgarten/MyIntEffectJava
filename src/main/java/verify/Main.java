package verify;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> courses = new ArrayList(
                List.of("Math","Physics","Computers","Music")
        );

        // using factory
        Student s1 = Student.getStudent("Ted", 3.2, courses);

        // using builder
        Student.Builder b = Student.builder();
        b.name("Nancy");
        b.gpa(2.4);
        b.courses(courses);
        Student s2 = b.build();

        // using builder with chaining syntax
        Student s3 = Student.builder()
                .name("Fred")
                .gpa(2.8)
                .courses(courses)
                .build();

        // building duplicate
        Student s4 = Student.builder().name("Nancy").gpa(3.9).courses(courses).build();

        // print output
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        Student smartest = s1;
        if (smartest.compareTo(s2) < 0) {
            smartest = s2;
        }
        if (smartest.compareTo(s3) < 0) {
            smartest = s3;
        }
        System.out.println(smartest);
    }
}
