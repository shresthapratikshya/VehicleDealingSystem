/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CategoryController;
import Controller.CustomerController;
import Controller.CustomerReqController;
import Controller.OrdersController;
import Controller.OrdersTransactionsController;
import Controller.SellersController;
import Controller.TransactionsController;
import Controller.VehicleController;
import Repository.CustomerRepo;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Display {
    public void Customer() throws SQLException{
        CustomerController customerRepo=new CustomerController();
        System.out.println("id\tc_name\t\tc_email\t\t\tmobile\t\taddress");
        customerRepo.view();
    }
    public void Sellers() throws SQLException {
        SellersController sellersRepo=new SellersController();
        System.out.println("id\ts_username\ts_email\t\ts_mobile\ts_address");
        sellersRepo.view();
    }
    public void Category() throws SQLException{
        CategoryController categoryRepo=new CategoryController();
        System.out.println("id\tcateg_name");
        categoryRepo.view();
    }
    public void CustomerReq() throws SQLException {
        CustomerReqController customerReqRepo=new CustomerReqController();
        System.out.println("id\to_id\tv_id");
        customerReqRepo.view();
    }
      public void Orders() throws SQLException {
        OrdersController ordersRepo=new OrdersController();
        System.out.println("id\torder_date\tc_id\tv_id");
        ordersRepo.view();
    }
     
     
     public void Transaction() throws SQLException {
        TransactionsController transactionsRepo=new TransactionsController();
        System.out.println("id\ttrans_date\to_id\t"
                + "t_amount");
        transactionsRepo.view();
    }
     public void Vehicle() throws SQLException {
        VehicleController vehicleRepo=new VehicleController();
        System.out.println("id\tc_id\ts_id\tv_name\tv_model"
                + "\tm_year\tv_engNo\tmileage\tv_color\tv_cost\tstatus");
        vehicleRepo.view();
    }
     public void OrdersTransactions() throws SQLException{
         OrdersTransactionsController ordersTransRepo=new OrdersTransactionsController();
         System.out.println("c_id\torder_date\tt_amount\tt_date");
         ordersTransRepo.view();
     }
//     public void insert() throws SQLException{
//         
//     }
     
     public static void main(String[] args) throws SQLException {
         Display d=new Display();
         CustomerRepo r=new CustomerRepo();
         Scanner i=new Scanner(System.in);
         
         
             
             System.out.println("\t\t::::Vehicle Dealing System::::\n"
                 + "1.Visit List\n2.Fill in details\n3.Update Details\n"
                 + "4.Remove Entries");
             System.out.println("Enter your choice");
             int choice1=i.nextInt();
             switch(choice1){
                 case 1:
//                     do{
                         while(true){
                     System.out.println("LIST:\n1.Customer\n2.Salesman\n3.Category\n"
                     + "4.Customer Request\n5.Orders\n6.Vehicles\n"
                     + "7.Transaction\n8.OrdersTransactions\n9.Exit");
                     System.out.println("Enter number from 1-9:");
                     int choice=i.nextInt();
                     switch(choice){
             
                        case 1:
                            d.Customer();
                            break;
             
                        case 2:
                            d.Sellers();
                            break;
             
                        case 3:
                            d.Category();
                            break;
                
                        case 4:
                            d.CustomerReq();
                            break;
                        case 5:
                            d.Orders();
                            break;
                            
                        case 6:
                            d.Vehicle();
                            break;
                        case 7:
                            d.Transaction();
                            break;
                        case 8:
                            d.OrdersTransactions();
                            break;
                        case 9:
                            System.exit(0);
                        default:
                            System.out.println("Consider chosing from 1-8");
                        }
                         
                    }
//                    System.out.println("Continue?");
//                    choice2=i.nextInt();  
//            }       while(choice2==1);
                 case 2:
                     
                     

         
             
        } 
     }
}
