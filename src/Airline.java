/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package israa;

/**
 *
 * @author Israa
 */
public class Airline {
    int Plane_id;
    String DepartureDate_Time;
    String ArrivalDate_Time;
    String Class;
    int Seat_Number;
    double Ticket_Price;
    int Fight_Number;
    private int counter=0;

    public Airline() {
    }

    public Airline(int Plane_id, String DepartureDate_Time, String ArrivalDate_Time, String Class, int Seat_Number, double Ticket_Price, int Fight_Number) {
        this.Plane_id = Plane_id;
        this.DepartureDate_Time = DepartureDate_Time;
        this.ArrivalDate_Time = ArrivalDate_Time;
        this.Class = Class;
        this.Seat_Number = Seat_Number;
        this.Ticket_Price = Ticket_Price;
        this.Fight_Number = Fight_Number;
        counter++;
    }

    public int getPlane_id() {
        return Plane_id;
    }

    public void setPlane_id(int Plane_id) {
        this.Plane_id = Plane_id;
    }

    public String getDepartureDate_Time() {
        return DepartureDate_Time;
    }

    public void setDepartureDate_Time(String DepartureDate_Time) {
        this.DepartureDate_Time = DepartureDate_Time;
    }

    public String getArrivalDate_Time() {
        return ArrivalDate_Time;
    }

    public void setArrivalDate_Time(String ArrivalDate_Time) {
        this.ArrivalDate_Time = ArrivalDate_Time;
    }

    public String getClasss() {
        return Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public int getSeat_Number() {
        return Seat_Number;
    }

    public void setSeat_Number(int Seat_Number) {
        this.Seat_Number = Seat_Number;
        
    }

    public double getTicket_Price() {
        return Ticket_Price;
    }

    public void setTicket_Price(double Ticket_Price) {
        this.Ticket_Price = Ticket_Price;
    }

    public int getFight_Number() {
        return Fight_Number;
    }

    public void setFight_Number(int Fight_Number) {
        this.Fight_Number = Fight_Number;
    }
    
    public void Booking_Form(){
        //AirlineAddBooking
    }
    public void displayBookingInfo(int custID)
    {
        
    }
    public void checkSeatAvailability()
    {
        if(counter > 60)
        {
            System.out.println("No seats available.");
        }
    }


}
