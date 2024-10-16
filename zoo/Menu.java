import java.util.Scanner;

public class Menu {
    private String[] options;
    private Scanner scanner;
  
    public Menu(String[] options) {
        this.options = options;
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        while (true) {
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Enter your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 && choice <= options.length) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
