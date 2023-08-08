
package travel_agency;
import java.util.*;

public class Admin extends User{
    
    /*Constructors*/
    private Admin(String username , String password , String Fname ,String Lname ,String Email){
        super(username,password,Fname,Lname,Email);
    } 
    private Admin() {
   }

    private static Admin singleton;
   public static Admin getInstance() {
        if(singleton == null) {
            singleton = new Admin("youssef","","Youssef","Sherif","youssef194498@bue.edu.eg");
        }
        
        return singleton;
    }
   
   
   
  /*Login method*/
    public int Login(String username,String password ) throws LogInException{
      
    if(username.equals(singleton.getUsername()) && password.equals(singleton.getPassword())){
        return 0;
        }
    else{
        
       throw new LogInException();
       }
  }
}
