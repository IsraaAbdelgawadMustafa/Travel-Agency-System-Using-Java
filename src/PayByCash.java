package rey;

//import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.JOptionPane;

/**
 *
 * @author reyam alshini
 */
public class PayByCash implements PaymentType
{
    @Override
    public void pay(double amount)
    {
        ChoosePaymentMethod m1 = new ChoosePaymentMethod();
        m1.setVisible(false);        
        JOptionPane.showMessageDialog(null,"Thank You, you will be charged $2 extra to pay by cash. Please pay $" + amount + " on arrival.");    
    }
}
