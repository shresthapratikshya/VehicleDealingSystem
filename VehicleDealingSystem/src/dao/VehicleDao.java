/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Vehicle;

/**
 *
 * @author DELL
 */
public interface VehicleDao {
    ArrayList<Vehicle> getallVehicle();
    void fetchVehicleDatabase() throws SQLException;
    Vehicle getVehicle(int vehicle_id);
    void addVehicle(int category_id,int s_id,String v_name,String v_model,
            int modelYear,String v_engineNo,String v_color,
            int v_cost);
    void updateVehicle(int vehicle_id,int category_id,int s_id,String v_name,String v_model,
            int modelYear,String v_engineNo,String v_color,
            int v_cost);
    void deleteVehicle(int vehicle_id);
    
}
