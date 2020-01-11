/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Category;

/**
 *
 * @author DELL
 */
public interface CategoryDao {
    ArrayList<Category> getAllCategory();
    void fetchCategoryDatabase() throws SQLException;
    Category getCategory(int category_id);
    void addCategory(String category_name) throws SQLException;
    void updateCategory(int category_id,String category_name);
    void deleteCategory(int category_id);
    
    
    
}
