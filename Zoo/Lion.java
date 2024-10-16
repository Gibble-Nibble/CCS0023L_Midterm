class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("I am a Lion. My name is " + name + " and I am " + age + " years old.");
    }
}