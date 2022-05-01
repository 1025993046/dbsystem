package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Student_course;

public class UpStudent_Grage {
    private Student_course data;
    private Meta meta;

    public UpStudent_Grage() {
    }

    public UpStudent_Grage(Student_course data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public Student_course getData() {
        return data;
    }

    public void setData(Student_course data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
