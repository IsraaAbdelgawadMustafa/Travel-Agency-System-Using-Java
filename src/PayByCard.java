package rey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author reyam alshini
 */
public class PayByCard implements PaymentType
{
    private int cardNum;
    private String cardHolderName;
    private int cardVerificationCode;
    private String expiryDate;
    private double amountInCard;

    public PayByCard() {}

    public PayByCard(int cardNum, String cardHolderName, int cardVerificationCode, String expiryDate, double amountInCard) 
    {
        this.cardNum = cardNum;
        this.cardHolderName = cardHolderName;
        this.cardVerificationCode = cardVerificationCode;
        this.expiryDate = expiryDate;
        this.amountInCard = amountInCard;
    }

    public int getCardNum() 
    {
        return cardNum;
    }

    public void setCardNum(int cardNum) 
    {
        this.cardNum = cardNum;
    }

    public String getCardHolderName() 
    {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) 
    {
        this.cardHolderName = cardHolderName;
    }

    public int getCardVerificationCode() 
    {
        return cardVerificationCode;
    }

    public void setCardVerificationCode(int cardVerificationCode) 
    {
        this.cardVerificationCode = cardVerificationCode;
    }

    public String getExpiryDate() 
    {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) 
    {
        this.expiryDate = expiryDate;
    }

    public double getAmountInCard() 
    {
        return amountInCard;
    }

    public void setAmountInCard(double amountInCard) 
    {
        this.amountInCard = amountInCard;
    }
    
    @Override
    public void pay(double amount)
    {
        if (amount < amountInCard)
        {
            amountInCard -= amount;
            
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency" ,"root","");
                    Statement st=con.createStatement();
                    st.executeUpdate("update paybycard set amountInCard = " + amountInCard + " where CardNum = '" + cardNum + "'");
                    System.out.println("$" + amount + " has been deducted.");
                } 
                catch (Exception e) 
                {
                 System.err.println("DATABASE UPDATE ERROR: " + e.toString());
                }
        }
        else if(amount < amountInCard)
        {
            System.out.println("Unfortunately $" + amount + " can not be deducted. Please check your bank account.");
        }
        
        
    }
   
}
