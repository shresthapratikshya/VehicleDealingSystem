/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DBConnector.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Transaction;

/**
 *
 * @author DELL
 */
public class TransactionsRepo {

    public void view() throws SQLException{
        Connection connection=DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from Transaction");
        
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"
            +resultSet.getInt(3)+"\t"+resultSet.getInt(4)+"\t"+resultSet.getString(5));
        }
        DBConnection.closeConnection();
    }
}
