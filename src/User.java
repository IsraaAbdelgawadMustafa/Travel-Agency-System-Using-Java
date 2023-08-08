/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;

/**
 *
 * @author Youssef
 */
import java.io.*;

abstract public class User implements Serializable{
    private String username , password , Fname , Lname , Email;

/*Constructors*/
public User(){
    username = " ";
    password = " " ;
    Fname = " " ;
    Lname = " " ;
    Email = " ";
   }
public User(String username , String password , String Fname , String Lname , String Email){
    this.username = username;
    this.password = password;
    this.Fname = Fname;
    this.Lname = Lname;
    this.Email = Email;
   }

/*Setters*/
public void setUserName (String username){
    this.username = username;
}
public void setPassword (String password){
    this.password = password;
}
public void setFname (String Fname){
    this.Fname = Fname;
}
public void setLname (String Lname){
    this.Lname = Lname;
}

public void setEmail (String Email){
     this.Email = Email;
}

/*Getters*/
public String getUsername() {
    return username;
}
public String getPassword() {
    return password;
}
public String getFname() {
    return Fname;
}
public String getLname() {
    return Lname;
}


public String getEmail() {
    return Email;
}

}



/*Methods*/

