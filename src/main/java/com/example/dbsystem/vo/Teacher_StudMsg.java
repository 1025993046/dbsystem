package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Attend;

public class Teacher_StudMsg {
    private Attend data;
    private Meta meta;

    public Teacher_StudMsg() {
    }

    public Teacher_StudMsg(Attend data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public Attend getData() {
        return data;
    }

    public void setData(Attend data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
