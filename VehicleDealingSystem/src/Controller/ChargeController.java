/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.ChargeRepo;
import java.sql.SQLException;
import model.Charge;

/**
 *
 * @author DELL
 */
public class ChargeController {
    public void view() throws SQLException{
        ChargeRepo Charge=new ChargeRepo();
        Charge.view();
    }
}
