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
public class Charge {
    private int id;
    private String v_name;
    private String v_model;
    private int modelYear;
    private String v_engineNo;
    private double mileage;
    private String v_color;
    private int v_cost;
    private int category_price;

    public Charge(int id, String v_name, String v_model, int modelYear, String v_engineNo, double mileage, String v_color, int v_cost, int category_price) {
        this.id = id;
        this.v_name = v_name;
        this.v_model = v_model;
        this.modelYear = modelYear;
        this.v_engineNo = v_engineNo;
        this.mileage = mileage;
        this.v_color = v_color;
        this.v_cost = v_cost;
        this.category_price = category_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getV_engineNo() {
        return v_engineNo;
    }

    public void setV_engineNo(String v_engineNo) {
        this.v_engineNo = v_engineNo;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
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

    public int getCategory_price() {
        return category_price;
    }

    public void setCategory_price(int category_price) {
        this.category_price = category_price;
    }
    
    
}
