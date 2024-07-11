package demo.springboot.issues;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private List<Course> courses;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }
}
