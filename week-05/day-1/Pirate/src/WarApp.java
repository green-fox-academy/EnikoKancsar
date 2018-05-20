public class WarApp {
    public static void main(String[] args) {
        Armada armada1 = new Armada();
        armada1.fillArmada();

        Armada armada2 = new Armada();
        armada2.fillArmada();

        if (armada1.war(armada2)) {
            System.out.println("Your armada won!");
        } else {
            System.out.println("Your armada lost.");
        }
    }
}
