/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Transaction {
    private int id;
    private int order_id;
    private String transaction_date;
    private int transaction_amount;
    private String status;
    static int generateId=0;

    public Transaction(int order_id,String transaction_date, int transaction_amount,String status) {
        id=generateId++;
        this.order_id=order_id;
        this.transaction_date = transaction_date;
        this.transaction_amount = transaction_amount;
        this.status=status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id =id;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public int getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(int transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
