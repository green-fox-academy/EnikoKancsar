public class Animal {
    private int hunger;
    private int thirst;

    public Animal() {
        hunger = 50;
        thirst = 50;
    }

    public int getHunger() {
        return hunger;
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }
}
