/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.VehicleRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class VehicleController {
    public void view() throws SQLException{
        VehicleRepo Vehicle=new VehicleRepo();
        Vehicle.view();
    }
}
