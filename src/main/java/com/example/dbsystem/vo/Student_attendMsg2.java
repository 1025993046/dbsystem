package com.example.dbsystem.vo;

import com.example.dbsystem.domain.Attend;

import java.util.List;

public class Student_attendMsg2 {
    private List<Attend> data;
    private Meta meta;
    private int pagenum;
    private int total;

    public Student_attendMsg2() {
    }

    public Student_attendMsg2(List<Attend> data, Meta meta, int pagenum, int total) {
        this.data = data;
        this.meta = meta;
        this.pagenum = pagenum;
        this.total = total;
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

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
