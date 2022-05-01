package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Student;

import java.util.List;

public class Students_Msg {
    private List<Student> data;
    private Meta meta;

    public Students_Msg() {
    }

    public Students_Msg(List<Student> data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
