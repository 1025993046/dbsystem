package com.example.dbsystem.vo;

public class Meta {
    private String msg;
    private int status;

    @Override
    public String toString() {
        return "Meta{" +
                "msg='" + msg + '\'' +
                ", status=" + status +
                '}';
    }

    public Meta() {
    }

    public Meta(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
