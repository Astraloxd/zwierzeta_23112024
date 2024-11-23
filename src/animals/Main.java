package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Dog("Buddy", 3, 20.5, "Short", "Labrador");
        animals[1] = new Pigeon("Dove", 1, 0.5, "White", "Rock Pigeon");
        animals[2] = new Blowfish("Bloaty", 2, 1.2, "Smooth", "Inflation Defense");
        animals[3] = new Mammal("Bear", 5, 150.0, "Thick");
        animals[4] = new Bird("Robin", 2, 0.7, "Red");
        animals[5] = new Fish("Goldie", 1, 0.3, "Shiny");

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println("Voice: " + animal.getVoice());
            animal.eat();
        }

        ((Dog) animals[0]).fetch();
        ((Pigeon) animals[1]).peck();
        ((Blowfish) animals[2]).inflate();
    }
}
