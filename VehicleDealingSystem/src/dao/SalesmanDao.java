/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Sellers;

/**
 *
 * @author DELL
 */
public interface SalesmanDao {
    ArrayList<Sellers> getallSalesman();
    void fetchSalesmanDatabase() throws SQLException;
    Sellers getSalesman(int s_id);
    void addSalesman(String s_username,String s_email,
            int s_mobile,String address);
    void updateSalesman(int s_id,String s_username,String s_email,
            int s_mobile,String address);
    void deleteSalesman(int s_id);
    
}
