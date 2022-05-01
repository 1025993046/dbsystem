package com.example.dbsystem.vo;

public class Student_grade {
    private int sno;
    private int cno;
    private int grade;
    private String sname;
    private String cname;

    @Override
    public String toString() {
        return "Student_grade{" +
                "sno=" + sno +
                ", cno=" + cno +
                ", grade=" + grade +
                ", sname='" + sname + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Student_grade() {
    }

    public Student_grade(int sno, int cno, int grade, String sname, String cname) {
        this.sno = sno;
        this.cno = cno;
        this.grade = grade;
        this.sname = sname;
        this.cname = cname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
