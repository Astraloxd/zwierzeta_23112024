package animals;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, boolean hasFur, String breed) {
        super(name, age, weight, hasFur);
        this.breed = breed;
    }

    public Dog(String name, double weight, String breed) {
        super(name, weight, true);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " barks.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps in a kennel.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs on four paws.");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Dog{breed='" + breed + "'}";
    }
}
