/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.CustomerVehicleOrdersRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class CustomerVehicleOrdersController {
    public void view() throws SQLException{
        CustomerVehicleOrdersRepo Customer=new CustomerVehicleOrdersRepo();
        Customer.view();
    }
}
