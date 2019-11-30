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

	/*@ spec_public @*/Connection conn = null;
	/*@ spec_public @*/String DB_USER;
	/*@ spec_public @*/String DB_PWD;
	/*@ spec_public @*/String DB_URL;
	/*@ spec_public @*/String JDBC_DRIVER;

	 /*@ requires flag == 1 || flag == 2;
	@*/
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

    /*@ requires conn == null;
   	@*/
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
