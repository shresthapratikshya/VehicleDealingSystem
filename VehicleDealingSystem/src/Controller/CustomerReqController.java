/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.CustomerReqRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class CustomerReqController {
    public void view() throws SQLException{
        CustomerReqRepo CustomerReq=new CustomerReqRepo();
        CustomerReq.view();
    }
}
