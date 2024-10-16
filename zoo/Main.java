public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Simba", 5);
        Tiger tiger = new Tiger("Raja", 3);

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);

        zoo.feedingTime();
    }
}
