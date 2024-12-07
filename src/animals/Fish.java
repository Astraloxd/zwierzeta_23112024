package animals;

public abstract class Fish extends Animal {
    private static final Object name = ;
    private String scaleType;

    public Fish(String name) {
        super(name);
        this.scaleType = "Unknown";
    }

    public Fish(String name, int age, double weight, String scaleType) {
        super(name, age, weight);
        this.scaleType = scaleType;
    }

    public Fish(String name) {
        super(name);
        this.scaleType = scaleType;
    }

    @Override
    public String getVoice() {
        return "Blub";
    }

    public String getScaleType() {
        return scaleType;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fish{scaleType='" + scaleType + "'}";
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
