public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        Flower yellowFlower = new Flower("yellow", 4);
        garden.add(yellowFlower);
        Flower blueFlower = new Flower ("blue", 4);
        garden.add(blueFlower);
        Tree purpleTree = new Tree("purple", 4);
        garden.add(purpleTree);
        Tree orangeTree = new Tree("orange", 4);
        garden.add(orangeTree);

        garden.currentState();
        garden.watering(40);
        garden.currentState();
        garden.watering(70);
        garden.currentState();
    }
}
