import atmwithdraw.Transaction;

public class Q6
{
    public static void main(String args[])
    {
        Transaction t1 = new Transaction(2136,50000,5000);
        t1.showAccount();
        t1.withdraw();
    }
}