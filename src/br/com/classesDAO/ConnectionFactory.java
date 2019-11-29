/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classesDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rayane
 */
public class ConnectionFactory {

    Connection conn = null;
    String DB_USER;
    String DB_PWD;
    String DB_URL;
    String JDBC_DRIVER;

    public Connection getConnection(int flag) {
        try {
            if (flag == 1) {
                DB_URL = "jdbc:postgresql://localhost:5432/BANCO_SUPREMO";
                DB_USER = "postgres";
                DB_PWD = "homologacao";
            } else if (flag == 2) {
                DB_URL = "jdbc:oracle:thin:@localhost:8080";
                DB_USER = "admin";
                DB_PWD = "123";
            }
            if (conn == null) {
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConn() {
        try {
            if (!conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn = null;
    }
}
