package demo.springboot.web;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "S001");
        Student student2 = new Student("Bob", 22, "S002");

        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Systems");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(course1.getStudents());
        System.out.println(course2.getStudents());
    }
}
