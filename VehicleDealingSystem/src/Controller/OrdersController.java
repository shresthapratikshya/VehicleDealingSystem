/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.OrdersRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class OrdersController {
    public void view() throws SQLException{
        OrdersRepo Orders=new OrdersRepo();
        Orders.view();
    }
}
