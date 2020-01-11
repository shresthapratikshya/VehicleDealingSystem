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
public class Customer {
    private int id;
    private String c_username;
    private String c_email;
    private int c_mobile;
    private String c_address;
    static int generateId = 0;

    public Customer(String c_username, String email, int c_mobile, String c_address) {
        id=generateId++;
        this.c_username = c_username;
        this.c_email = email;
        this.c_mobile = c_mobile;
        this.c_address = c_address;
    }

    public int getid() {
        return id;
    }

    public void setC_id(int c_id) {
        this.id = id;
    }

    public String getC_username() {
        return c_username;
    }

    public void setC_username(String c_username) {
        this.c_username = c_username;
    }

    public String getEmail() {
        return c_email;
    }

    public void setEmail(String email) {
        this.c_email = email;
    }

    public int getC_mobile() {
        return c_mobile;
    }

    public void setC_mobile(int c_mobile) {
        this.c_mobile = c_mobile;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }
 
}
