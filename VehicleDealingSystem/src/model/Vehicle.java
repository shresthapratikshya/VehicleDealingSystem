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
public class Vehicle {
    private int id;
    private int category_id;
    private int s_id;
    private String v_name;
    private String v_model;
    private int modelYear;
    private String v_color;
    private int v_cost;
    private int v_engineNo;
    private double mileage;
    private String status;
    static int generateId = 0;

    public Vehicle(int category_id,int s_id, String v_name,String v_model, 
            int modelYear, String v_color, int v_cost, int v_engineNo,double mileage,
            String status) {
        id=generateId++;
        this.category_id=category_id;
        this.s_id=s_id;
        this.v_name = v_name;
        this.v_model = v_model;
        this.modelYear = modelYear;
        this.v_color = v_color;
        this.v_cost = v_cost;
        this.v_engineNo = v_engineNo;
        this.mileage=mileage;
        this.status=status;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id =id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_model() {
        return v_model;
    }

    public void setV_model(String v_model) {
        this.v_model = v_model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getV_color() {
        return v_color;
    }

    public void setV_color(String v_color) {
        this.v_color = v_color;
    }

    public int getV_cost() {
        return v_cost;
    }

    public void setV_cost(int v_cost) {
        this.v_cost = v_cost;
    }

    public int getV_engineNo() {
        return v_engineNo;
    }

    public void setV_engineNo(int v_engineNo) {
        this.v_engineNo = v_engineNo;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
   
}
