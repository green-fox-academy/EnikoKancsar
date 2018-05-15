import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
    CountLetters countLetters = new CountLetters();

    @Test
    public void testCountLettersAllLettersDifferent() {
        Map<Character, Integer> expectedResult = new HashMap<Character, Integer>();
        expectedResult.put('h', 1);
        expectedResult.put('a', 1);
        expectedResult.put('b', 1);
        Map<Character, Integer> actualResult = countLetters.countLetters("hab");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountLettersTwoLettersTheSame() {
        Map<Character, Integer> expectedResult = new HashMap<Character, Integer>();
        expectedResult.put('a', 2);
        expectedResult.put('b', 1);
        Map<Character, Integer> actualResult = countLetters.countLetters("aab");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountLettersLongWordWithRepeatedLetters() {
        Map<Character, Integer> expectedResult = new HashMap<Character, Integer>();
        expectedResult.put('r', 2);
        expectedResult.put('u', 2);
        expectedResult.put('n', 2);
        expectedResult.put('a', 1);
        expectedResult.put('o', 1);
        expectedResult.put('d', 1);
        Map<Character, Integer> actualResult = countLetters.countLetters("runaround");
        assertEquals(expectedResult, actualResult);
    }

}