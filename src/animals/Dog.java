package animals;

public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furType, String breed) {
        super(name, age, weight, furType);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String getVoice() {
        return "Bark";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dog{breed='" + breed + "'}";
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}
