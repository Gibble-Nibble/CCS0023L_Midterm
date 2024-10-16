public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("I am a Lion named " + getName() + " and I am " + getAge() + " years old.");
    }
}
