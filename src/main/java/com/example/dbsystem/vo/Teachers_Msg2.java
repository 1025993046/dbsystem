package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Teacher;

import java.util.List;

public class Teachers_Msg2 {
    private List<Teacher> data;
    private Meta meta;
    private int total;

    public Teachers_Msg2() {
    }

    public Teachers_Msg2(List<Teacher> data, Meta meta, int total) {
        this.data = data;
        this.meta = meta;
        this.total = total;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
