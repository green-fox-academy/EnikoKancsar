import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
    Sum sum = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();


    @Test
    public void testSumWithEmptyList() {
        numbers = new ArrayList<>(Arrays.asList());
        int expectedResult = 0;
        int actualResult = sum.sum(numbers);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumWithOneElementList() {
        numbers = new ArrayList<>(Arrays.asList(8));
        int expectedResult = 8;
        int actualResult = sum.sum(numbers);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSum() {
        numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int expextedResult = 28;
        int actualResult = sum.sum(numbers);
        assertEquals(expextedResult, actualResult);
    }

    @Test
    public void testSumWithNull() {
        numbers = new ArrayList<>();
        int expectedResult = 0;
        int actualResult = sum.sum(numbers);
        assertEquals(expectedResult, actualResult);
    }

}