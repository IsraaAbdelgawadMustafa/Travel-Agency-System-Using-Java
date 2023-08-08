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
public class Unbooked implements BookingState {
    @Override
    public void updateStatus()
    {
        System.out.println("The booking is unbooked ");
    }
}
