import java.util.ArrayList;
import java.util.List;

class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }

    public void removeAnimal(String name) {
        Animal animalToRemove = null;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animalToRemove = animal;
                break;
            }
        }
        if (animalToRemove != null) {
            animals.remove(animalToRemove);
            System.out.println(animalToRemove.getName() + " has been removed from the zoo.");
        } else {
            System.out.println("No animal with the name " + name + " found in the zoo.");
        }
    }

    public void feedingTime() {
        System.out.println("Feeding time! Here are the animals:");
        for (Animal animal : animals) {
            animal.talk();
        }
    }
}