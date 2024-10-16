class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("I am a Tiger. My name is " + name + " and I am " + age + " years old.");
    }
}