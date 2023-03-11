/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author LocalMachine
 */
public class DB {

    private String host = "jdbc:derby://localhost:1527/AMIT3094_Assignment";
    private String user = "APP";
    private String password = "admin";
    private Connection conn;
    private PreparedStatement stmt;

    public DB() {
        createConnection();
    }

    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void shutDown() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public String selectAllRecord(String table) {
        String queryStr = "SELECT * FROM " + table;
        ResultSet rs = null;
        String data = "";
        try {
            // Next to jump to first row because dumbass java starts at row 0
            stmt = conn.prepareStatement(queryStr);
            rs = stmt.executeQuery();
            rs.next();
            data = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        shutDown();
        return data;
    }
//    
//    public static void main(String [] args){
//        DB db = new DB();
//        db.createConnection();
//        System.out.println(db.selectAllRecord("customer"));
//    }

}
