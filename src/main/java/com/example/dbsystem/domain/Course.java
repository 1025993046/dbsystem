package com.example.dbsystem.domain;

public class Course {
    private int cno;
    private String name;

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", name='" + name + '\'' +
                '}';
    }

    public Course() {
    }

    public Course(int cno, String name) {
        this.cno = cno;
        this.name = name;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
