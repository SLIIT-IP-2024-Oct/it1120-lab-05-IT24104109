import java.util.Scanner;

public class IT24104109Lab5Q3 {
    public static void main(String[] args) {
        // Constants
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_10_PERCENT = 10;
        final int DISCOUNT_20_PERCENT = 20;

        Scanner scanner = new Scanner(System.in);

        // Input start and end dates
        System.out.print("Enter the start date (1 to 31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1 to 31): ");
        int endDate = scanner.nextInt();

        // Validate the dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return; // Exit the program
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return; // Exit the program
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;

        // Determine discount rate
        double discountRate = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = DISCOUNT_10_PERCENT;
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_20_PERCENT;
        }

        // Calculate total amount
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discount = (totalAmount * discountRate) / 100;
        totalAmount -= discount;

        // Display the results
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + totalAmount);

        scanner.close();
    }
}
