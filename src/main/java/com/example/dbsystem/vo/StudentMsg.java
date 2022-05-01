package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Student;

public class StudentMsg {
    private Student data;
    private Meta meta;

    public StudentMsg() {
    }

    public StudentMsg(Student data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
