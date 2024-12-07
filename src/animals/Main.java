package animals;

public class Main {
    public static void main(String[] args) {
        // Tablica referencji Animal
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 5, 20.5, true, "Labrador");
        animals[1] = new Pigeon("Sky", 2, 0.4, "White", "Carrier");
        animals[2] = new Blowfish("Puffy", 1, 1.2, true, true);

        // Pętla foreach dla metody move()
        System.out.println("Animal Movement:");
        for (Animal animal : animals) {
            ((AnimalMove) animal).move();
        }

        // Tablica referencji AnimalBehavior
        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = (Dog) animals[0];
        behaviors[1] = (Pigeon) animals[1];
        behaviors[2] = (Blowfish) animals[2];

        // Wywołanie metody sleep()
        System.out.println("\nAnimal Sleep Behavior:");
        for (AnimalBehavior behavior : behaviors) {
            behavior.sleep();
        }

        // Wywołanie metody name()
        System.out.println("\nAnimal Names:");
        for (Animal animal : animals) {
            AnimalName.name(animal.getName());
        }
    }
}
