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
public interface SellersDao {
    ArrayList<Sellers> getallSalesman();
    void fetchSalesmanDatabase() throws SQLException;
    Sellers getSalesman(int id);
    void addSalesman(int id,String s_username,String email,
            String s_mobile,String address);
    void updateSalesman(int id,String s_username,String email,
            String s_mobile,String address);
    void deleteSalesman(int id);
    
}
