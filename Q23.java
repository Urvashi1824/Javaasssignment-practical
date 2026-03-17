class Employee {
    int id;
    String name;
    double salary;
    String department;

    // Parameterized Constructor
    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Copy Constructor
    Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
        this.department = e.department;
    }

    // Method to display details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Original object
        Employee emp1 = new Employee(101, "Urvashi", 50000, "HR");

        // Copy object using copy constructor
        Employee emp2 = new Employee(emp1);

        // Modify copied object's department
        emp2.department = "IT";

        // Display both objects
        System.out.println("Original Employee:");
        emp1.display();

        System.out.println("Copied Employee (Modified):");
        emp2.display();
    }
}
