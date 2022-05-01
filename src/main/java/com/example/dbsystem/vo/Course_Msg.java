package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Course;

public class Course_Msg {
    private Course data;
    private Meta meta;

    public Course_Msg() {
    }

    public Course_Msg(Course data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public Course getData() {
        return data;
    }

    public void setData(Course data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
