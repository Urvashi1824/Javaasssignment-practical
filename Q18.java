import java.util.Scanner;

class Student {
    int enrollmentNo;
    String name;
    String gender;

    // Parameterized Constructor
    Student(int enrollmentNo, String name, String gender) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.gender = gender;
    }

    // Method to display student details
    void display() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Array of Student objects
        Student[] students = new Student[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enrollment No: ");
            int eno = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            // Creating object using parameterized constructor
            students[i] = new Student(eno, name, gender);
        }

        // Display all students
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
