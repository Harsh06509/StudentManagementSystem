package models;

import java.io.Serializable;

public class Course implements Serializable {
    private String id;
    private String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return id + "," + name;
    }

    public static Course fromString(String str) {
        String[] parts = str.split(",");
        return new Course(parts[0], parts[1]);
    }
}
