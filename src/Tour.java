/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shatha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Tour implements Subject {
    String duration;
    String availability;
    String destination;
    String price;
    String tourGuide;
    String tour_ID;
    List<Observer> observerList;
    
      public Tour(String duration, String destination, String price, String tourGuide, String availability, String tour_ID) {
        this.duration = duration;
        this.destination = destination;
        this.price = price;
        this.tourGuide = tourGuide;
        this.observerList = new ArrayList<>();
        this.tour_ID = tour_ID;
        this.availability = availability;
    }

    public Tour() {
    }
    
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTourGuide() {
        return tourGuide;
    }

    public void setTourGuide(String tourGuide) {
        this.tourGuide = tourGuide;
    }
    
       public String getAvailability() {
        return availability;
    }
       
        public String getTour_ID() {
        return tour_ID;
    }

    public void setTour_ID(String tour_ID) {
        this.tour_ID = tour_ID;
    }

    public void setAvailability(boolean available) {
        availability = available ? "Available" : "Unavailable";
  }
       
//       public void addTour(int duration, String destination, double price, String tourGuide, String availability){
//       String connectionURL= "jdbc:mysql://localhost:3306/travel_agency";
//        try {
//                Connection conn = DriverManager.getConnection(connectionURL, "root", "");
//                Statement st = conn.createStatement();
//                String sql = "INSERT INTO tour (Duration,Destination,Price,tourGuide,Tour_id,availability)VALUES ('"+duration+"','"+destination+"','"+price+"','"+tourGuide+"','"+availability+"')";
//                st.executeQuery(sql);
//                st.close(); 
//                conn.close(); 
//            }
//        catch (SQLException ex) 
//            {
//                System.out.println("Connection failed! ");
//            }
//     }
    
//    public void displayTours(){
//        String connectionURL = "jdbc:mysql://localhost:3306/travel_agency";
//        
//        try {
//            Connection conn = DriverManager.getConnection(connectionURL, "root", "");
//            String sql = "SELECT * FROM tour WHERE Tour_id = 'tour_ID' ";  
//            Statement st = conn.createStatement();
//            ResultSet rs = null;
//            rs = st.executeQuery(sql);
//            while (rs.next()) {
//               destination=rs.getNString("Destination");
//               duration=rs.getNString("Duration");
//               price=rs.getNString("Price");
//               tourGuide =rs.getNString("tourGuide");
//               tour_ID=rs.getNString("Tour_id");
//               availability=rs.getNString("availability");
//                }
//            rs.close();
//            st.close();
//            conn.close();
//            
//            
//            } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Connection failed! " );
//        }
//        }

    @Override
    public void addCustomer(Observer o) {
            observerList.add(o);
    }

    @Override
    public void removeCustomer(Observer o) {
            observerList.remove(o);
    }
    
    @Override
    public void notifyAllCustomers() {
            for(Observer o: observerList){
                    o.update(availability);
                }
    }
    }

  
   

