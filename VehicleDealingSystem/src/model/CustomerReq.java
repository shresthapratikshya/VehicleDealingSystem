/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class CustomerReq {
    private int id;
    private int order_id;
    private int vehicle_id;
    static int generateId=0;

    public CustomerReq(int order_id,int vehicle_id) {
        id=generateId++;
        this.order_id=order_id;
        this.vehicle_id=vehicle_id;
    }

    public int getid() {
        return id;
    }

    public void setCustomerReq_id(int id) {
        this.id =id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }
    
    
    
    
}
