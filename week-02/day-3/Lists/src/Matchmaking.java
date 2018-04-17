import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    public static String makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        String matches = "";
        for (int i = 0; i < girls.size() - 1; i++) {
                matches += "\"" + girls.get(i) + "\", ";
                matches += "\"" + boys.get(i) + "\", ";
        }
        matches += "\"" + girls.get(girls.size() - 1) + "\", ";
        matches += "\"" + boys.get(boys.size() - 1) + "\"";
        return matches;
    }
}