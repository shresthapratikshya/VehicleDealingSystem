/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import DBConnector.DBConnection;
import dao.CustomerDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author DELL
 */
public class CustomerDaoImpl implements CustomerDao {
public static ArrayList<Customer> customerDatabase=new ArrayList<Customer>();
    @Override
    public ArrayList<Customer> getAllCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchCustomerDatabase() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(int c_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCustomer(String c_username, String c_email, String c_mobile, String c_address) throws SQLException {
        Connection connection=DBConnection.getConnection();
//        Statement statement=connection.createStatement();
//        String query="insert into customer"+"(c_name,c_email,c_mobile,c_address)";
//        int count=statement.executeUpdate(query);
//        System.out.println(count+"rows affected...");
//        statement.close();
//        connection.close();
        PreparedStatement st=connection.prepareStatement("Insert into customer"
                + "(c_username,c_email,c_mobile,c_address)Values(?,?,?,?)");
        st.setString(1,c_username);
        st.setString(2,c_email);
        st.setString(3,c_mobile);
        st.setString(4,c_address);
        st.executeUpdate();
        
        }
//    public void addCustomer(String c_username,String c_email,String c_mobile,String c_address) throws SQLException{
//        
//    }
    @Override
    public void updateCustomer(int c_id, String c_username, String c_email, String c_mobile, String c_address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCustomer(int c_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
