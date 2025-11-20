import models.Student;
import models.Course;
import services.StudentService;
import services.CourseService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Update Student\n4. Delete Student");
            System.out.println("5. Add Course\n6. View Courses\n7. Update Course\n8. Delete Course\n9. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Age: "); int age = sc.nextInt(); sc.nextLine();
                    System.out.print("Course ID: "); String courseId = sc.nextLine();
                    studentService.addStudent(new Student(id, name, age, courseId));
                }
                case 2 -> studentService.getAllStudents().forEach(System.out::println);
                case 3 -> {
                    System.out.print("ID to update: "); String id = sc.nextLine();
                    System.out.print("New Name: "); String name = sc.nextLine();
                    System.out.print("New Age: "); int age = sc.nextInt(); sc.nextLine();
                    System.out.print("New Course ID: "); String courseId = sc.nextLine();
                    studentService.updateStudent(new Student(id, name, age, courseId));
                }
                case 4 -> {
                    System.out.print("ID to delete: "); String id = sc.nextLine();
                    studentService.deleteStudent(id);
                }
                case 5 -> {
                    System.out.print("Course ID: "); String cid = sc.nextLine();
                    System.out.print("Course Name: "); String cname = sc.nextLine();
                    courseService.addCourse(new Course(cid, cname));
                }
                case 6 -> courseService.getAllCourses().forEach(System.out::println);
                case 7 -> {
                    System.out.print("Course ID to update: "); String cid = sc.nextLine();
                    System.out.print("New Course Name: "); String cname = sc.nextLine();
                    courseService.updateCourse(new Course(cid, cname));
                }
                case 8 -> {
                    System.out.print("Course ID to delete: "); String cid = sc.nextLine();
                    courseService.deleteCourse(cid);
                }
                case 9 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
