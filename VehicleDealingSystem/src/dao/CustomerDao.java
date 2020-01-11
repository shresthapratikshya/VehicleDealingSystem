/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author DELL
 */
public interface CustomerDao {
    ArrayList<Customer> getAllCustomer();
    void fetchCustomerDatabase() throws SQLException;
    Customer getCustomer(int c_id);
    void addCustomer(String c_username,String c_email,int c_mobile,
                String c_address) throws SQLException;
    void updateCustomer(int c_id,String c_username,String c_email,int c_mobile,
                String c_address);
    void deleteCustomer(int c_id);
}
