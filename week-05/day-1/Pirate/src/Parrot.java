public class Parrot {
    private String name;
    private int age;
    private String color;

    public Parrot() {
        name = "Rob";
        age = 1;
        color = "red";
    }

    public Parrot(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void talk() {
        System.out.println("Imma a parrot, I can talk!");
    }
}
