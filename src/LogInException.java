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
public class LogInException extends Exception  {
    
    String Msg;
    public  LogInException(){
                Msg  = "Username or password incorrect";
    }

    public String getMsg() {
        return Msg;
    }
     
}
