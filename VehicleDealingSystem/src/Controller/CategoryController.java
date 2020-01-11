/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.CategoryRepo;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class CategoryController {
    public void view() throws SQLException{
        CategoryRepo Category=new CategoryRepo();
        Category.view();
    }
}
