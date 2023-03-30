/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.admin;

import assignment.DB;
import java.util.ArrayList;

/**
 *
 * @author LocalMachine
 */
public class Product {

    public Product() {

    }

    public static void fetchProducts() {
        DB db = new DB();
        ArrayList test = db.selectAllRecord("PRODUCT");
        ArrayList test2 = (ArrayList) test.get(0);
        System.out.println(test2.get(1));
    }
    
    //TODO image need different processing method to handle, port DB fetch table code to here and add on

    public static void main(String[] args) {

    }
}
