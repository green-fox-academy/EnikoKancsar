import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private String type;
    private String color;

    public Fox(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Foxy", "Arctic Fox", "green"));
        foxes.add(new Fox("Foxyy", "Pallida", "green"));
        foxes.add(new Fox("Foxyyy", "Bengal fox", "yellow"));
        foxes.add(new Fox("Vuk", "Pallida", "red"));
        foxes.add(new Fox("Vukk", "Red fox", "green"));

        foxes.stream()
                .filter(f -> f.color == "green")
                .forEach(f -> System.out.println(f.getName()));

        System.out.println("------");

        foxes.stream()
                .filter(f -> (f.type == "Pallida" && f.color == "green"))
                .forEach(f -> System.out.println(f.getName()));
    }
}
