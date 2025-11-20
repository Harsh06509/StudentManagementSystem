package services;

import models.Course;
import utils.FileHandler;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private final String file = "data/courses.txt";
    private List<Course> courses = new ArrayList<>();

    public CourseService() {
        List<String> lines = FileHandler.readFile(file);
        for(String line : lines) {
            courses.add(Course.fromString(line));
        }
    }

    public void addCourse(Course c) {
        courses.add(c);
        save();
    }

    public void updateCourse(Course c) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().equals(c.getId())) {
                courses.set(i, c);
                save();
                return;
            }
        }
    }

    public void deleteCourse(String id) {
        courses.removeIf(c -> c.getId().equals(id));
        save();
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    private void save() {
        List<String> lines = new ArrayList<>();
        for(Course c : courses) lines.add(c.toString());
        FileHandler.writeFile(file, lines);
    }
}
