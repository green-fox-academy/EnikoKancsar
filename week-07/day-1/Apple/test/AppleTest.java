import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    @Test
    public void testGetApple() {
        Apple apple = new Apple();
        String expectedResult = "apple";
        String actualResult = apple.getApple();
        assertEquals(expectedResult, actualResult);
    }
}