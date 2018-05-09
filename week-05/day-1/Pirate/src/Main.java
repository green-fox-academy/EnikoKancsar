public class Main {
    public static void main(String[] args) {
        Pirate pirate = new Pirate();

        pirate.drinkSomeRum();
        System.out.println(pirate.getRumLevel());
        pirate.howsItGoingMate();

        pirate.setRumLevel(7);
        System.out.println(pirate.getRumLevel());
        pirate.howsItGoingMate();

        pirate.die();
        System.out.println(pirate.getRumLevel());
        pirate.howsItGoingMate();
        System.out.println(pirate.getRumLevel());
    }
}
