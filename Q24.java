class Employee {
    String emp_name;
    int age;
    double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        this.emp_name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display employee information
    void displayInformation() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    // Method to calculate tax
    void calculateTax() {
        double tax;

        if (salary <= 20000) {
            tax = salary * 0.001;   // 0.1%
        } else if (salary <= 50000) {
            tax = salary * 0.002;   // 0.2%
        } else {
            tax = salary * 0.003;   // 0.3%
        }

        System.out.println("Calculated Tax: " + tax);
        System.out.println("-------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Employee e1 = new Employee("Urvashi", 20, 18000);
        Employee e2 = new Employee("Rahul", 25, 40000);
        Employee e3 = new Employee("Priya", 30, 60000);

        e1.displayInformation();
        e1.calculateTax();

        e2.displayInformation();
        e2.calculateTax();

        e3.displayInformation();
        e3.calculateTax();
    }
}
