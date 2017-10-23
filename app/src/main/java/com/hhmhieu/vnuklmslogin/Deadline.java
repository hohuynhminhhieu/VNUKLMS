package com.hhmhieu.vnuklmslogin;

/**
 * Created by Tran Viet Thanh on 10/22/2017.
 */

public class Deadline {
    private int id;
    private String name;
    private int idCourse;
    private String time;
    private String description;

    public Deadline() {
    }

    public Deadline(int id, String name, int idCourse, String time, String description) {
        this.id = id;
        this.name = name;
        this.idCourse = idCourse;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   /* public String formatTime(String date1){
        DateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        date1 = sp.format(time);
        return date1;
    } */
}
