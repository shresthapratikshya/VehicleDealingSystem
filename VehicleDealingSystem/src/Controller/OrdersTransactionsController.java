/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.OrdersTransactionsRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class OrdersTransactionsController {
    public void view() throws SQLException{
        OrdersTransactionsRepo OrdersTrans=new OrdersTransactionsRepo();
        OrdersTrans.view();
    }
}
