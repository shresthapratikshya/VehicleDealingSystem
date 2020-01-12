/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import java.sql.Date;

import java.util.Date;


/**
 *
 * @author DELL
 */
public class Orders {
    private int id;
    private int c_id;
    private int vehicle_id;
    private String order_date;
    static int generateId=0;

    public Orders(int id,int c_id,int vehicle_id,String order_date) {
        id=generateId++;
        this.c_id=c_id;
        this.vehicle_id=vehicle_id;
        this.order_date=order_date;
        
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id =id;
    }

//    public Date getOrder_date() {
//        return order_date;
//    }
//
//    public void setOrder_date(Date order_date) {
//        this.order_date = order_date;
//    }
//    

    public String getorder_Date() {
        return order_date;
    }

    public void setDate(String order_date) {
        this.order_date = order_date;
    }
    
    
}
