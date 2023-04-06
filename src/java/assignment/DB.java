/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author LocalMachine
 */
//CREATE TABLE "CUSTOMER"
//(    
//   "customer_id" INT not null primary key
//        GENERATED ALWAYS AS IDENTITY
//        (START WITH 1, INCREMENT BY 1),   
//   "customer_name" VARCHAR(50));
public class DB {

    private String host = "jdbc:derby://localhost:1527/AMIT3094_Assignment";
    private String user = "nbuser";
    private String password = "nbuser";
    protected Connection conn;
    protected PreparedStatement stmt;

    public DB() {
        createConnection();
    }

    protected void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    protected void shutDown() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public ArrayList<ArrayList> selectAllRecord(String table) {
        String queryStr = "SELECT * FROM " + table;
        ArrayList<ArrayList> arr = new ArrayList<>();
        ResultSet rs = null;
        String data = "";
        try {
            // Next to jump to first row because dumbass java starts at row 0
            stmt = conn.prepareStatement(queryStr);
            rs = stmt.executeQuery();

            while (rs.next()) {
                ArrayList innerArr = new ArrayList();
                int colCount = rs.getMetaData().getColumnCount();
                for (int i = 1; i <= colCount; i++) {
                    innerArr.add(rs.getString(i));
                }
                arr.add(innerArr);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        shutDown();
        return arr;
    }

}
