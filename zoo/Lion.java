public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void talk() {
        System.out.println("I am a lion, my name is " + getName() + " and I am " + getAge() + " years old.");
    }
}
