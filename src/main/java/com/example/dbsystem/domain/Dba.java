package com.example.dbsystem.domain;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dba {

    private String name;
    private String sex;
    private int dbano;
    private String password;

    @Override
    public String toString() {
        return "Dba{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dbano=" + dbano +
                ", password='" + password + '\'' +
                '}';
    }

    public Dba() {
    }

    public Dba(String name, String sex, int dbano, String password) {
        this.name = name;
        this.sex = sex;
        this.dbano = dbano;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDbano() {
        return dbano;
    }

    public void setDbano(int dbano) {
        this.dbano = dbano;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
