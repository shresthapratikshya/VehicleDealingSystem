/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import DBConnector.DBConnection;
import dao.SellersDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Sellers;

/**
 *
 * @author DELL
 */
public class SellersDaoImpl implements SellersDao{
    public static ArrayList<Sellers> sellersData=new ArrayList<Sellers>();

    @Override
    public ArrayList<Sellers> getallSalesman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchSalesmanDatabase() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sellers getSalesman(int s_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSalesman(int id,String s_username,String email,String s_mobile, String address) {
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement st=connection.prepareStatement("Insert into Sellers"
                    + "(id,s_username,email,s_mobile,s_address)Values(?,?,?,?,?)");
            st.setInt(1,id);
            st.setString(2, s_username);
            st.setString(3,email);
            st.setString(4, s_mobile);
            st.setString(5, address);
            st.executeUpdate();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(SellersDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateSalesman(int s_id, String s_username,String email,String s_mobile, String address) {
        sellersData.get(s_id).setS_username(s_username);
        sellersData.get(s_id).setEmail(email);
        sellersData.get(s_id).setS_mobile(s_mobile);
        sellersData.get(s_id).getS_address();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSalesman(int s_id) {
        sellersData.remove(s_id);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static int findID(int id){
        Iterator<Sellers> findIndex=sellersData.iterator();
        while(findIndex.hasNext()){
            Sellers obj=(Sellers) findIndex.next();
            if(obj.getid()==id){
                return sellersData.indexOf(obj);
            }
        }
        return -1;
    }
}
