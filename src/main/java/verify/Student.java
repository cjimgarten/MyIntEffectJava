package verify;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student> {

    private String name;
    private double gpa;
    private List<String> courses;

    private Student(String name, double gpa, List<String> courses) {
        if (isInvalidStudent(name, gpa, courses)) {
            throw new IllegalArgumentException("Invalid student params");
        }
        this.name = name;
        this.gpa = gpa;
        this.courses = courses;
    }

    // cache for factory
    private static Map<String, Student> cache = new HashMap<>();

    // factory
    public static Student getStudent(String name, double gpa, List<String> courses) {
        String key = name+gpa;
        System.out.println("Key: "+key);
        Student found = cache.get(name);
        if (found == null) {
            found = new Student(name, gpa, courses);
            cache.put(key, found);
        }
        return found;
    }

    // builder
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private double gpa;
        private List<String> courses;

        private Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gpa(double gpa) {
            this.gpa = gpa;
            return this;
        }

        public Builder courses(List<String> courses) {
            this.courses = courses;
            return this;
        }

        public Student build() {
//            return new Student(this.name, this.gpa, this.courses);
            return Student.getStudent(this.name, this.gpa, this.courses);
        }
    }

    // initialization validation
    public static boolean isInvalidStudent(String name, double gpa, List<String> courses) {
        return name == null || name.isEmpty() || gpa > 4.0 || gpa < 0.0 || courses == null;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        String s = "{name:"+this.name + ", gpa:" + this.gpa + " coursesTaken:{";
        for (int i = 0; i < courses.size(); i++) {
            s += courses.get(i) + ", ";
        }
        s += "}}";
        return s;
    }

    @Override
    public int compareTo(Student s) {
        if (this.gpa > s.getGpa()) {
            return 1;
        } else if (this.gpa < s.getGpa()) {
            return -1;
        }
        return 0;
    }
}
