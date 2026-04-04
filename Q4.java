import employeesalary.PartTimeEmployee;
import employeesalary.FullTimeEmployee;

public class Q4
{
    public static void main(String args[])
    {
        FullTimeEmployee e1 = new FullTimeEmployee("Mahi",50000);
        PartTimeEmployee e2 = new PartTimeEmployee("Mahi",50000,8,500);
        e1.displayDetails();
        e2.displayDetails();
    }
}