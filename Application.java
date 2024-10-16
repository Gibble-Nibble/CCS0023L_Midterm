public class Menu {
    private String[] menuItems;

    public Menu(String[] menuItems) {
        this.menuItems = menuItems;
    }

    public int displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i]);
        }
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(System.console().readLine());
        while (choice < 1 || choice > menuItems.length) {
            System.out.print("Invalid choice. Enter again: ");
            choice = Integer.parseInt(System.console().readLine());
        }
        return choice;
    }
}
