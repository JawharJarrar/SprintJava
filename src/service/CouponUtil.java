/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.Statement;
import entites.Coupon;
import java.util.List;
import Utils.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jamel_pc
 */
public class CouponUtil implements utilInterface{
    Connection conn;
    Statement stmt;
       
    
    public CouponUtil() {
        conn = DatabaseConnection.getInstance().getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CouponUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public boolean ajouterObject(Object p) {
        Coupon coupon = (Coupon)p;
        int i= 0;
        try {
            String req="INSERT INTO `Coupon` (`reference`, `img`) "
                    + "VALUES ('"+coupon.getReference()+"', "+coupon.getImg()+")";
            
         i= stmt.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(CouponUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(i>0)
            return true;
        
             return  false;
    }


    
    
    @Override
    public boolean modifierObject(Object p) {
        Coupon coupon = (Coupon)p;
        int i= 0;
        try {
            String req="UPDATE `coupon` SET `reference`="+coupon.getReference()+
                    ",`img`='"+coupon.getImg()+"' WHERE "+coupon.getId();     
            
         i= stmt.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(CouponUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(i>0)
            return true;
        
             return  false;
    }


    

    @Override
    public boolean supprimerObject(Object p) {


        Coupon coupon = (Coupon)p;
        int i= 0;
        try {
            String req="DELETE FROM `coupon` WHERE "+coupon.getId();
         i= stmt.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(CouponUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(i>0)
            return true;
        
             return  false;
    }

    @Override
    public List<Object> afficherObject() {
        
    List<Object> coupons = new ArrayList<>();
        Coupon c = null;
        try {
            String req3="select * from Personne";
            ResultSet res =  stmt.executeQuery(req3);
            while (res.next()) {                
       c = new Coupon(res.getInt("Id"),  res.getString("reference"), res.getString("img"));
           coupons.add(c);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Coupon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coupons;
    }
}
