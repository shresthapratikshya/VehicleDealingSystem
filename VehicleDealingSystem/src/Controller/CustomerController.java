/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.CustomerRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class CustomerController {
    public void view() throws SQLException{
        CustomerRepo Customer=new CustomerRepo();
        Customer.view();
    }
//    public void insert() throws SQLException{
//        CustomerRepo Customer=new CustomerRepo();
//        Customer.insert();
//    }
}
