/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.SellersRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class SellersController {
    public void view() throws SQLException{
        SellersRepo Salesman=new SellersRepo();
        Salesman.view();
    }
}
