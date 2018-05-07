import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();

        Domino tmp;
        for (int i = 0; i < dominoes.size() - 1; i++) {
            for (int j = i; j < dominoes.size(); j++) {
                if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
                    tmp = dominoes.get(i + 1);
                    dominoes.set(i + 1, dominoes.get(j));
                    dominoes.set(j, tmp);
                    break;
                }
            }
        }

        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}