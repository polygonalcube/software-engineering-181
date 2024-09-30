public class Cat extends Animal {

    public Cat(double weight) {
        super(weight);
    }

    @Override
    String speak() {
        return "meow";
    }
}
