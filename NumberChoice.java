import java.util.Scanner;

public class NumberChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options
        System.out.println("Choose a number from the list:");
        System.out.println("1. Say Hello");
        System.out.println("2. Show today's date");
        System.out.println("3. Exit");

        // Get user input
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        // Respond based on choice
        switch (choice) {
            case 1:
                System.out.println("Hello there!");
                break;
            case 2:
                System.out.println("Today's date is: " + java.time.LocalDate.now());
                break;
            case 3:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select between 1 and 3.");
                break;
        }

        scanner.close();
    }
}
