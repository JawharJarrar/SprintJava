/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintjava;

import Utils.DatabaseConnection;
import entites.Coupon;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.CouponUtil;

/**
 *
 * @author jamel_pc
 */
public class SprintJava {

    /**
     * @param args the command line arguments
     */    static final String jdbcDriver = "com.mysql.jdbc.Driver";
    static String url="jdbc:mysql://localhost:3306/pidev3?useSSL=false";
    static String username="root";
    static String password="";
     
    
    public static void main(String[] args) throws SQLException {
                 
        Coupon coupon = new Coupon(1);
        CouponUtil CU = new CouponUtil();
        CU.supprimerObject(coupon);
        
    }
}
