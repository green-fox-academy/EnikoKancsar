public class Pirate {
    private String name;
    private boolean isAlive;
    private int rumLevel;
    private Parrot parrot;

    public Pirate() {
        name = "unknown";
        isAlive = true;
        rumLevel = 0;
        parrot = new Parrot();
    }

    public Pirate(String name, int rumLevel) {
        this.name = name;
        isAlive = true;
        this.rumLevel = rumLevel;
        parrot = new Parrot();
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public int getRumLevel() {
        return rumLevel;
    }

    public void printPirate() {
        System.out.println(name + " is " + (isAlive ? " alive. " : " dead. ") + "He drank " + rumLevel + " rum.");
    }

    public void printIsAlive() {
        if (isAlive == true) {
            System.out.println(this.name + " is alive.");
        } else {
            System.out.println(this.name + " is dead.");
        }
    }

    public void drinkSomeRum(int amountOfRum) {
        if (isAlive == true) {
            rumLevel += amountOfRum;
        } else {
            System.out.println("He's dead.");
        }
    }

    public void howsItGoingMate() {
        if (isAlive == false) {
            System.out.println("He's dead.");
        } else if (rumLevel < 5) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            rumLevel = 0;
        }
    }

    public void die() {
        isAlive = false;
    }

    public void brawl(Pirate anotherPirate) {
        int karma = (int)(Math.random() * 3);
        if (karma == 0) {
            this.die();
        } else if (karma == 1) {
            anotherPirate.die();
        } else {
            this.die();
            anotherPirate.die();
        }
        this.printIsAlive();
        anotherPirate.printIsAlive();
    }

    public static void main(String[] args) {

    }
}