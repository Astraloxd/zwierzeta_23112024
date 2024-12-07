package animals;

public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    private boolean canInflate;

    public Blowfish() {
        super(name);
        this.canInflate = true;
    }

    public Blowfish(String name, int age, double weight, boolean hasScales, boolean canInflate) {
        super(name, age, weight, hasScales);
        this.canInflate = canInflate;
    }

    public Blowfish(String name, double weight, boolean canInflate) {
        super(name, weight, true);
        this.canInflate = canInflate;
    }

    public boolean isCanInflate() {
        return canInflate;
    }

    public void setCanInflate(boolean canInflate) {
        this.canInflate = canInflate;
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps while floating in water.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims in water.");
    }

    public void inflate() {
        System.out.println(getName() + " is inflating itself.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Blowfish{canInflate=" + canInflate + "}";
    }
}
