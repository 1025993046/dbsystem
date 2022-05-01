package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Course;

import java.util.List;

public class Courses_Msg {
    private List<Course> data;
    private Meta meta;

    public Courses_Msg() {
    }

    public Courses_Msg(List<Course> data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public List<Course> getData() {
        return data;
    }

    public void setData(List<Course> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
