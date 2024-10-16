import java.util.Scanner;

public class Menu {
    private String[] options;

    public Menu(String[] options) {
        this.options = options;
    }

    public int displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ": " + options[i]);
        }
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}