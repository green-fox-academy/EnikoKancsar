public class Cuboid {
    public static void main(String[] args) {
        double length = 10.0;
        double height = 10.0;
        double width = 10.0;

        System.out.println("Surface Area: " + 2 * (length * height + length * width + height * width));
        System.out.println("Volume: " + length * height * width);
    }
}
