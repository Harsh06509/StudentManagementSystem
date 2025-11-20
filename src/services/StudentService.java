package services;

import models.Student;
import utils.FileHandler;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final String file = "data/students.txt";
    private List<Student> students = new ArrayList<>();

    public StudentService() {
        List<String> lines = FileHandler.readFile(file);
        for(String line : lines) {
            students.add(Student.fromString(line));
        }
    }

    public void addStudent(Student s) {
        students.add(s);
        save();
    }

    public void updateStudent(Student s) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(s.getId())) {
                students.set(i, s);
                save();
                return;
            }
        }
    }

    public void deleteStudent(String id) {
        students.removeIf(s -> s.getId().equals(id));
        save();
    }

    public List<Student> getAllStudents() {
        return students;
    }

    private void save() {
        List<String> lines = new ArrayList<>();
        for(Student s : students) lines.add(s.toString());
        FileHandler.writeFile(file, lines);
    }
}
