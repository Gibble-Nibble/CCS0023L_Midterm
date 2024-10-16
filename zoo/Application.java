public class Application {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Menu menu = new Menu(new String[]{"Add animal", "Remove animal", "Feeding time", "Exit"});

        while (true) {
            int choice = menu.displayMenu();
            switch (choice) {
                case 1:
                    // Add animal
                    System.out.print("Enter animal type (Lion/Tiger): ");
                    String animalType = menu.scanner.nextLine();
                    System.out.print("Enter animal name: ");
                    String animalName = menu.scanner.nextLine();
                    System.out.print("Enter animal age: ");
                    int animalAge = Integer.parseInt(menu.scanner.nextLine());
                    if (animalType.equalsIgnoreCase("Lion")) {
                        zoo.addAnimal(new Lion(animalName, animalAge));
                    } else if (animalType.equalsIgnoreCase("Tiger")) {
                        zoo.addAnimal(new Tiger(animalName, animalAge));
                    }
                    break;
                case 2:
                    // Remove animal
                    System.out.print("Enter animal name: ");
                    String removeAnimalName = menu.scanner.nextLine();
                    for (Animal animal : zoo.animals) {
                        if (animal.getName().equals(removeAnimalName)) {
                            zoo.removeAnimal(animal);
                            break;
                        }
                    }
                    break;
                case 3:
                    // Feeding time
                    zoo.feedingTime();
                    break;
                case 4:
                    // Exit
                    System.exit(0);
                    break;
            }
        }
    }
}
