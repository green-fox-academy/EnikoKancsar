import java.util.ArrayList;

public class Ship {
    private Pirate captain;
    private ArrayList<Pirate> pirates;

    public Ship() {
        this.captain = new Pirate();
        this.pirates = new ArrayList<>();
    }

    public Pirate getCaptain() {
        return captain;
    }

    public void setCaptain(Pirate captain) {
        this.captain = captain;
    }

    public ArrayList<Pirate> getPirates() {
        return new ArrayList<>(pirates);
    }

    public void fillShip() {
        Pirate pirate = new Pirate();
        setCaptain(pirate);
        int numberOfPirates = (int)(Math.random() * 10 + 1);
        for (int i = 0; i < numberOfPirates; i++) {
            pirate = new Pirate();
            getPirates().add(pirate);
        }
    }

    public int numberOfAlivePirates() {
        int counter = 0;
        for (Pirate currentPirate : getPirates()) {
            if (currentPirate.getIsAlive()) {
                counter++;
            }
        }
        return counter;
    }

    public void printShip() {
        getCaptain().printPirate();
        System.out.println("He's the captain.");
        System.out.println(numberOfAlivePirates() + " alive pirates in the crew.");
    }

    private void battleRandomLosses() {
        for (int i = 1; i < (int)(Math.random() * getPirates().size() + 1); i++) {
            getPirates().get(i).die();
        }
    }

    private void battleRandomRum() {
        for (Pirate currentPirate : getPirates()) {
            currentPirate.drinkSomeRum((int)(Math.random() * 10 + 1));
        }
    }

    public boolean battle(Ship otherShip) {
        boolean thisWins = (numberOfAlivePirates() - getCaptain().getRumLevel()) >
                (otherShip.numberOfAlivePirates() - otherShip.getCaptain().getRumLevel());
        if (thisWins) {
            System.out.println("Your ship won!");
            otherShip.battleRandomLosses();
            battleRandomRum();
        } else {
            System.out.println("Your ship lost.");
            battleRandomLosses();
            otherShip.battleRandomRum();
        }
        return thisWins;
    }
}