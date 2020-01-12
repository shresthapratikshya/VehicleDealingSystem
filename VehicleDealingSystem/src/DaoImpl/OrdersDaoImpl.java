/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import DBConnector.DBConnection;
import dao.OrdersDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.Orders;

/**
 *
 * @author DELL
 */
public class OrdersDaoImpl implements OrdersDao{
    public static ArrayList<Orders> OrdersData=new ArrayList<Orders>();

    @Override
    public ArrayList<Orders> getAllOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchOrderDatabase() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Orders getOrder(int order_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrder(String order_date,int c_id, int vehicle_id) throws SQLException {
        Connection connection=DBConnection.getConnection();
        PreparedStatement st=connection.prepareStatement("insert into Orders"
                + "(order_date,c_id,vehicle_id)Values(?,?,?)");
        st.setString(1,order_date);
        st.setInt(2, c_id);
        st.setInt(3, vehicle_id);
        //st.setString(1, order_date);
        st.executeUpdate();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateOrder(int order_id,String order_date, int c_id, int vehicle_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOrder(int order_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
