package animals;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name);
        this.species = species;
    }

    @Override
    public String getVoice() {
        return "Coo";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pigeon{species='" + species + "'}";
    }

    public void peck() {
        System.out.println(name + " is pecking.");
    }
}
