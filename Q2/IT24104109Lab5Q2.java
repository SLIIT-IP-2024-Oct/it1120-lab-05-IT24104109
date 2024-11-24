import java.util.Scanner;

public class IT24104109Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        // Validate the input
        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater.");
        } else {
            String prize;
            // Determine the prize using a switch statement
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Traveling Chair";
                    break;
                default: // For 5 or more members
                    prize = "Headphone";
                    break;
            }
            System.out.println("The prize is a: " + prize);
        }

        scanner.close();
    }
}
