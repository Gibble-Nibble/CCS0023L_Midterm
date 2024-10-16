import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Menu menu = new Menu(new String[] {
            "Add Lion",
            "Add Tiger",
            "Remove Animal",
            "Feeding Time",
            "Exit"
        });

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = menu.displayMenu();
            switch (choice) {
                case 0: // Add Lion
                    zoo.addAnimal(new Lion("Simba", 5));
                    break;
                case 1: // Add Tiger
                    zoo.addAnimal(new Tiger("Shere", 4));
                    break;
                case 2: // Remove Animal
                    System.out.print("Enter the name of the animal to remove: ");
                    String name = scanner.next();
                    zoo.removeAnimal(name);
                    break;
                case 3: // Feeding Time
                    zoo.feedingTime();
                    break;
                case 4: // Exit
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}