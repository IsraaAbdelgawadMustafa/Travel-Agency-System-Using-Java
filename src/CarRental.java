package Sheroq;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CarRental {

   

    static void displayCarInfo(String Rental_duartion, int Yearofproduction, String Price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int Car_id;
    int Price;
    String Car_model;
    String Rental_Duration;
    int Year_of_Production;

    public CarRental(int Car_id, int Price, String Car_model, String Rental_Duration, int Year_of_Production) {
        this.Car_id = Car_id;
        this.Price = Price;
        this.Car_model = Car_model;
        this.Rental_Duration = Rental_Duration;
        this.Year_of_Production = Year_of_Production;
    }
     
     

     
    Scanner x = new Scanner(System.in);

  
    CarRental() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

 public void chooseCar(){
    
      System.out.println(Car_id);

     System.out.println("Enter price Range:\n");
     Price=x.nextInt();
     System.out.println("Enter the model:\n");
     Car_model=x.nextLine();
     System.out.println("Enter Year of Production:\n");
     Year_of_Production=x.nextInt();
     System.out.println("Enter Rental Duration:\n");
     Rental_Duration=x.nextLine();

}
 
 
 
 
 
 public void displayCarInfo(){
        System.out.println ("{" + "Price=" + Price + ", Car_model=" + Car_model + ", Year_of_Production=" + Year_of_Production + ", Rental_Duration=" + Rental_Duration + "}");
    }
   
 
 
 
 
 public void RentalForm(){
      String RentalForm="";
     if (makeBooking()==true){
System.out.print ( "You can fill rental car form \n");
 this.chooseCar();
 this.displayCarInfo();
     }

}

    private boolean makeBooking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}