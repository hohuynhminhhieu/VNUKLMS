package com.hhmhieu.vnuklmslogin;

/**
 * Created by Tran Viet Thanh on 10/22/2017.
 */

public class LectureNote {
    private int id;
    private String name;
    private int idCourse;
    private int date;
    private String link;
    private String description;

    public LectureNote() {
    }

    public LectureNote(int id, String name, int idCourse, int date, String link, String description) {
        this.id = id;
        this.name = name;
        this.idCourse = idCourse;
        this.date = date;
        this.link = link;
        this.description = description;
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

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
