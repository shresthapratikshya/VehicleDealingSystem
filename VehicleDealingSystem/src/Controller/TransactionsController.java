/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.TransactionsRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class TransactionsController {
    public void view() throws SQLException{
        TransactionsRepo Transaction=new TransactionsRepo();
        Transaction.view();
    }
}
