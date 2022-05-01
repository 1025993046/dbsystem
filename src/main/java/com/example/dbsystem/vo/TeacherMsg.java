package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Teacher;

public class TeacherMsg {
    private Teacher data;
    private Meta meta;

    public TeacherMsg() {
    }

    public TeacherMsg(Teacher data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public Teacher getData() {
        return data;
    }

    public void setData(Teacher data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
