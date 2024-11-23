package animals;

public class Blowfish extends Fish {
    private String defenseMechanism;

    public Blowfish() {
        super();
        this.defenseMechanism = "Unknown";
    }

    public Blowfish(String name, int age, double weight, String scaleType, String defenseMechanism) {
        super(name, age, weight, scaleType);
        this.defenseMechanism = defenseMechanism;
    }

    public Blowfish(String name, String defenseMechanism) {
        super(name);
        this.defenseMechanism = defenseMechanism;
    }

    @Override
    public String getVoice() {
        return "Puff";
    }

    public String getDefenseMechanism() {
        return defenseMechanism;
    }

    public void setDefenseMechanism(String defenseMechanism) {
        this.defenseMechanism = defenseMechanism;
    }

    @Override
    public String toString() {
        return super.toString() + ", Blowfish{defenseMechanism='" + defenseMechanism + "'}";
    }

    public void inflate() {
        System.out.println(name + " is inflating.");
    }
}
