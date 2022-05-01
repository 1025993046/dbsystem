package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Course;

import java.util.List;

public class Courses_Msg2 {
    private List<Course> data;
    private Meta meta;
    private int total;

    public Courses_Msg2() {
    }

    public Courses_Msg2(List<Course> data, Meta meta, int total) {
        this.data = data;
        this.meta = meta;
        this.total = total;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
