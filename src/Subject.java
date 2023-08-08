/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shatha;

/**
 *
 * @author HP
 */
public interface Subject {
    void addCustomer(Observer o);
    void removeCustomer(Observer o);
    void notifyAllCustomers();
    
}
