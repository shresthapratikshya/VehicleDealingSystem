/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import DBConnector.DBConnection;
import dao.VehicleDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Vehicle;

/**
 *
 * @author DELL
 */
public class VehiclesDaoImpl implements VehicleDao{
    public static ArrayList<Vehicle> vehicleData=new ArrayList<Vehicle>();

    @Override
    public ArrayList<Vehicle> getallVehicle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchVehicleDatabase() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehicle getVehicle(int vehicle_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addVehicle(int category_id, int s_id, String v_name, String v_model, 
            int modelYear, String v_engineNo, double mileage, String v_color, int v_cost, String status)
            {
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement st=connection.prepareStatement("Insert into vehicle"
                + "(category_id,s_id,v_name,v_model,modelYear,v_engineNo,mileage,v_color,v_cost,status)Values(?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1, category_id);
            st.setInt(2, s_id);
            st.setString(3,v_name);
            st.setString(4,v_model);
            st.setInt(5,modelYear);
            st.setString(6,v_engineNo);
            st.setDouble(7,mileage);
            st.setString(8,v_color);
            st.setInt(9, v_cost);
            st.setString(10,status);
            st.executeUpdate();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(VehiclesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void updateVehicle(int vehicle_id, int category_id, int s_id, String v_name, String v_model, 
            int modelYear, String v_engineNo, double mileage, String v_color, int v_cost, String status) {
        vehicleData.get(vehicle_id).setCategory_id(category_id);
        vehicleData.get(vehicle_id).setS_id(s_id);
        vehicleData.get(vehicle_id).setV_name(v_name);
        vehicleData.get(vehicle_id).setV_model(v_model);
        vehicleData.get(vehicle_id).setModelYear(modelYear);
        vehicleData.get(vehicle_id).setV_engineNo(v_engineNo);
        vehicleData.get(vehicle_id).setMileage(mileage);
        vehicleData.get(vehicle_id).setV_color(v_color);
        vehicleData.get(vehicle_id).setV_cost(v_cost);
        vehicleData.get(vehicle_id).setStatus(status);
        
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVehicle(int vehicle_id) {
        //vehicleData.remove(vehicle_id);
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
