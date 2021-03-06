package com.example.dbsystem.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    /**
     * 定义成员变量 DataSource
     */
    private static DataSource dataSource;
    static {
        try {
            //加载配置文件
            Properties pro=new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            //获取DataSource
            dataSource= DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接方法
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }


    /**
     * 获取连接池方法
     */
    public static DataSource getDataSource(){
        return dataSource;
    }

    /**
     * 释放资源
     */
    public static void close(Statement statement , Connection connection){
        close(null,statement,connection);
    }



    /**
     * 释放资源
     */
    public static void close(ResultSet resultSet, Statement statement , Connection connection){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                //归还连接
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
