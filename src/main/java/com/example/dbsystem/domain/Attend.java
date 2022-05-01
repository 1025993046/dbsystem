package com.example.dbsystem.domain;

public class Attend {
    private int sno;
    private String name;
    private String classname;//1
    private String attend;
    private String time;//2
    private String course;//3

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "Attend{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", attend='" + attend + '\'' +
                ", time='" + time + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public Attend() {
    }

    public Attend(int sno, String name, String classname, String attend, String time, String course) {
        this.sno = sno;
        this.name = name;
        this.classname = classname;
        this.attend = attend;
        this.time = time;
        this.course = course;
    }
}
