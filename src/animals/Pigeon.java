package animals;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, double weight, String species) {
        super(name, weight, "Gray");
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " coos.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps on a tree branch.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies in the sky.");
    }

    public void deliverMessage() {
        System.out.println(getName() + " is delivering a message.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Pigeon{species='" + species + "'}";
    }
}
