package com.example.dbsystem.vo;

public class Sum_Msg {
    private int data;
    private Meta meta;

    public Sum_Msg() {
    }

    public Sum_Msg(int data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
