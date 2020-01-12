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
public class CustomerVehicleOrders {
    private int o_id;
    private String c_username;
    private String v_name;

    public CustomerVehicleOrders(int o_id, String c_username, String v_name) {
        this.o_id = o_id;
        this.c_username = c_username;
        this.v_name = v_name;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public String getC_username() {
        return c_username;
    }

    public void setC_username(String c_username) {
        this.c_username = c_username;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }
    
   
    
}
