import orderpaymentsystem.CreditCardPayment;
import orderpaymentsystem.PayPalPayment;
import orderpaymentsystem.UPIPayment;
import orderpaymentsystem.CreditCardProcess;
import orderpaymentsystem.PayPalProcess;
import orderpaymentsystem.UPIProcess;

public class Q7
{
    public static void main(String args[])
    {
        CreditCardPayment o = new CreditCardPayment(101,"Laptop",2,50000);
        o.displayOrderDetails();
        System.out.println("-------------");
        CreditCardProcess p = new CreditCardProcess(100000);
        p.processPayment();
    }
}