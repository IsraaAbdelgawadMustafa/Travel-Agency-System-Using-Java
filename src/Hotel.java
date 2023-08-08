package rey;

/**
 *
 * @author reyam alshini
 */
public class Hotel 
{
    private int hotelID;
    private String hotelName;
    private String hotelClass;
    private Room r;

    public Hotel() {}

    public Hotel(int hotelID, String hotelName, String hotelClass, Room r) {
        this.hotelID = hotelID;
        this.hotelName = hotelName;
        this.hotelClass = hotelClass;
        this.r = r;
    }

    public Hotel(String hotelClass) {
        this.hotelClass = hotelClass;
    }
    
    

    public int getHotelID() 
    {
        return hotelID;
    }

    public void setHotelID(int hotelID) 
    {
        this.hotelID = hotelID;
    }

    public String getHotelName() 
    {
        return hotelName;
    }

    public void setHotelName(String hotelName) 
    {
        this.hotelName = hotelName;
    }

    public String getHotelClass() 
    {
        return hotelClass;
    }

    public void setHotelClass(String hotelClass) 
    {
        this.hotelClass = hotelClass;
    }
    
    public void booking_form(int H_id)
    {
        
    }
    
    public void displayMessage()
    {
        System.out.println("Your room has been succesfully booked.");
    }
    
    public void viewRoom()
    {
        
    }
}
