import smartbankingsystem.SmartBank;

public class Q17
{
    public static void main(String args[])
    {
        SmartBank s = new SmartBank(40000);
        s.showBalance();
        s.deposit(5000);
        s.calculateLoanEligibility(50000);
    }
}