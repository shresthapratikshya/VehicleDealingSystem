/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DBConnector.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
//static{
//    try{
//        Class.forName("com.mysql.jdbc.Driver");
//
//    }catch(ClassNotFoundException e){
//        e.printStackTrace();
//}
//}

/**
 *
 * @author DELL
 */
public class CustomerRepo {

    public void view() throws SQLException{
        Connection connection=DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from Customer");
        
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"
            +resultSet.getString(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5));
        }
        DBConnection.closeConnection();
    }
    
//    public void insert() throws SQLException{
//        Connection connection=DBConnection.getConnection();
//        Statement statement=connection.createStatement();
//        String query="insert into customer"+"(c_name,c_email,c_mobile,c_address)";
//        int count=statement.executeUpdate(query);
//        System.out.println(count+"rows affected...");
//        statement.close();
//        connection.close();
//        
//    }
// public void insert() throws SQLException{
//        Connection connection=DBConnection.getConnection();
//        Statement statement=connection.createStatement();
//        String query=("insert into customer"+"(c_name,c_email,c_mobile,c_address)"
//                +"VALUES ('Mandip','mandip@gmail.com','9875784552','Manamaiju')");
//        statement.executeQuery(query);
//        System.out.println("Insert Completed");
//        statement.close();
//    }
    
}
