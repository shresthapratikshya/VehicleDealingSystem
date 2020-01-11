/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.Transaction;

/**
 *
 * @author DELL
 */
public interface TransactionsDao {
    ArrayList<Transaction> getAllTransactions();
    void fetchTransactionsDatabase() throws SQLException;
    Transaction getTransactions(int transaction_id);
    void addTransactions(int order_id,Date transaction_date) throws SQLException;
    void updateTransactions(int transaction_id,int order_id,Date transaction_date);
    void deleteTransactions(int transaction_id);
}
