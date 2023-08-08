package rey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reyam alshini
 */
public class Payment 
{
    private int paymentID;
    private String paymentDate;
    private int totalAmount;
    private boolean paymentStatus;
    private PaymentType type;

    public Payment() {}

    public Payment(int paymentID, String paymentDate, int totalAmount, PaymentType type) 
    {
        this.paymentID = paymentID;
        this.paymentDate = paymentDate;
        this.totalAmount = totalAmount;
        this.type = type;
    }

    public Payment(int paymentID, String paymentDate, int totalAmount, boolean paymentStatus) 
    {
        this.paymentID = paymentID;
        this.paymentDate = paymentDate;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentID() 
    {
        return paymentID;
    }

    public void setPaymentID(int paymentID) 
    {
        this.paymentID = paymentID;
    }

    public String getPaymentDate() 
    {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) 
    {
        this.paymentDate = paymentDate;
    }

    public int getTotalAmount() 
    {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public PaymentType getType() 
    {
        return type;
    }
    
    public void generateReceipt(int paymentID)
    {
        Receipt r1 = new Receipt(paymentID);
        r1.setVisible(true);
    }
    
    public void confirmationMessage()
    {
        PaymentGUI m1 = new PaymentGUI();
        m1.setVisible(false); 
               
        JOptionPane.showMessageDialog(null,"Successful Payment !");  
    }
    
    public void adjustPayment(int amount)
    {
        if(amount != totalAmount)
        {
            totalAmount = amount;
        }
    }
    
    public boolean isPaymentStatus() 
    {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) 
    {
        this.paymentStatus = paymentStatus;
    }
    
    public void setType(PaymentType type) 
    {
        this.type = type;
    } 

    public void payAmount()
    {
        type.pay(totalAmount);
    }
    
}
