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
import model.Category;

/**
 *
 * @author DELL
 */
public class CategoryRepo {
    
    public void view() throws SQLException{
        Connection connection=DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from Category");
        
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2));
        }
        DBConnection.closeConnection();
    }
//    public void insert() throws SQLException{
//        Connection connection=DBConnection.getConnection();
//        Statement statement=connection.createStatement();
//        ResultSet resultSet=statement.executeQuery("insert into Category");
//        
//    }
//   
}
