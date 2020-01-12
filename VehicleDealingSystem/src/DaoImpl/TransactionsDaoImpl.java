/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import DBConnector.DBConnection;
import dao.TransactionsDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.Transaction;

/**
 *
 * @author DELL
 */
public class TransactionsDaoImpl implements TransactionsDao{
    public static ArrayList<Transaction> transactionData=new ArrayList<Transaction>();

    @Override
    public ArrayList<Transaction> getAllTransactions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchTransactionsDatabase() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transaction getTransactions(int transaction_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTransactions(int order_id, String transaction_date, int transaction_amount,String status) throws SQLException {
        Connection connection=DBConnection.getConnection();
        PreparedStatement st=connection.prepareStatement("insert into transaction(order_id,transaction_date,"
                + "transaction_amount)Values(?,?,?)");
        st.setInt(1, order_id);
        st.setString(2, transaction_date);
        st.setInt(3,transaction_amount);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTransactions(int transaction_id, int order_id, String transaction_date,int transaction_amount,String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTransactions(int transaction_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
