package com.example.dbsystem.domain;

public class Teacher_course {
    private int sno;
    private int tno;

    @Override
    public String toString() {
        return "Teacher_course{" +
                "sno=" + sno +
                ", tno=" + tno +
                '}';
    }

    public Teacher_course() {
    }

    public Teacher_course(int sno, int tno) {
        this.sno = sno;
        this.tno = tno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }
}
