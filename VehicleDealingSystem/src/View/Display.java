/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CategoryController;
import Controller.CustomerController;
import Controller.OrdersController;
import Controller.OrdersTransactionsController;
import Controller.SellersController;
import Controller.TransactionsController;
import Controller.VehicleController;
import DaoImpl.CustomerDaoImpl;
import DaoImpl.OrdersDaoImpl;
import DaoImpl.SellersDaoImpl;
import DaoImpl.TransactionsDaoImpl;
import DaoImpl.VehiclesDaoImpl;
import Repository.CustomerRepo;
import dao.CustomerDao;
import dao.OrdersDao;
import dao.SellersDao;
import dao.TransactionsDao;
import dao.VehicleDao;
import java.sql.SQLException;
import java.util.Scanner;
import model.Sellers;

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
        System.out.println("id\ts_username\t\temail\t\ts_mobile\ts_address");
        sellersRepo.view();
    }
    public void Category() throws SQLException{
        CategoryController categoryRepo=new CategoryController();
        System.out.println("id\tcateg_name");
        categoryRepo.view();
    }
    
      public void Orders() throws SQLException {
        OrdersController ordersRepo=new OrdersController();
        System.out.println("id\torder_date\tc_id\tv_id");
        ordersRepo.view();
    }
     
     public void Transaction() throws SQLException {
        TransactionsController transactionsRepo=new TransactionsController();
        System.out.println("id\ttrans_date\to_id\t"
                + "t_amount\tstatus");
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

     public int askID(){
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the ID you want to update:");
         int id=s.nextInt();
         return id;
     }
     public void display(Sellers s){
        System.out.println("ID : "+s.getid()+"  Name : "+s.getS_username()+"  Mobile : "+s.getS_mobile()+"Address:"+s.getS_address());

    }
     public void errorMessage(){
         System.out.println("Sorry! Cannot find the id");
     }
     
     public static void main(String[] args) throws SQLException {
         Display d=new Display();
         CustomerRepo r=new CustomerRepo();
         Scanner i=new Scanner(System.in);
         CustomerDao thisCustomer=new CustomerDaoImpl();
         VehicleDao thisVehicle=new VehiclesDaoImpl();
         SellersDao thisSellers=new SellersDaoImpl();
         OrdersDao thisOrders=new OrdersDaoImpl();
         TransactionsDao thisTrans=new TransactionsDaoImpl();
         boolean flag=true;
         int id,index;
         SellersDao sell=new SellersDaoImpl();
            
        
            System.out.println("\t\t::::::::::Vehicle Dealing System::::::::::\n\n\n\n"
            + "1.Fill in the details\n2.Visit list of tables\n3.Exit");
            System.out.println("Enter your choice");
            int choice1=i.nextInt();
            switch(choice1){
                case 1:
                    first:while(true){
                    System.out.println("LIST:\n1.Insert into Customer\n2.Insert into Vehicle\n"
                    + "3.Insert into Sellers\n4.Insert into orders\n5.Insert into "
                            + "Transactions\n6.Visit list of tables\n7.Exit");
                    System.out.println("Enter number from 1_5");
                    int choice=i.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("Enter customer name");
                            String name=i.next();
                            System.out.println("Enter email");
                            String email=i.next();
                            System.out.println("Enter mobile no");
                            String mobile=i.next();
                            System.out.println("Enter address");
                            String address=i.next();
                            thisCustomer.addCustomer(name, email, mobile, address);
                            break;
                            
                        case 2:
                            System.out.println("CATEGORIES::::\n1.Car\n2.Bike\n3.Jeep");
                            System.out.println("Enter category_id");
                            int c_id=i.nextInt();
                            d.Sellers();
                            System.out.println("Enter s_id");
                            int s_id=i.nextInt();
                            System.out.println("Enter vehicle name");
                            String v_name=i.next();
                            System.out.println("Enter model");
                            String model=i.next();
                            System.out.println("Enter modelYear");
                            int modelYear=i.nextInt();
                            System.out.println("Enter engine no");
                            String engine=i.next();
                            System.out.println("Enter mileage");
                            double mileage=i.nextDouble();
                            System.out.println("Enter color");
                            String color=i.next();
                            System.out.println("Enter cost");
                            int cost=i.nextInt();
                            System.out.println("Enter status");
                            String status=i.next();
                            thisVehicle.addVehicle(c_id, s_id, v_name, model, modelYear, engine,mileage, color, cost,status);
                            break;
                            
                        case 3:
                            d.Sellers();
                            System.out.println("Enter new id");
                            int se_id=i.nextInt();
                            System.out.println("Enter username");
                            String s_username=i.next();
                            System.out.println("Enter email");
                            String s_email=i.next();
                            System.out.println("Enter mobile");
                            String s_mobile=i.next();
                            System.out.println("Enter address");
                            String s_address=i.next();
                            thisSellers.addSalesman(se_id,s_username,s_email,s_mobile, s_address);
                            break;
                        case 4:
                            System.out.println("Enter date");
                            String date=i.next();
                            System.out.println("::::Customer List::::\n");
                            d.Customer();
                            System.out.println("Enter your customer id from the above table");
                            int cu_id=i.nextInt();
                            d.Vehicle();
                            System.out.println("Enter vehicle id");
                            d.Vehicle();
                            int v_id=i.nextInt();
                            thisOrders.addOrder(date,cu_id,v_id);
                            break;
                        case 5:
                            //break first;
                            System.out.println("Enter transaction_date");
                            String t_date=i.next();
                            System.out.println("Enter order_id from the give list");
                            d.Orders();
                            int o_id=i.nextInt();
                            System.out.println("Enter transaction amount");
                            int t_amount=i.nextInt();
                            System.out.println("Enter transaction status");
                            String t_status=i.next();
                            thisTrans.addTransactions(o_id,t_date, t_amount,t_status);
                        case 6:
                            break first;
                        case 7:
                            System.exit(0);
                    }
                }  
                case 2:
                    while(true){
                    System.out.println("LIST OF TABLES:\n1.Customer\n2.Sellers\n3.Category\n"
                    + "4.Orders\n5.Vehicles\n"
                    + "6.Transaction\n7.OrdersTransactions\n8.Exit");
                    System.out.println("Enter number from 1-8:");
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
                            d.Orders();
                            break;
                        case 5:
                            d.Vehicle();
                            break;
                        case 6:
                            d.Transaction();
                            break;
                        case 7:
                            d.OrdersTransactions();
                            break;
                        case 8:
                            System.exit(0);
                        default:
                            System.out.println("Sorry!Consider chosing from 1-8");
                        }
                    }
                case 3:
                    System.exit(0);
//                case 3:
//                    id=d.askID();
//                    index=SellersDaoImpl.findID(id);
//                    if(index!=-1){
//                        d.display(SellersDaoImpl.sellersData.get(index));
//                        System.out.println("removing the above information");
//                        sell.deleteSalesman(id);
//                    }else{
//                        d.errorMessage();
//                    }
//                    break;
                    
                    
                    
                    
                    
                    
                    
//                    id=d.askID();
//                    index=SellersDaoImpl.findID(id);
//                    if(index!=-1){
//                        d.display(SellersDaoImpl.sellersData.get(index));
//                        System.out.println("Information to be edited");
//                        System.out.println("Enter new name:");
//                        String newName=i.next();
//                        System.out.println("Enter email");
//                        String newEmail=i.next();
//                        System.out.println("Enter mobile");
//                        int newMob=i.nextInt();
//                        System.out.println("Enter address");
//                        String newAdd=i.next();
//                        sell.updateSalesman(id,newName, newEmail, newEmail, newAdd);
//                    }else{
//                        d.errorMessage();
//                    }
                    
            }
//                 case 3:
//                     System.out.println("To DELETE:\n1.Sellers");
//                     System.out.println("Enter your choice");
//                     int choice=i.nextInt();
//                     
//                     switch(choice){
//                         case 1:
//                            d.id=askID();
//                     }
                    
                

                 
        
    }
}
