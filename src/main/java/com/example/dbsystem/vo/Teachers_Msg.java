package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Teacher;

import java.util.List;

public class Teachers_Msg {
    private List<Teacher> data;
    private Meta meta;

    public Teachers_Msg() {
    }

    public Teachers_Msg(List<Teacher> data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public List<Teacher> getData() {
        return data;
    }

    public void setData(List<Teacher> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
