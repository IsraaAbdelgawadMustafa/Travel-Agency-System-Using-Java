/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DB {

    public static Connection con(){

    Connection con = null;
            
        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Get a connection to database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency","root","");
            JOptionPane.showMessageDialog(null,"Connected!");
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
        return con;
    }

    
}
