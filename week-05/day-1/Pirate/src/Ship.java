import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> pirates;

    public Ship() {
        this.pirates = new ArrayList<>();
    }

    public void fillShip() {
        Pirate captain = new Pirate();
        pirates.add(captain);
        int numberOfPirates = (int)(Math.random() * 10 + 1);
        for (int i = 0; i < numberOfPirates; i++) {
            Pirate pirate = new Pirate();
            pirates.add(pirate);
        }
    }

    public int numberOfAlivePirates() {
        int counter = 0;
        for (Pirate pirate : pirates) {
            if (pirate.getIsAlive()) {
                counter++;
            }
        }
        return counter;
    }

    public void printShip() {
        pirates.get(0).printPirate();
        System.out.println("He's the captain.");
        System.out.println(numberOfAlivePirates() + " alive pirates in the crew.");
    }

    private void battleRandomLosses() {
        for (int i = 1; i < (int)(Math.random() * pirates.size() + 1); i++) {
            pirates.get(i).die();
        }
    }

    private void battleRandomRum() {
        for (Pirate pirate : pirates) {
            pirate.drinkSomeRum((int)(Math.random() * 10 + 1));
        }
    }

    public boolean battle(Ship otherShip) {
        boolean thisWins = (numberOfAlivePirates() - pirates.get(0).getRumLevel()) >
                (otherShip.numberOfAlivePirates() - otherShip.pirates.get(0).getRumLevel());
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
    /*
    Ships should have a method to battle other ships: ship.battle(otherShip)
    should return true if the actual ship (this) wins
    the ship should win if its calculated score is higher
    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    The loser crew has a random number of losses (deaths).
    The winner captain and crew has a party, including a random number of rum :)
    */
}