import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>
                (Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
        // Merészeltem a pontos helyére rakni, mert az elején még odakéri.

    }
    public static String putSaturn(ArrayList<String> list) {
        list.add(5, "Saturn");
        String planets = "";
        for (int i = 0; i < list.size() - 1; i++)
            planets += "\"" + list.get(i) + "\", ";
        planets += "\"" + list.get(list.size() - 1) + "\"";
        return planets;
    }
}