class StudentGradeCons {
    String name;
    int marks1, marks2, marks3;
    double average;

    // Parameterized Constructor
    StudentGradeCons(String name, int m1, int m2, int m3) {
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Method to calculate average
    double calculateAverage() {
        average = (marks1 + marks2 + marks3) / 3.0;
        return average;
    }

    // Method to assign grade
    String getGrade() {
        if (average >= 90)
            return "A";
        else if (average >= 75)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "F";
    }

    // Display method (calls other methods)
    void display() {
        calculateAverage();  // calling method
        String grade = getGrade();  // calling method

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        StudentGradeCons s1 = new StudentGradeCons("Urvashi", 85, 90, 88);
        StudentGradeCons s2 = new StudentGradeCons("Rahul", 60, 70, 65);
        StudentGradeCons s3 = new StudentGradeCons("Priya", 40, 50, 45);

        s1.display();
        s2.display();
        s3.display();
    }
}
