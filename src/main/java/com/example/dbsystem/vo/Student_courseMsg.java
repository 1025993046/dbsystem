package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Student_course;

import java.util.List;

public class Student_courseMsg {
    private List<Student_course> data;
    private Meta meta;

    public Student_courseMsg() {
    }

    public Student_courseMsg(List<Student_course> data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public List<Student_course> getData() {
        return data;
    }

    public void setData(List<Student_course> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
