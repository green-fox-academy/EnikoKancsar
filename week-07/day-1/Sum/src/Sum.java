import java.util.ArrayList;

public class Sum {
    public int sum(ArrayList<Integer> numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            counter += numbers.get(i);
        }
        return counter;
    }
}

/*  Create different tests where you
    test your method with an empyt list
    with a list with one element in it
    with multiple elements in it
    with a null
    Run them
    Fix your code if needed*/
