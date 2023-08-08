/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package israa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Israa
 */
public class Booking {

  private int bookingNum;
  private String booking_status;
  private BookingState booking_state;
//  private Airline FlightBooking;
  private Connection con;
   private final String userName = "root";
    private final String password = "";
    private final String dbName = "travel_agency";
//  private CarRental CarBooking = new CarRental();
//  private Hotel HotelBooking = new Hotel();
    

    public Booking() {
        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //Get a connection to database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, userName, password);
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
    }

    public Booking(int bNum, String bStat, BookingState s) {
        bookingNum = bNum;
        booking_status = bStat;
        booking_state = s;
    }
    public void setbookingstate(BookingState s)
   {
       booking_state = s;
   }
  
   public void displayBookingDetails(int custID)
   {
     try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Airline WHERE bookingID = airline_id ";  
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
               String PlaneID =rs.getNString("Plane_id");
               String DepartureDate=rs.getNString("DepartureDate_Time");
               String ArrivalDate=rs.getNString("ArrivalDate");
               String Booking_Status=rs.getNString("Booking_Status");
               String Class=rs.getNString("Class");
               String Seat_Number=rs.getNString("Seat_Number");
               String Ticket_Price=rs.getNString("Ticket_Price");
               String Flight_Number=rs.getNString("Flight_Number");
                }
            rs.close();
            stmt.close();
            con.close();
            } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
            
        
   }
   public void editBooking(String Dept, int a)
   {
       //Done in the EditBookingGUI
    
   }
   public void cancelBooking(int id)
   {
         try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from airline_booking where Plane_id = 'id");
            System.out.println("Booking deleted");
        } catch (Exception e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
   }
   public void updateStatus()
   {
   booking_state.updateStatus();
   } 
}
