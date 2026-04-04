import employeemanagement.Employee;
import employeemanagement.Manager;

public class Q13
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("Mahi",2136,100000);
        e1.displayEmployeeDetails();
        System.out.println("Employee details:");
        System.out.println("HRA :" + e1.calculateHRA());
        System.out.println("DA :" + e1.calculateDA());
        System.out.println("Gross salary :" + e1.calculateGrossSalary());

        Manager m = new Manager("Rahi",2137,30000,500);
        System.out.println("\nManager details :");
        m.displayEmployeeDetails();
        System.out.println("Bonus :" + m.bonusAmount);
        System.out.println("After adding bonus Gross salary is :" + m.calculateGrossSalary());
    }
}