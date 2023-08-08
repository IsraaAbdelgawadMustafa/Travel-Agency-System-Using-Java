/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;

import Sheroq.*;
import java.io.Serializable;
import java.sql.SQLException;
import sheroq.*;


/**
 *
 * @author Youssef
 */
public class MainCode implements Serializable {
    
    
     public static void main(String[] args) throws Exception {
        Implementation I = new Implementation();
        I.Add_Records();
        
//        Home_Page hp= new Home_Page();
//        hp.setVisible(true);  

        Dashboard d = new Dashboard();
        d.setVisible(true);
        
//        CarRental c = new CarRental();
  }
}
