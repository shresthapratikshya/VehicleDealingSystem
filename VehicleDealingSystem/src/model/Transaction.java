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
    private Date transaction_date;
    private int transaction_amount;
    static int generateId=0;

    public Transaction(int order_id,Date transaction_date, int transaction_amount) {
        id=generateId++;
        this.order_id=order_id;
        this.transaction_date = transaction_date;
        this.transaction_amount = transaction_amount;
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

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public int getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(int transaction_amount) {
        this.transaction_amount = transaction_amount;
    }
    
    
    
    
    
}
