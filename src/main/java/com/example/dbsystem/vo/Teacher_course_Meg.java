package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Teacher_course;

public class Teacher_course_Meg {
    private Teacher_course data;
    private Meta meta;

    public Teacher_course_Meg() {
    }

    public Teacher_course_Meg(Teacher_course data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public Teacher_course getData() {
        return data;
    }

    public void setData(Teacher_course data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
