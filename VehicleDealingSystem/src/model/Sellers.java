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
public class Sellers {
    private int id;
    private String s_username;
    private String s_mobile;
    private String email;
    private String s_address;
   

    public Sellers(int id,String s_username,String email,String s_mobile, String s_address) {
        this.id=id;
        this.s_username = s_username;
        this.email=email;
        this.s_mobile = s_mobile;
        this.s_address = s_address;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getS_username() {
        return s_username;
    }

    public void setS_username(String s_username) {
        this.s_username = s_username;
    }

    public String getS_mobile() {
        return s_mobile;
    }

    public void setS_mobile(String s_mobile) {
        this.s_mobile = s_mobile;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
