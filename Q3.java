import bankaccountsystem.SavingsAccount;
import bankaccountsystem.CurrentAccount;

public class Q3
{
    public static void main(String args[])
    {
        SavingsAccount s1 = new SavingsAccount();
        s1.showDetails();

        CurrentAccount c1 = new CurrentAccount();
        c1.showDetails();
    }
}