/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.admin;

import assignment.DB;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author LocalMachine
 */
public class Product extends DB {

    public Product() {

    }

    public static void fetchProducts() {
        DB db = new DB();
        ArrayList test = db.selectAllRecord("PRODUCT");
        ArrayList test2 = (ArrayList) test.get(0);
        System.out.println(test2.get(1));
    }

    public ArrayList<ArrayList> selectAllRecord(String table) {
        String queryStr = "SELECT * FROM " + table;
        ArrayList<ArrayList> arr = new ArrayList<>();
        ResultSet rs = null;
        try {
            // Next to jump to first row because dumbass java starts at row 0
            stmt = conn.prepareStatement(queryStr);
            rs = stmt.executeQuery();

            while (rs.next()) {
                ArrayList innerArr = new ArrayList();
                innerArr.add(rs.getString("PRODUCT_ID"));
                innerArr.add(rs.getString("PRODUCT_NAME"));
                innerArr.add(rs.getString("PRODUCT_PRICE"));
                innerArr.add(rs.getString("QUANTITY"));
                Blob blob = rs.getBlob("PRODUCT_IMAGE");
                byte[] data = blob.getBytes(1, (int) blob.length());
                String base64 = DatatypeConverter.printBase64Binary(data);
                innerArr.add(base64);
                
                arr.add(innerArr);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        shutDown();
        return arr;
    }

    //TODO image need different processing method to handle, port DB fetch table code to here and add on
    public static void main(String[] args) {

    }
}
