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
import model.Vehicle;

/**
 *
 * @author DELL
 */
public class VehicleRepo {

    
    public void view() throws SQLException{
        Connection connection=DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from Vehicle");
        
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getInt(2)+"\t"
            +resultSet.getInt(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5)+"\t"+
                    resultSet.getInt(6)+"\t"+resultSet.getString(7)+"\t"
                    +resultSet.getDouble(8)+"\t"+
                    resultSet.getString(9)+
                    "\t"+resultSet.getInt(10)+"\t"+resultSet.getString(11));
        }
        DBConnection.closeConnection();
    }
}
