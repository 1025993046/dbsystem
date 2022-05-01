package com.example.dbsystem.vo;

public class AttendData {
    private int chuqin;
    private int chidao;
    private int zaotui;
    private int kuangke;
    private int qingjia;

    public AttendData() {
    }

    public AttendData(int chuqin, int chidao, int zaotui, int kuangke, int qingjia) {
        this.chuqin = chuqin;
        this.chidao = chidao;
        this.zaotui = zaotui;
        this.kuangke = kuangke;
        this.qingjia = qingjia;
    }

    public int getChuqin() {
        return chuqin;
    }

    public void setChuqin(int chuqin) {
        this.chuqin = chuqin;
    }

    public int getChidao() {
        return chidao;
    }

    public void setChidao(int chidao) {
        this.chidao = chidao;
    }

    public int getZaotui() {
        return zaotui;
    }

    public void setZaotui(int zaotui) {
        this.zaotui = zaotui;
    }

    public int getKuangke() {
        return kuangke;
    }

    public void setKuangke(int kuangke) {
        this.kuangke = kuangke;
    }

    public int getQingjia() {
        return qingjia;
    }

    public void setQingjia(int qingjia) {
        this.qingjia = qingjia;
    }
}
