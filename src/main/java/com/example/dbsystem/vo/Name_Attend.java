package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Attend;

import java.util.List;

public class Name_Attend {
    private List<Attend> data;
    private Meta meta;

    public Name_Attend() {
    }

    public Name_Attend(List<Attend> data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public List<Attend> getData() {
        return data;
    }

    public void setData(List<Attend> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
