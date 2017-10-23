package com.hhmhieu.vnuklmslogin;

/**
 * Created by Tran Viet Thanh on 10/23/2017.
 */

public class Course {
    private int idCourse;
    private String nameCourse;
    private String className;

    public Course() {
    }

    public Course(int idCourse, String nameCourse, String className) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.className = className;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
