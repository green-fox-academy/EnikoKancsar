import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    public static String makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> matches = new ArrayList<>();
        int i = 0;
        while (i < girls.size() && i < boys.size()) {
            matches.add(girls.get(i));
            matches.add(boys.get(i));
            i++;
        }
        while (i < girls.size()) {
            matches.add(girls.get(i));
            i++;
        }
        while (i < boys.size()) {
            matches.add(boys.get(i));
            i++;
        }
        return String.join(", ", matches);
    }
}