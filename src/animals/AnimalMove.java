package animals;

public interface AnimalMove {
    default void move() {
        System.out.println("Moving as an animal.");
    }
}
