/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.Orders;

/**
 *
 * @author DELL
 */
public interface OrdersDao {
    ArrayList<Orders> getAllOrder();
    void fetchOrderDatabase() throws SQLException;
    Orders getOrder(int order_id);
    void addOrder(String order_date,int c_id,int vehicle_id) throws SQLException;
    void updateOrder(int order_id,String order_date,int c_id,int vehicle_id);
    void deleteOrder(int order_id);
}
