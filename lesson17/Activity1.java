package lesson17;

import java.util.ArrayList;

class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public double getGPA() {
        if (courses.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (Course course : courses) {
            total += course.getGrade();
        }
        return total / courses.size();
    }

    public String getTranscript() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("ID: ").append(id).append("\n");
        for (Course course : courses) {
            sb.append("Course: ").append(course.getName())
              .append(" (").append(course.getCredits()).append(" credits) ")
              .append("Grade: ").append(course.getGrade())
              .append(" (").append(course.getLetterGrade()).append(")\n");
        }
        return sb.toString().trim();
    }
}

class Course {
    private String name;
    private int credits;
    private double grade;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getLetterGrade() {
        if (grade >= 4.0) return "A";
        if (grade >= 3.7) return "A-";
        if (grade >= 3.3) return "B+";
        if (grade >= 3.0) return "B";
        if (grade >= 2.7) return "B-";
        if (grade >= 2.3) return "C+";
        if (grade >= 2.0) return "C";
        if (grade >= 1.0) return "D";
        return "F";
    }
}

public class Activity1 {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 1234);
        Course cs = new Course("Computer Science", 4);
        cs.setGrade(3.7);
        alice.addCourse(cs);
        System.out.println("Alice GPA: " + alice.getGPA());

        Course math = new Course("Math", 3);
        math.setGrade(4.0);
        alice.addCourse(math);
        System.out.println("Alice Updated GPA: " + alice.getGPA());
        System.out.println();
        System.out.println(alice.getTranscript());
        System.out.println();

        Student bob = new Student("Bob", 5678);
        Course bobCs = new Course("Computer Science", 4);
        bobCs.setGrade(3.0);
        Course bobMath = new Course("Math", 3);
        bobMath.setGrade(3.5);
        bob.addCourse(bobCs);
        bob.addCourse(bobMath);

        System.out.println("Bob GPA: " + bob.getGPA());
        System.out.println();
        System.out.println(bob.getTranscript());
    }
}