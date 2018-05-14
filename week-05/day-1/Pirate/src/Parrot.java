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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printParrot() {
        System.out.println(name + " is " + color + " and " + age + " year(s) old.");
    }

    public void talk() {
        System.out.println("Imma a parrot, I can talk!");
    }
}
