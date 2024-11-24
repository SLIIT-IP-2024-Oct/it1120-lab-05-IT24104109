import java.util.Scanner;

public class IT24104109Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Find the smallest number
        int smallest = Math.min(num1, Math.min(num2, num3));

        // Find the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        // Display the results
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        scanner.close();
    }
}
