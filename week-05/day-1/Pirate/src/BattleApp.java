public class BattleApp {
    public static void main(String[] args) {
        Pirate pirate = new Pirate("Gerold", 4);

        Pirate pirate2 = new Pirate("Bob", 6);
        pirate.brawl(pirate2);

        Ship ship = new Ship();
        ship.fillShip();
        ship.printShip();

        System.out.println("--------------------------");

        Ship ship2 = new Ship();
        ship2.fillShip();
        ship2.printShip();

        System.out.println("--------------------------");

        ship.battle(ship2);
    }
}
