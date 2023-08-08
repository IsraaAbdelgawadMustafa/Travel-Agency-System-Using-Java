package rey;

/**
 *
 * @author reyam alshini
 */
public class Room 
{
    private int roomNum;
    private int floorNum;
    private int capacity;
    private double roomPrice;
    private boolean roomAvailability;

    public Room() {}

    public Room(int roomNum, int floorNum, int capacity, double roomPrice) 
    {
        this.roomNum = roomNum;
        this.floorNum = floorNum;
        this.capacity = capacity;
        this.roomPrice = roomPrice;
    }

    public int getRoomNum() 
    {
        return roomNum;
    }

    public void setRoomNum(int roomNum) 
    {
        this.roomNum = roomNum;
    }

    public int getFloorNum() 
    {
        return floorNum;
    }

    public void setFloorNum(int floorNum) 
    {
        this.floorNum = floorNum;
    }

    public int getCapacity() 
    {
        return capacity;
    }

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }

    public double getRoomPrice() 
    {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) 
    {
        this.roomPrice = roomPrice;
    }
    
    public boolean checkRoomAvailability()
    {
        boolean result = true;
        
        if(roomAvailability != true)
        {
            result = false;
        }
        return result;
    }
    
    public void bookRoom()
    {
        
    }
    
    public void displayRoomInfo()
    {
        System.out.println("Room number: " + roomNum);
        System.out.println("Room floor number: " + floorNum);
        System.out.println("Room price: " + roomPrice);
        System.out.println("Room capacity: " + capacity);
        
        if(roomAvailability)
        {
            System.out.println("Room availability: not available");
        }
        else
        {
            System.out.println("Room availability: available");
        }
    }
}
