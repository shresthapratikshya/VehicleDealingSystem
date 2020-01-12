/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.CustomerVehicleOrders;

/**
 *
 * @author DELL
 */
public interface CustomerVehicleOrdersDao{

    /**
     *
     * @return
     */
    ArrayList<CustomerVehicleOrders> getAllCustomerVehicleOrders();
    void fetchCustomerDatabase() throws SQLException;
    CustomerVehicleOrders getCustomerVehicleOrders(int id);
    void addCustomerVehicleOrders(int id,String c_username,String v_name) throws SQLException;
    void updateCustomerVehicleOrders(int id,String c_username,String v_name);
    void deleteCustomerVehicleOrders(int id);
}
