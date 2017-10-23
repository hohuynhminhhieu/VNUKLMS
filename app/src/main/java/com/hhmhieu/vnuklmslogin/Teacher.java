package com.hhmhieu.vnuklmslogin;


public class Teacher {
    private int id;
    private String name;
    private String nameCourse;

    public Teacher() {
    }

    public Teacher(int id, String name, String nameCourse) {
        this.id = id;
        this.name = name;
        this.nameCourse = nameCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }
}
