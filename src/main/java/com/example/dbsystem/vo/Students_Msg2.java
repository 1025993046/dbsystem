package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Student;

import java.util.List;

public class Students_Msg2 {
    private List<Student> data;
    private Meta meta;
    private int total;

    public Students_Msg2() {
    }

    public Students_Msg2(List<Student> data, Meta meta, int total) {
        this.data = data;
        this.meta = meta;
        this.total = total;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
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
