public class Dog extends Animal {

    public Dog(double weight) {
        super(weight);
    }

    @Override
    String speak() {
        return "bark";
    }
}
