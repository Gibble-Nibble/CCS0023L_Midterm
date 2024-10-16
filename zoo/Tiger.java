public class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("I am a tiger, my name is " + getName() + " and I am " + getAge() + " years old.");
    }
}
