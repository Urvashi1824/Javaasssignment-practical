import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Rows: ");
        int rows = sc.nextInt();

        int num = 1; // starting number

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println(); // move to next line
        }

        sc.close();
    }
}
