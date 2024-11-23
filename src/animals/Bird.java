package animals;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public String getVoice() {
        return "Tweet";
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bird{featherColor='" + featherColor + "'}";
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }
}
