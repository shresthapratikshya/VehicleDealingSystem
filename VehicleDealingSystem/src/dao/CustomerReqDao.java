/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.CustomerReq;

/**
 *
 * @author DELL
 */
public interface CustomerReqDao {
    ArrayList<CustomerReq> getAllCustomerReq();
    void fetchCustomerReqDatabase() throws SQLException;
    CustomerReq getCustomerReq(int customerReq_id);
    void addCustomerReq(int order_id,int vehicle_id) throws SQLException;
    void updateCustomerReq(int customerReq_id,int order_id,int vehicle_id);
    void deleteCustomerReq(int customerReq_id);
}
