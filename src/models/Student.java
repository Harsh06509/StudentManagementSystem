package models;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private String courseId;

    public Student(String id, String name, int age, String courseId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courseId = courseId;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourseId() { return courseId; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + courseId;
    }

    public static Student fromString(String str) {
        String[] parts = str.split(",");
        return new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
    }
}
