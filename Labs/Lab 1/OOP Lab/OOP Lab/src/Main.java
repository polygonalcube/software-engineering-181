public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        speak("cat");
        speak("dog");
    }

    void speak(String animalType) {
        Animal animal;
        if (animalType.equalsIgnoreCase("cat")) {
            animal = new Cat(1.1);
        } else {
            animal = new Dog(3.5);
        }
        System.out.println(animal.speak());
    }
}
