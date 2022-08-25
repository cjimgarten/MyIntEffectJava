package school;

import java.util.*;

public class Student {

    private String name;
    private double gpa;
    private Set<String> courses;

    private Student(String name, double gpa, Set<String> courses) {
        this.name=name;
        this.gpa=gpa;
        this.courses=courses;
    }

    public static Student getStudent(String name, double gpa, String... courses) {
        Set<String> data = new HashSet<>(Arrays.asList(courses));
        data = Collections.unmodifiableSet(data);
        return new Student(name, gpa, data);
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    public Set<String> getCourses() {
        return this.courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa, courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", courses=" + courses +
                '}';
    }
}
