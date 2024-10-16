import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of animal (Lion or Tiger): ");
        String animalType = scanner.nextLine();

        System.out.print("Enter the animal's name: ");
        String animalName = scanner.nextLine();

        System.out.print("Enter the animal's age: ");
        int animalAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Animal animal;
        if (animalType.equalsIgnoreCase("Lion")) {
            animal = new Lion(animalName, animalAge);
        } else if (animalType.equalsIgnoreCase("Tiger")) {
            animal = new Tiger(animalName, animalAge);
        } else {
            System.out.println("Invalid animal type. Exiting.");
            return;
        }

        zoo.addAnimal(animal);

        zoo.feedingTime();
    }
}
