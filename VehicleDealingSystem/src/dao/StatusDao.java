/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface StatusDao {
    ArrayList<StatusDao> getAllStatus();
    void fetchStatusDatabase() throws SQLException;
    StatusDao getStatus(int status_id);
    void addStatus(String status_name) throws SQLException;
    void updateStatus(int status_id, String status_name);
    void deleteStatus(int status_id);
}
