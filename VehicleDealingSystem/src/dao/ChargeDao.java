/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Charge;

/**
 *
 * @author DELL
 */
public interface ChargeDao {
    ArrayList<Charge> getAllCharge();
    void fetchCustomerDatabase() throws SQLException;
    Charge getCharge(int id);
    void addCharge(int id, String v_name, String v_model, int modelYear, String v_engineNo, double mileage, String v_color, int v_cost, int category_price) throws SQLException;
    void updateCharge(int id, String v_name, String v_model, int modelYear, String v_engineNo, double mileage, String v_color, int v_cost, int category_price);
    void deleteCharge(int id);
}
