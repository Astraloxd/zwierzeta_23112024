package animals;

public class Mammal extends animals.Animal {
    private String furType;

    public Mammal() {
        super(name);
        this.furType = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furType) {
        super(name, age, weight);
        this.furType = furType;
    }

    public Mammal(String name) {
        super(name);
        this.furType = furType;
    }

    @Override
    public String getVoice() {
        return "Mammal sound";
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mammal{furType='" + furType + "'}";
    }

    public void run() {
        System.out.println(name + " is running.");
    }
}
